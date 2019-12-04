package AP_Exam;

import java.util.ArrayList; 
import java.util.Random;

//Anika & Aashi's ArrayListQuestions
public class ListQuestions2 extends Question
{
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

	

	public int getRandNum()

	{

		Random rand = new Random();

		return(rand.nextInt(10));

	}
}
