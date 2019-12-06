package AP_Exam;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListQuestions extends Question
{
	private ArrayList<String> methods = new ArrayList<String>(Arrays.asList(new String[] {"list.add(\"Ethan\")","list.remove(2)","list.contains(\"Ethan\")","list.set(2,\"Ethan\")","list.get(1)"}));
	private ArrayList<String> names = new ArrayList<String>(Arrays.asList(list(new String[] {"Andrei","Edgar","Jared","Ethan"})));
	char[] letterAnswers = {'A','B','C','D','E'};
	private int questionType;
	private String[] tempAnswers = new String[5];
	private String[] shuffledAnswers;
	private int answerLoc;

	public ArrayListQuestions()
	{
		questionType = (int) Math.floor(Math.random()*methods.size());
		setupQuestion();
	}

	
	public void setupQuestion()
	{
		this.question = "What does " + methods.get(questionType) + " do to list " + names.toString();
		console("ArrayList: " + names.toString() + "\n");
		generateAnswers();
	}
	
	private void generateAnswers()
	{
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
		
		shuffledAnswers = list(tempAnswers);
		
		for(int i=0; i<tempAnswers.length; i++)
		{
			console(methods.get(i)+"\n	Answer: "+tempAnswers[i]+"\n	"+letterAnswers[order[i]]);
		}
		
		for(int i = 0; i < shuffledAnswers.length;i++)
		{
			if (questionType == order[i]) answerLoc = i;
		}

		setAnswers();
	}
	
	private void setAnswers()
	{
		this.choiceA = shuffledAnswers[0];
		this.choiceB = shuffledAnswers[1];
		this.choiceC = shuffledAnswers[2];
		this.choiceD = shuffledAnswers[3];
		this.choiceE = shuffledAnswers[4];
		this.answer = shuffledAnswers[answerLoc];
		this.answerKey = letterAnswers[answerLoc];
	}
	
	//Shuffling Methods
	private int[] shuffleNumbers(int amount)
	{
	    int[] cards = new int[amount];
	    
	    for (int i=0; i<cards.length; i++) 
	    {
	        cards[i] = i;
	    }

	    for (int i=0; i<cards.length; i++) 
	    {
	        int randomPosition = (int) Math.floor(Math.random()*cards.length);
	        int temp = cards[i];             
	        cards[i] = cards[randomPosition];
	        cards[randomPosition] = temp;
	    }
	    return cards;
	}
	
	int[] order;
	
	//Shuffles string array
	private String[] list(String[] answers) 
	{
	    String[] newList = new String[answers.length];
	    order = shuffleNumbers(answers.length);
	       
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

