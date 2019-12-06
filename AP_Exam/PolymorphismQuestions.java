package AP_Exam;

import java.util.*;
import java.util.Random;

public class PolymorphismQuestions extends Question{
	public PolymorphismQuestions()
    {
		//calls setupQuestion() method
    	setupQuestion();
    }
	
	public void setupQuestion() {
		AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
		//creating object rand of class Random
		Random rand = new Random();
		//loading string arrays with choices
		String[] arr1 = new String[]{"a feature that allows a class to have more than one method having the same name, if their argument lists are different", "a feature that allows a class to have more than one constructor having different argument lists", "a set of code which is referred to by name and can be called (invoked) at any point in a program", "a feature used to refer method of functional interface", "none of the choices"};
		String[] arr2 = new String[]{"same method name is overloaded with different type or number of parameters in same class (different signature)", "same method is overridden with same signature in different classes", " the process where one class acquires the properties (methods and fields) of another class", "a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit", "none of the choices"};
		//loading arraylist with elements of arrays
		List<String> listArr1 = Arrays.asList(arr1);
		List<String> listArr2 = Arrays.asList(arr2);
	
		//assigning random number 0-4 into variable for switch argument
		int randQuestion = rand.nextInt(4);

		switch(randQuestion){
		case 0:
			//question to be displayed
			this.question = "What is the definition of 'method overloading'?";
			//shuffling array list of choices
			Collections.shuffle(listArr1);
			this.choiceA = listArr1.get(0);
			this.choiceB = listArr1.get(1);
			this.choiceC = listArr1.get(2);
			this.choiceD = listArr1.get(3);
			this.choiceE = listArr1.get(4);

			//checks for and assigns answer
			int Index0 = indexClass.returnIndex(listArr1, "a feature that allows a class to have more than one method having the same name, if their argument lists are different");
			char Ans0 = indexClass.returnAns(Index0);
			
			this.answerKey = Ans0;
			this.answer = "a feature that allows a class to have more than one method having the same name, if their argument lists are different";
			break;
		case 1:
			//question to be displayed
			this.question = "What is the definition of 'method overriding'?";
			//shuffling array list of choices
			Collections.shuffle(listArr1);
			this.choiceA = listArr1.get(0);
			this.choiceB = listArr1.get(1);
			this.choiceC = listArr1.get(2);
			this.choiceD = listArr1.get(3);
			this.choiceE = listArr1.get(4);
			
			//checks for and assigns answer
			int Index1 = indexClass.returnIndex(listArr1, "a feature that allows a class to have more than one constructor having different argument lists");
			char Ans1 = indexClass.returnAns(Index1);
			
			this.answerKey = Ans1;
			this.answer = "a feature that allows a class to have more than one constructor having different argument lists";
			break;
		case 2:
			//question to be displayed
			this.question = "Which description best defines 'static polymorphism'?";
			//shuffling array list of choices
			Collections.shuffle(listArr2);
			this.choiceA = listArr2.get(0);
			this.choiceB = listArr2.get(1);
			this.choiceC = listArr2.get(2);
			this.choiceD = listArr2.get(3);
			this.choiceE = listArr2.get(4);
			
			//checks for and assigns answer
			int Index2 = indexClass.returnIndex(listArr2, "same method name is overloaded with different type or number of parameters in same class (different signature)");
			char Ans2 = indexClass.returnAns(Index2);
			
			this.answerKey = Ans2;
			this.answer = "same method name is overloaded with different type or number of parameters in same class (different signature)";
			break;
			
		case 3:
			//question to be displayed
			this.question = "Which description best defines 'dynamic polymorphism'?";
			//shuffling array list of choices
			Collections.shuffle(listArr2);
			this.choiceA = listArr2.get(0);
			this.choiceB = listArr2.get(1);
			this.choiceC = listArr2.get(2);
			this.choiceD = listArr2.get(3);
			this.choiceE = listArr2.get(4);
			
			//checks for and assigns answer
			int Index3 = indexClass.returnIndex(listArr2, "same method is overridden with same signature in different classes");
			char Ans3 = indexClass.returnAns(Index3);
			
			this.answerKey = Ans3;
			this.answer = "same method is overridden with same signature in different classes";
		
			break;
		}
	}
}
