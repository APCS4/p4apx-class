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
		

		this.question = String.format("What is the value stored in list when:\nArrayList<Integer> list = new ArrayList<Integer>();\nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.add(%d); \nlist.remove(2); \nlist.add(%d); \nlist.add(%d); \n list.remove(1); \nlist.set(1, %d);", num1, num2, num3, num4, num5, num6, num6);
		

		this.choiceA= String.format("[%d, %d, %d, %d, %d]", num1, num6, num4, num5, num6);
		//problem- can't display out the whole arraylist and the above method of displaying works best
		/*
		//create correct array
		//if num 1=1, num2=2, num3=3, etc... this algo will will create an array like [1,6,4,5,6] 
		ArrayList<Integer> correct = new ArrayList<Integer>();
		correct.add(num1);
		correct.add(num2);
		correct.add(num3);
		correct.add(num4);
		correct.remove(2); 
		correct.add(num5);
		correct.add(num6);
		correct.remove(1); 
		correct.set(1, num6); 

		//create wrong arrays
		ArrayList<Integer> wrong1 = new ArrayList<Integer>();
		
		wrong1.add(num2); 
		wrong1.add(num3); 
		wrong1.add(num4); 
		wrong1.add(num5); 
		wrong1.add(num6); 
		wrong1.remove(3);
		wrong1.set(0, num6); 

		ArrayList<Integer> wrong2 = new ArrayList<Integer>();
		
		wrong2.add(num1); 
		wrong2.add(num2);
		wrong2.add(num3);
		wrong2.add(num4); 
		wrong2.remove(2);
		wrong2.add(num5); 
		wrong2.add(num6);
		wrong2.set(1,num6); 
		
		
		ArrayList<Integer> wrong3 = new ArrayList<Integer>();
		
		wrong3.add(num1);
		wrong3.add(num2); 
		wrong3.add(num3);
		wrong3.add(num4); 
		wrong3.add(num5); 
		wrong3.add(num6); 
		wrong3.remove(2); 
		wrong3.set(1, num6);
		wrong3.remove(1);

		ArrayList<Integer> wrong4 = new ArrayList<Integer>();

		wrong4.add(num2);
		wrong4.add(num4);
		wrong4.add(num6); 
		wrong4.add(num1);
		wrong4.remove(2);
		wrong4.add(num3);
		wrong4.add(num5);
		wrong4.remove(2);
		wrong4.set(1, num5);
		
	

	//generates a random number between 0-4 to determine where the correct answer will be (Letter A, B, C, D, or E)
	int random = rand.nextInt(5);

	 switch (random)

	 {

	 	case 0: //correct at letter a
	 		this.choiceA = String.format("%d", correct);
	 		this.choiceB = String.format("%d", wrong1);
	 		this.choiceC = String.format("%d", wrong2);
	 		this.choiceD = String.format("%d", wrong3);
	 		this.choiceE = String.format("%d", wrong4);
	 		
	 		this.answer = String.format("%d", correct);
	 		
	 		this.answerKey = this.answerA; //not sure if this is correct??
	 		break;
	 		//in this case, we must say answer a is correct. "if user enters a, output 'correct!'
	 	case 1: //correct at letter b
	 		this.choiceA = String.format("%d", wrong1);
	 		this.choiceB = String.format("%d", correct);
	 		this.choiceC = String.format("%d", wrong2);
	 		this.choiceD = String.format("%d", wrong3);
	 		this.choiceE = String.format("%d", wrong4);
	 		
	 		this.answer = String.format("%d", correct);
	 		
	 		this.answerKey = this.answerB; 
	 		break;
	 		//in this case, we must have output "correct!" if user enters b
	 		
	 	case 2: //correct at letter c
	 		this.choiceA = String.format("%d", wrong1);
	 		this.choiceB = String.format("%d", wrong2);
	 		this.choiceC = String.format("%d", correct);
	 		this.choiceD = String.format("%d", wrong3);
	 		this.choiceE = String.format("%d", wrong4);
	 		
	 		this.answer = String.format("%d", correct);
	 		
	 		this.answerKey = this.answerC; 
	 		break;
	 		//in this case, we must have output "correct" if user enters c
	 		
	 	case 3: //correct at letter d

	 		this.choiceA = String.format("%d", wrong1);
	 		this.choiceB = String.format("%d", wrong2);
	 		this.choiceC = String.format("%d", wrong3);
	 		this.choiceD = String.format("%d", correct);
	 		this.choiceE = String.format("%d", wrong4);
	 		
	 		this.answer = String.format("%d", correct);
	 		
	 		this.answerKey = this.answerD; 
	 		break;
	 		//in this case, we must have output "correct" if user enters d
	 		
	 	case 4: //correct at letter e
	 		this.choiceA = String.format("%d", wrong1);
	 		this.choiceB = String.format("%d", wrong2);
	 		this.choiceC = String.format("%d", wrong3);
	 		this.choiceD = String.format("%d", wrong4);
	 		this.choiceE = String.format("%d", correct);
	 		
	 		this.answer = String.format("%d", correct);
	 		
	 		this.answerKey = this.answerE; 
	 		break;
	 		//in this case, we must have output "correct" if user enters e
	 }	
		
*/
}

}
