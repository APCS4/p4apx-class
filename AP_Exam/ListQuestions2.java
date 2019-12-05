package AP_Exam;

import java.util.ArrayList; 
import java.util.Random;

//Anika & Aashi's ArrayListQuestions
public class ListQuestions2 extends Question
{
	public ListQuestions2()
	{
		setupQuestion();
	}
	

	public int getRandNum() //method to generate random numbers to fill the arrays
	{
		Random rand = new Random();
		return(rand.nextInt(10));
	}
	
	public void setupQuestion()
	{
		Random rand = new Random(); 

		//getting random numbers to fill array
		int num1=getRandNum(), num2=getRandNum(), num3=getRandNum(), num4=getRandNum(), num5 = getRandNum(), num6 = getRandNum();
		

		this.question = String.format("What is the value stored in list when:\nArrayList<Integer> list = new ArrayList<Integer>();\nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.remove(2); \nlist.add(%d); \nlist.add(%d); \nlist.remove(1); \nlist.set(1, %d);", num1, num2, num3, num4, num5, num6, num6);
		
		//correct answer
		this.choiceA= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
		this.answer =  String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
		
		this.choiceB = String.format("[%d, %d, %d, %d, %d]", num2, num4, num4, num5, num6);
		this.choiceC = String.format("[%d, %d, %d, %d, %d]", num1, num3, num4, num2, num3);
		this.choiceD = String.format("[%d, %d, %d, %d, %d]", num2, num6, num4, num1, num6);
		this.choiceE = String.format("[%d, %d, %d, %d, %d]", num3, num6, num4, num5, num6);

}

}
