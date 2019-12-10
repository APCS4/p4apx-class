package AP_Exam;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  
 * @author Edgar and Andrei.
 * 
 * @Version 1.0
 * 
 **/
public class ArrayListQuestions extends Question
{
	//This creates a list of methods that hold the methods we will be asking about
	private ArrayList<String> methods = new ArrayList<String>(Arrays.asList(new String[] {"list.add(\"Ethan\")","list.remove(2)","list.contains(\"Ethan\")","list.set(2,\"Ethan\")","list.get(1)"}));
	//This creates a list of names to be randomized for the questions
	private ArrayList<String> names = new ArrayList<String>(Arrays.asList(randomizeAnswers(new String[] {"Andrei","Edgar","Jared","Ethan"})));
	char[] letterAnswers = {'A','B','C','D','E'};
	private int questionType;
	private String[] tempAnswers = new String[5]; //Temporary answers so we can maintain original answer
	private String[] shuffledAnswers; //list of randomized answers
	private int answerLoc; //Position of the correct answer
	private int[] order = new int[methods.size()]; //Used to keep track of randomized answers' locations

	public ArrayListQuestions()
	{
		setupQuestion();
	}

	
	public void setupQuestionData()
	{
		questionType = (int) Math.floor(Math.random()*methods.size()); //Choose a random method from Arraylist
		//this.question = "What does " + methods.get(questionType) + " do to list " + names.toString();
		this.question = String.format("What does %s do to list %s", methods.get(questionType), names.toString());

		

		console("ArrayList: " + names.toString() + "\n"); //Console stuffs
		generateAnswers();
	}
	
	private void generateAnswers()
	{
		//generate an ArrayList as answer for methods that need it
		ArrayList<String> answer1 = new ArrayList<String>(names);
		ArrayList<String> answer2 = new ArrayList<String>(names);
		ArrayList<String> answer4 = new ArrayList<String>(names);
		
		//Add Ethan
		answer1.add("Ethan");
		tempAnswers[0] = answer1.toString();
		
		//Remove index 2
		answer2.remove(2);
		tempAnswers[1] = answer2.toString();

		//Check if it contains ethan
		tempAnswers[2] = Boolean.toString(names.contains("Ethan"));
		
		//Set Ethan
		answer4.set(2,"Ethan");
		tempAnswers[3] = answer4.toString();
		
		//Get what is in the second box 
		tempAnswers[4] = names.get(1);
		
		//Once the temporary answers have been randomized we assign it to shuffledAnswers
		shuffledAnswers = randomizeAnswers(tempAnswers);
		
		//console stuffs
		for(int i=0; i<tempAnswers.length; i++)
		{
			console(methods.get(i)+"\n	Answer: "+tempAnswers[i]+"\n");
		}
		//Find where the correct answer is and set AnswerLoc to that index
		for(int i = 0; i < shuffledAnswers.length;i++)
		{
			if (questionType == order[i]) 
				answerLoc = i;
		}

		setAnswers();
	}
	
	private void setAnswers()
	{
		//Set the answers
		this.choiceA = shuffledAnswers[0];
		this.choiceB = shuffledAnswers[1];
		this.choiceC = shuffledAnswers[2];
		this.choiceD = shuffledAnswers[3];
		this.choiceE = shuffledAnswers[4];
		this.answer = shuffledAnswers[answerLoc];
		this.answerKey = letterAnswers[answerLoc];
	}
	
	
	//Shuffles string array
	private String[] randomizeAnswers(String[] answers) 
	{
	    order = new int[answers.length];
		for (int i=0; i<order.length; i++) 
	    {
	    	order[i] = i;
	    }
	    for (int i=0; i<order.length; i++) 
	    {
	        int randomPosition = (int) Math.floor(Math.random()*order.length);
	        int temp = order[i];             
	        order[i] = order[randomPosition];
	        order[randomPosition] = temp;
	    }
		
	    String[] newList = new String[answers.length];
	       
	    for (int i=0; i<newList.length; i++)
	    {
	        newList[i] = answers[order[i]];
	    }
	    return newList;
	}
	
	private void console(String output)
	{
		System.out.println(output);
	}
}


