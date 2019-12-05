package AP_Exam;

import java.util.ArrayList; 
import java.util.Random;

//Anika & Aashi's ArrayListQuestions
public class ListQuestions2 extends Question
{
	public void setupQuestion()

	{

		

		Random rand = new Random(); 

		//getting random numbers to fill array
		int num1=getRandNum(), num2=getRandNum(), num3=getRandNum(), num4=getRandNum(), num5 = getRandNum(), num6 = getRandNum();
		

		this.question = String.format("What is the output of the following code segment:\nlist.add(" +num1

				+ ");\nlist.add(" +num2
				+ ");\nlist.add(" +num3
				+ ");\nlist.add(" +num4
				+ ");\nlist.remove(2)"
				+ ");\nlist.add(" +num5
				+ ");\nlist.add(" +num6
				+ ");\n list.remove(1); \nlist.set(1, "+ num6+");");
		
		

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
	 		this.choiceA = String.format(String.valueOf(correct));
	 		this.choiceB = String.format(String.valueOf(wrong1));
	 		this.choiceC = String.format(String.valueOf(wrong2));
	 		this.choiceD = String.format(String.valueOf(wrong3));
	 		this.choiceE = String.format(String.valueOf(wrong4));
	 		
	 		answer = this.choiceA;
	 		this.answerKey = this.answerA; //not sure if this is correct??
	 		break;
//in this case, we must say answer a is correct. "if user enters a, output 'correct!'
	 	case 1: //correct at letter b
	 		this.choiceA = String.format(String.valueOf(wrong1));
	 		this.choiceB = String.format(String.valueOf(correct));
	 		this.choiceC = String.format(String.valueOf(wrong2));
	 		this.choiceD = String.format(String.valueOf(wrong3));
	 		this.choiceE = String.format(String.valueOf(wrong4));
	 		
	 		answer = this.choiceB; 
	 		this.answerKey = this.answerB; 
	 		break;
//in this case, we must have output "correct!" if user enters b
	 	case 2: //correct at letter c
	 		this.choiceA = String.format(String.valueOf(wrong1));
	 		this.choiceB = String.format(String.valueOf(wrong2));
	 		this.choiceC = String.format(String.valueOf(correct));
	 		this.choiceD = String.format(String.valueOf(wrong3));
	 		this.choiceE = String.format(String.valueOf(wrong4));
	 		
	 		answer = this.choiceC; 
	 		this.answerKey = this.answerC; 
	 		break;
//in this case, we must have output "correct" if user enters c
	 	case 3: //correct at letter d

	 		this.choiceA = String.format(String.valueOf(wrong1));
	 		this.choiceB = String.format(String.valueOf(wrong2));
	 		this.choiceC = String.format(String.valueOf(wrong3));
	 		this.choiceD = String.format(String.valueOf(correct));
	 		this.choiceE = String.format(String.valueOf(wrong4));
	 		
	 		answer = this.choiceD; 
	 		this.answerKey = this.answerD; 
	 		break;
//in this case, we must have output "correct" if user enters d
	 	case 4: //correct at letter e
	 		this.choiceA = String.format(String.valueOf(wrong1));
	 		this.choiceB = String.format(String.valueOf(wrong2));
	 		this.choiceC = String.format(String.valueOf(wrong3));
	 		this.choiceD = String.format(String.valueOf(wrong4));
	 		this.choiceE = String.format(String.valueOf(correct));
	 		
	 		answer = this.choiceE; 
	 		this.answerKey = this.answerE; 
	 		break;
//in this case, we must have output "correct" if user enters e
	 }	

}

	public int getRandNum() //method to generate random numbers to fill the arrays
	{
		Random rand = new Random();
		return(rand.nextInt(10));
	}
	
}
