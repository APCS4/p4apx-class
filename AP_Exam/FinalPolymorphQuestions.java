package AP_Exam;

import java.util.Random;

import Util.ConsoleMethods;
import model_questions.Question;

public class FinalPolymorphQuestions extends Question {
	private String[] loadQuestArray(String q0, String q1, String q2, String q3, String q4) {
		int rand;
		String[] choices = new String[5];
		String hold;
		choices[0] = q0;
		choices[1] = q1;
		choices[2] = q2;
		choices[3] = q3;
		choices[4] = q4;
		// randomly swap the Strings
		for (int i = 0; i < 5; i++) {
			hold = choices[i];
			rand = (int) Math.floor(Math.random() * 5);
			choices[i] = choices[rand];
			choices[rand] = hold;
		}
		return choices;
	}
	public FinalPolymorphQuestions()
	{
		setupQuestionData();
		setupQuestion();
		Random random1 = new Random();
		int randp = random1.nextInt(15);
		switch (randp)
		{
		case 0:
			this.question = "What is polymorphism?";
			choices = loadQuestArray("A type of variable", "A method of reusing code","A type of class",
					"Making a variable which can contain different types of data","The use of multiple classes");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charB;
			break;
		case 1:
			this.question = "What is the syntax for Polymorphism?";
			choices = loadQuestArray("Extends","Implements","Connects","Inherits","Contains");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceD;
			answerKey = this.charD;
			break;
		case 2:
			 this.question = "What does \"super\" refer to?";
			 choices = loadQuestArray("The subclass", "The parent class","Another class",
					 "A method in the parent class","A method in the subclass");
			 this.choiceA = choices[0];
			 this.choiceB = choices[1];
			 this.choiceC = choices[2];
			 this.choiceD = choices[3];
			 this.choiceE = choices[4];
			 answer = this.choiceB;
			 answerKey = this.charB;
			 break;
		case 3:
			this.question = "How do you inherit multiple classes?";
			choices = loadQuestArray("Inherits","Implements","Multiple class inheritance isn't possible in Java",
					"Connects","Contains");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceC;
			answerKey = this.charC;
			break;
		case 4:
			this.question = "What is the definition of \"method overloading\"";
			choices = loadQuestArray("A feature that allows a class to have more than one method having the same name, if their argument lists are different",
					"A feature that allows a class to have more than one constructor having different argument lists",
					"A set of code which is referred to by name and can be called (invoked) at any point in a program",
					"A feature used to refer to a method of functional interface",
					"No correct answer provided");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceA;
			answerKey = this.charA;
			break;
		case 5:
			this.question = "What is the definition of methos \"method overriding\"";
			choices = loadQuestArray("A feature that allows a class to have more than one method having the same name, if their argument lists are different",
					"A feature that allows a class to have more than one constructor having different argument lists",
					"A set of code which is referred to by name and can be called (invoked) at any point in a program",
					"A feature used to refer to a method of functional interface",
					"No correct answer provided");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charB;
			break;
		case 6:
			this.question = "Which description best defines \"static polymorphism\"?";
			choices = loadQuestArray("Same method is overridden with same signature in different classes",
					"The process where one class acquires the properties (methods and fields) of another class",
					"Same method name is overloaded with different type or number of parameters in same class (different signature)",
					"A mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit",
					"No correct answer provided");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceC;
			answerKey = this.charC;
			break;
		case 7:
			this.question = "Which description best defines \"dynamic polymorphism\"?";
			choices = loadQuestArray("Same method is overridden with same signature in different classes",
					"The process where one class acquires the properties (methods and fields) of another class",
					"Same method name is overloaded with different type or number of parameters in same class (different signature)",
					"A mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit",
					"No correct answer provided");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceA;
			answerKey = this.charA;
			break;
		case 8:
			this.question = "Consider the following two classes:\r\n" +
	                "\r\n" +
	                "\r\n" +
	                "public class Bird\r\n" +
	                "{\r\n" +
	                "   public void act()\r\n" +
	                "{\r\n" + "System.out.print(\"fly\");" + "\r\nmakeNoise();" +
	                "}\r\n" +
	                "\r\n" +
	                "public void makeNoise()\r\n" +
	                "{\r\n" +
	                "   System.out.print(\"chirp\");\r\n" +
	                "}\r\n" + "}\r\n" +
	                "\r\n public class Dove extends Bird\n" +
	                "{\r\n" +
	                "   public void act()\r\n" +
	                "{\r\n" +
	                "super.act();\n" + "System.out.print(\"coo\");\n" +
	                "}\r\n" +
	                "}\n" +
	                "Suppose the following declaration appears in a class other than Bird or Dove:\n" +
	                "\n Bird pigeon = new Dove();" +
	                "\nWhat is printed as a result of the call pigeon.act()?";
			choices = loadQuestArray("fly","fly chirp","fly chirp waddle",
					"fly chirp waddle coo","fly chirp coo waddle");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceE;
			answerKey = this.charE;
			break;
		}
	}
}