package AP_Exam;
import java.util.Random;

import model_questions.Question;
import model_questions.QuestionMC;




public class finalInfoQuestions extends QuestionMC
{	
 public finalInfoQuestions() 
 {
	setupQuestionData();
	setupQuestion();

	Random random1 = new Random();
	int randp = random1.nextInt(15);
	
  {
	
	switch(randp)
	{
	  
		case 0:
			
			this.question = "What does MVC stand for?";
			
			choices = loadQuestArray("Most Valuable Concept","Model View Concept", "Model View Control", 
					"Model Vision Control", "None of the Above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "Model View Control");
			this.answer = "Model View Control, that's the name";
			break;
	
		case 1:
			this.question = "What does the View part of MVC contain";
	
			choices = loadQuestArray("The GUI and Console IO code","The Logic for the program", "A mix of all part of program", 
						"Data pulled from an outside source", "View is not part of MVC");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The GUI and Console IO code"); 
			this.answer = "View conists of what the user actually sees and interacts."
					+ " Get's input, gives output, no logic";
			break;
			
		case 2:
			this.question = "What does the Control part of MVC contain";
	
			choices = loadQuestArray("Control is not part of MVC.","There is no control is MVC", "How the program looks but not the data", 
						"How the program looks and the data it uses", "The brains of the program; logic code is here");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The brains of the program; logic code is here");
			this.answer = "Control consists of the logic of the code. It interacts with data and manipulates it.";
			break;
			
		case 3:
			this.question = "What does the Model part of MVC control.";
			choices = loadQuestArray("The \"brain\" of the program, uses data + user input to complete purpose.",
						"The long-term stored information of a program. (Database)", "The GUI; how the user interacts with the program.",
						"The efficiency that the program runs at.", "Model is not part of MVC.");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The long-term stored information of a program. (Database)");
			this.answer = "The \"Model\" in MVC refers to the data that the program performs actions on.";
			break;
			
		case 4:
			this.question = "What is the purpose of MVC?";
			choices = loadQuestArray("Make code modular so you can modify parts without breaking the entirety of the program.", 
					"Ensures that code is organized and purposeful.", "Ensures the proper breakdown of a problem.", 
					"To make coding more confusing and difficult.", "All but \"To make coding more confusing and difficult\"");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "All but \"To make coding more confusing and difficult\"");
			this.answer = "The MVC organizational pattern isolates different aspects of code to ensure "
						+ "that code is purposeful, effective, and easy to modify in the long term.";
			break;
		
		case 5:
			int type = (int) Math.floor(Math.random()*2);
			String ANS = "";
			String reason = "";
	
			this.question = "What part of MVC would this code fit into?";
			choices = loadQuestArray("Model", "Vision", "Control", "Version", "View");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	
			if(type == 0)
				{
	
					ANS = "Control";
					reason = "This code receives input fron the View and manipulates the data, returning whether or not it is a palindrome. Logic code";
				}
			else
				{
					ANS = "View";
					reason = "This code simply gets input and gives output, only dealing with what the user sees, not manipulating variables";
				}
	
			this.answerKey = getAns(choices, ANS);
			this.answer = reason;
	
			break;
			
			
		case 6:
			
			this.question = "Which method implies calling a method within itself?"; 
			choices = loadQuestArray("for loop", "polymorphism", "type casting", "recursion", "None of the above");
	        
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	       
	        answer = this.choiceD;
	        answerKey = this.charD;
	        
		case 7:
			
			this.question = "Which datatype is the best to use when you want to incorporate decimals?";
			choices = loadQuestArray("int", "boolean", "double", "All of the above", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceC; 
	        answerKey = this.charC;
	        
		case 8:
			
			this.question = "When you want the first value of an array called Pets, how do you write that?";
			choices = loadQuestArray("Pets[0]", "Pets", "Pets.first[]", "All of the above", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceA;
	        answerKey = this.charA;
	        
		case 9:
			
			this.question = "What is true about method overloading?";
			choices = loadQuestArray("Different method names, same parameters", "Same method names, same parameters", "Different method names, different parameters", "Same method names, different parameters", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceD;
	        answerKey = this.charD;
	        
		case 10:
			
			this.question = "Which of the following is the correct way to remove the value " + randp + " from the list below? \n nums = [5,6,7,8,9,10]";
			choices = loadQuestArray("nums.remove(5);", "nums.remove(0);", "nums.remove(1);", "nums.remove(2);", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
	        answer = this.choiceE;
	        answerKey = this.charE; 
			
		case 11:
			this.question = "What year was Java created?";// creates question
			choices = loadQuestArray("1990", "2000", "1989", "1996", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceD;
	        answerKey = this.charD;
			
			break;
			
		case 12:
			this.question = "What type of programming language is Java?";
			choices = loadQuestArray("Data-Oriented", "Iterative", "Object-oriented", "Imperative", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceC;
	        answerKey = this.charC;
	        
			break;
			
		case 13:
			this.question = "What is the name of the execution environment for Java?";
			choices = loadQuestArray("Java Virtual Machine", "Java Bytecode Interpreter", "Java Bytecode Runner", "Java Program Executor", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceA;
	        answerKey = this.charA;
	        
			break;
			
		case 14:
			this.question = "What is a class in Java?";
			choices = loadQuestArray("A place where students learn", "A function defined by the user", "A user-defined prototype from which objects are created", "A method that defines parameters for a function", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceC;
	        answerKey = this.charC;
	        
			break;

		case 15:
			this.question = "What is a package in Java?";
			choices = loadQuestArray("A parcel shipped by the local mail office",
			        "A collection of classes within a class", "A user-defined prototype where objects are created",
					"A collection of functions within a class", "None of the above");
					
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceB;
			answerKey = this.charB;
			        
			break;
			
		default:
			
			this.choiceA = "ERROR";
			this.choiceB = "ERROR";
			this.choiceC = "ERROR";
			this.choiceD = "ERROR";
			this.choiceE = "ERROR";
			
			System.out.print("ERROR");
	
	
	}}
  
  }
 
 public finalInfoQuestions(int qNumber) 
 {
	setupQuestionData();
	setupQuestion();
  {
	
	switch(qNumber)
	{
	  
		case 0:
			
			this.question = "What does MVC stand for?";
			
			choices = loadQuestArray("Most Valuable Concept","Model View Concept", "Model View Control", 
					"Model Vision Control", "None of the Above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "Model View Control");
			this.answer = "Model View Control, that's the name";
			break;
	
		case 1:
			this.question = "What does the View part of MVC contain";
	
			choices = loadQuestArray("The GUI and Console IO code","The Logic for the program", "A mix of all part of program", 
						"Data pulled from an outside source", "View is not part of MVC");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The GUI and Console IO code"); 
			this.answer = "View conists of what the user actually sees and interacts."
					+ " Get's input, gives output, no logic";
			break;
			
		case 2:
			this.question = "What does the Control part of MVC contain";
	
			choices = loadQuestArray("Control is not part of MVC.","There is no control is MVC", "How the program looks but not the data", 
						"How the program looks and the data it uses", "The brains of the program; logic code is here");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The brains of the program; logic code is here");
			this.answer = "Control consists of the logic of the code. It interacts with data and manipulates it.";
			break;
			
		case 3:
			this.question = "What does the Model part of MVC control.";
			choices = loadQuestArray("The \"brain\" of the program, uses data + user input to complete purpose.",
						"The long-term stored information of a program. (Database)", "The GUI; how the user interacts with the program.",
						"The efficiency that the program runs at.", "Model is not part of MVC.");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "The long-term stored information of a program. (Database)");
			this.answer = "The \"Model\" in MVC refers to the data that the program performs actions on.";
			break;
			
		case 4:
			this.question = "What is the purpose of MVC?";
			choices = loadQuestArray("Make code modular so you can modify parts without breaking the entirety of the program.", 
					"Ensures that code is organized and purposeful.", "Ensures the proper breakdown of a problem.", 
					"To make coding more confusing and difficult.", "All but \"To make coding more confusing and difficult\"");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "All but \"To make coding more confusing and difficult\"");
			this.answer = "The MVC organizational pattern isolates different aspects of code to ensure "
						+ "that code is purposeful, effective, and easy to modify in the long term.";
			break;
		
		case 5:
			int type = (int) Math.floor(Math.random()*2);
			String ANS = "";
			String reason = "";
	
			this.question = "What part of MVC would this code fit into?";
			choices = loadQuestArray("Model", "Vision", "Control", "Version", "View");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	
			if(type == 0)
				{
	
					ANS = "Control";
					reason = "This code receives input fron the View and manipulates the data, returning whether or not it is a palindrome. Logic code";
				}
			else
				{
					ANS = "View";
					reason = "This code simply gets input and gives output, only dealing with what the user sees, not manipulating variables";
				}
	
			this.answerKey = getAns(choices, ANS);
			this.answer = reason;
	
			break;
			
			
		case 6:
			
			this.question = "Which method implies calling a method within itself?"; 
			choices = loadQuestArray("for loop", "polymorphism", "type casting", "recursion", "None of the above");
	        
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	       
	        answer = this.choiceD;
	        answerKey = this.charD;
	        
		case 7:
			
			this.question = "Which datatype is the best to use when you want to incorporate decimals?";
			choices = loadQuestArray("int", "boolean", "double", "All of the above", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceC; 
	        answerKey = this.charC;
	        
		case 8:
			
			this.question = "When you want the first value of an array called Pets, how do you write that?";
			choices = loadQuestArray("Pets[0]", "Pets", "Pets.first[]", "All of the above", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceA;
	        answerKey = this.charA;
	        
		case 9:
			
			this.question = "What is true about method overloading?";
			choices = loadQuestArray("Different method names, same parameters", "Same method names, same parameters", "Different method names, different parameters", "Same method names, different parameters", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
	        
	        answer = this.choiceD;
	        answerKey = this.charD;
	        
		case 10:
			
			this.question = "Which of the following is the correct way to remove the value " + qNumber + " from the list below? \n nums = [5,6,7,8,9,10]";
			choices = loadQuestArray("nums.remove(5);", "nums.remove(0);", "nums.remove(1);", "nums.remove(2);", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
	        answer = this.choiceE;
	        answerKey = this.charE; 
			
		case 11:
			this.question = "What year was Java created?";// creates question
			choices = loadQuestArray("1990", "2000", "1989", "1996", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceD;
	        answerKey = this.charD;
			
			break;
			
		case 12:
			this.question = "What type of programming language is Java?";
			choices = loadQuestArray("Data-Oriented", "Iterative", "Object-oriented", "Imperative", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceC;
	        answerKey = this.charC;
	        
			break;
			
		case 13:
			this.question = "What is the name of the execution environment for Java?";
			choices = loadQuestArray("Java Virtual Machine", "Java Bytecode Interpreter", "Java Bytecode Runner", "Java Program Executor", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceA;
	        answerKey = this.charA;
	        
			break;
			
		case 14:
			this.question = "What is a class in Java?";
			choices = loadQuestArray("A place where students learn", "A function defined by the user", "A user-defined prototype from which objects are created", "A method that defines parameters for a function", "None of the above");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceC;
	        answerKey = this.charC;
	        
			break;

		case 15:
			this.question = "What is a package in Java?";
			choices = loadQuestArray("A parcel shipped by the local mail office",
			        "A collection of classes within a class", "A user-defined prototype where objects are created",
					"A collection of functions within a class", "None of the above");
					
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			answer = this.choiceB;
			answerKey = this.charB;
			        
			break;
			
		default:
			
			this.choiceA = "ERROR";
			this.choiceB = "ERROR";
			this.choiceC = "ERROR";
			this.choiceD = "ERROR";
			this.choiceE = "ERROR";
			
			System.out.print("ERROR");
	
	
	}}
  
  }
		 private char getAns(String quests[], String ans) {
				char retVal;
				
				//Compares each question in array to the correct answer string
				if(quests[0].equals(ans) == true)
					retVal = 'A';
				else if(quests[1].equals(ans) == true)
					retVal = 'B';
				else if(quests[2].equals(ans) == true)
					retVal = 'C';
				else if(quests[3].equals(ans) == true)
					retVal = 'D';
				else if(quests[4].equals(ans) == true)
					retVal = 'E';
				else retVal = 'X'; //default case for if there is an error
				
				return retVal;
	}
		 
		 private String[] loadQuestArray (String q0, String q1, String q2, String q3, String q4)
			{
				int rand;
				String[] choices = new String[5];
				
				String hold;
				

				choices[0] = q0;
				choices[1] = q1;
				choices[2] = q2;
				choices[3] = q3;
				choices[4] = q4;
				
				//randomly swap the Strings 
				for(int i = 0; i <5; i++)
				{
					hold = choices[i];
					rand = (int) Math.floor(Math.random() * 5);
					choices[i] = choices[rand];
					choices[rand] = hold;
					
				}
				return choices;	
			}
}
