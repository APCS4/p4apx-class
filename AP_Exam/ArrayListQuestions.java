package AP_Exam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListQuestions extends Question
{
	public ArrayList<String> methods = new ArrayList<String>(Arrays.asList(list(new String[] {"list.add(\"Ethan\");","list.remove(2);","\"list.contains(\"Ethan\");\"","list.set(2,\"Ethan\");","list.clone()"})));
	private int questionType;
	ArrayList<String> answerList = new ArrayList<String>(Arrays.asList(list(new String[] {"Andrei","Edgar","Jared","Ethan"})));
	private String[] tempAnswers;

	public ArrayListQuestions() 
	{
		/*
		 * question
		 * answer
		 * choiceA
		 * choiceB
		 * choiceC
		 * choiceD
		 * choiceE
		 */
		
		questionType = (int) Math.floor(Math.random()*methods.size());
		setupQuestion();
	}

	public void setupQuestion()
	{
		ArrayList<String> answerList = new ArrayList<String>(Arrays.asList(new String[] {"bruh","bruh","bruh"}));
		
		ArrayList<String> answerA = answerList;
		answerA.add("Ethan");
		tempAnswers[0] = answerA.toString();
		
		ArrayList<String> answerB = answerList;
		answerB.remove(2);
		tempAnswers[1] = answerB.toString();
		
		ArrayList<String> answerC = answerList;
		answerC.contains("Ethan");
		tempAnswers[1] = answerC.toString();
		
		
		switch (questionType)
		{
		case 0:
			addMethod();
			break;
		case 1:
			removeMethod();
			break;
		case 2:
			containsMethod();
			break;
		case 3:
			setMethod();
			break;
		case 4:
			cloneMethod();
			break;
		default:
			break;
		}
	}

	private void cloneMethod() 
	{
		// TODO Auto-generatasdadasded method stub
		
	}

	private void setMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void containsMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void removeMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void addMethod() 
	{
		this.question = "What does " + methods.get(questionType) + " do to list {\"bruh\",\"bruh\",\"bruh\"}";
		
		
	}
	
	Random rgen = new Random();
	   
	public int[] shuffleNumbers(int amount, int min)
	{
	    int[] cards = new int[amount];
	
	    for (int i=min; i<amount; i++) 
	    {
	        cards[i-min] = i;
	    }
	
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
