package AP_Exam;

import java.util.Random;

public class MVCQuestion extends Question{
	public MVCQuestion()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		String[] choices = new String[5];
		
		int random = (int) Math.floor(Math.random()*5);
		
		switch(random){
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
					"Data pulled from an outside source", "A,B,C,D, but not E");
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
			
			choices = loadQuestArray("All of the above","There is no control is MVC", "How the program looks but not the data", 
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
					"The efficiency that the program runs at.", "All of the above.");
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
		default:
			System.out.print("ERROR");
		}
	}
	
	//loadQuestArray loads an array with the 5 possible questions
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
	
	//Determines which choice the answer string is in
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
