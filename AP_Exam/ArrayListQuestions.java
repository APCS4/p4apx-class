package AP_Exam;

import java.util.ArrayList; 

import java.util.Random;


public class ArrayListQuestions extends Question
{
	public ArrayList<String> methods = new ArrayList<String>(Arrays.asList(list(new String[] {"list.add(\"Ethan\");","list.remove(2);","\"list.contains(\"Ethan\");\"","list.set(2,\"Ethan\");","list.clone()"})));
	private int questionType;
	ArrayList<String> answerList = new ArrayList<String>(Arrays.asList(list(new String[] {"Andrei","Edgar","Jared","Ethan"})));
	private String[] tempAnswers;


public class ArrayListQuestions extends Question 

{

	

	public ArrayListQuestions()

	{

		


	public ArrayListQuestions() 
	{
		/*
		 * question//
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

		

		Random random = new Random(); 

		int num1=getRandNum();

		int num2=getRandNum();

		int num3=getRandNum();

		int num4=getRandNum();

		

		this.question = String.format("What is the output of the following code segment:\nlist.add(" +num1

				+ ");\nlist.add(" +num2

				+ ");\n list.remove(1); \nlist.add("+ num3

				+"\n list.set(2,"+num4+");");

		 

		 

	


		// int correct = random.nextInt(5);

		ArrayList<Integer> choice1 = new ArrayList<Integer>();

		choice1.add(num1);

		choice1.add(num2);

		choice1.remove(1); 

		choice1.add(num3); 

		choice1.set(2, num4); 

		ArrayList<Integer> choice2 = new ArrayList<Integer>();

		ArrayList<Integer> choice3 = new ArrayList<Integer>();

		ArrayList<Integer> choice4 = new ArrayList<Integer>();

		ArrayList<Integer> choice5 = new ArrayList<Integer>();




	Random rgen = new Random();
	   
	public int[] shuffleNumbers(int amount, int min)
	{
	    int[] cards = new int[amount];


	 int randnum = random.nextInt(5);

	 switch (randnum)

	 {

	 	case 0:

	 		this.choiceA = String.format(String.valueOf(choice1));

	 		this.choiceB = String.format(String.valueOf(choice2));

	 		this.choiceC = String.format(String.valueOf(choice3));

	 		this.choiceD = String.format(String.valueOf(choice4));

	 		this.choiceE = String.format(String.valueOf(choice5));

	 		



	 		break;

	 	case 1:

	 		this.choiceA = String.format(String.valueOf(choice2));

	 		this.choiceB = String.format(String.valueOf(choice3));

	 		this.choiceC = String.format(String.valueOf(choice4));

	 		this.choiceD = String.format(String.valueOf(choice5));

	 		this.choiceE = String.format(String.valueOf(choice1));





	 		break;

	 	case 2:

	 		this.choiceA = String.format(String.valueOf(choice3));

	 		this.choiceB = String.format(String.valueOf(choice2));

	 		this.choiceC = String.format(String.valueOf(choice3));

	 		this.choiceD = String.format(String.valueOf(choice4));

	 		this.choiceE = String.format(String.valueOf(choice5));



	 		break;

	 	case 3:

	 		this.choiceA = String.format(String.valueOf(choice4));

	 		this.choiceB = String.format(String.valueOf(choice4));

	 		this.choiceC = String.format(String.valueOf(choice3));

	 		this.choiceD = String.format(String.valueOf(choice3));

	 		this.choiceE = String.format(String.valueOf(choice5));



	 		break;

	 	case 4:

	 		this.choiceA = String.format(String.valueOf(choice5));

	 		this.choiceB = String.format(String.valueOf(choice4));

	 		this.choiceC = String.format(String.valueOf(choice3));

	 		this.choiceD = String.format(String.valueOf(choice3));

	 		this.choiceE = String.format(String.valueOf(choice5));



	 		break;

		 

	 }

	 



		

	}

	}

	public int getRandNum()

	{

		Random rand = new Random();

		return(rand.nextInt(10));

	}


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

