package AP_Exam;
import java.util.Random;


import Util.ConsoleMethods;
import Util.OutputCode;
/**
 * The class for all question pertaining to MVC
 *
 * @author Ethan Davies and Jared Jose
 * @version 12/6
 */
import Util.OutputCode;
public class MVCQuestion extends Question{
	
	/**
	 * MVCQuestion contructor
	 * sets up question
	 *
	 */
	public MVCQuestion()
    {
		//This sets up all the questions to be used by the question class so when called a 
		//question and answer is displayed and not null
    	setupQuestionData();
    	setupQuestion();
    }
	
	/**
	 * setupQuestionData: creates and loads question into Question class
	 * @param void 
	 * @return void
	 *
	 */
	@Override
	protected void setupQuestionData() {
		ConsoleMethods.println("MVC class setupQuestionData method");
		//string array that will contain the five options for each question
		String[] choices = new String[5];
		
		//randomizes which question is asked
		int random = (int) Math.floor(Math.random()*6);
		
		switch(random){
		case 0:
			//the question
			this.question = "What does MVC stand for?";
			
			//loads the choices with strings based on what question is asked.
			//The order will be randomized by the method loadQuestArry
			choices = loadQuestArray("Most Valuable Concept","Model View Concept", "Model View Control", 
					"Model Vision Control", "None of the Above");
			//loading each choice in the question class with the choices I want
			this.choiceA = choices[0];
			//this. means this class, but since this class extends question 
			//this. can access variables from question, such as choiceA, or answerKey
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			//setting the answer
			//getAns will determine which letter the answer from the randomized array and return that letter
			this.answerKey = getAns(choices, "Model View Control");
			this.answer = "Model View Control, that's the name";
			break;
		//All other cases the same idea as above
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
 			WeavetheRing(type); //using threads here

 			break;
 		default:
 			System.out.print("ERROR");
		}
	}
	/**
	 * loadQuestArray loads an array with the 5 possible questions
	 * @param 
	 * @return String[]
	 *
	 */
	private String[] loadQuestArray (String q0, String q1, String q2, String q3, String q4)
	{
		int rand; //random int placehold
		String[] choices = new String[5]; //temporary storage for questions
		
		String hold; //for swap algo
		
		//load questions into array
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
	
	/**
	 * The class for all question pertaining to MVC
	 *
	 * @author Ethan Davies and Jared Jose
	 * @version 12/6
 	 */
 	class CodeOutputter extends Thread
 	{
 		int Type;
 		public CodeOutputter(int type)
 		{
 			Type = type;
 		}
 		public void run()//run is special to thread classes
 		{
 			OutputCode.codeOutput(Type);//getting code and putting it another pane for user to see
 		}
 	}

	/**
	 * WeavetheRing: creates a thread to run another class siumltaneously
	 * @param void 
 	 * @return void
 	 *
 	 */
 	public void WeavetheRing(int type)
 	{
 		CodeOutputter coder = new CodeOutputter(type);
 		coder.start();//tells computer we're running a new thread
 		/* A thread is basically a way for the computer to run two things at once. Without this the JOptionPane displayed by the thread would 
 		 * be displayed  before the question is loaded into the AP_UI class and sent to the user so the code popping up in a new pane
		 * would make no sense. By using threads we can have the computer update the question in the main JFrame and display the code in the 
		 * new JOption Pane popping up at the same time so the question makes the most sense
		 */
	}
	
	/**
	 * getAns: reads randomized the newly randomized question order and finds the answer
	 * @param  
	 * @return char
	 *
	 */
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
	
}
