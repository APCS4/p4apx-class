package AP_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class ArrayListQuestions extends Question
//
{
	private ArrayList<String> methods = new ArrayList<String>(Arrays.asList(new String[] {"list.add(\"Ethan\");","list.remove(2);","\"list.contains(\"Ethan\");\"","list.set(2,\"Ethan\");","list.get(1)"}));
	private ArrayList<String> names = new ArrayList<String>(Arrays.asList(list(new String[] {"Andrei","Edgar","Jared","Ethan"})));
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
		generateAnswers();
	}
	
	private void generateAnswers()
	{
		ArrayList<String> answer1 = names;
		answer1.add("Ethan");
		tempAnswers[0] = answer1.toString();
		
		ArrayList<String> answer2 = names;
		answer2.remove("Ethan");
		tempAnswers[1] = answer2.toString();

		tempAnswers[2] = Boolean.toString(names.contains("Ethan"));
		
		ArrayList<String> answer4 = names;
		answer4.set(2,"Ethan");
		tempAnswers[3] = answer4.toString();

		tempAnswers[4] = names.get(1);
		
		shuffledAnswers = list(tempAnswers);
		
		for(int i = 0; i<shuffledAnswers.length;i++)
		{
			if (questionType == order[i]) answerLoc = i;
		}
		
		char[] letterAnswers = {'A','B','C','D','E'};		
		
		choiceA = shuffledAnswers[0];
		choiceB = shuffledAnswers[1];
		choiceC = shuffledAnswers[2];
		choiceD = shuffledAnswers[3];
		choiceE = shuffledAnswers[4];
		answerKey = letterAnswers[answerLoc];
		answer = shuffledAnswers[answerLoc];
	}

	Random rgen = new Random();
	   
	public int[] shuffleNumbers(int amount, int min)
	{
	    int[] cards = new int[amount];

	    for (int i=0; i<cards.length; i++) 
	    {
	        int randomPosition = rgen.nextInt(cards.length); 
	        int temp = cards[i];             
	        cards[i] = cards[randomPosition];
	        cards[randomPosition] = temp;
	    }
	    return cards;
	}
	
	int[] order;
	public String[] list(String[] answers) 
	{
	    String[] newList = new String[answers.length];
	    order = shuffleNumbers(answers.length,0);
	       
	    for (int i=0; i<newList.length; i++)
	    {
	        newList[i] = answers[order[i]];
	    }
	    return newList;
	}
}

