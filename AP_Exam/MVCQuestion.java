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
			choices = loadQuestArray("Most Valuable Concept","Model View Concept", "Model View Control", 
					"Model Vision Control", "None of the Above");
			
			this.question = "What does MVC stand for?";
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			this.answerKey = this.answerC;
			this.answer = "Model View Control, that's the name";
			break;
		case 1:
			this.question = "What does the View part of MVC contain";
			this.choiceA = "The GUI and Console IO code";
			this.choiceB = "The Logic for the program";
			this.choiceC = "A mix of all part of program";
			this.choiceD = "Data pulled from an outside source";
			this.choiceE = "A,B,C,D, but not E";
			this.answerKey = 'A';
			this.answer = "View conists of what the user actually sees and interacts."
					+ " Get's input, gives output, no logic";
			break;
		case 2:
			this.question = "What does the Control part of MVC contain";
			this.choiceA = "All of the above";
			this.choiceB = "There is no control is MVC";
			this.choiceC = "How the program looks but not the data";
			this.choiceD = "How the program looks and the data it uses";
			this.choiceE = "The brains of the program; logic code is here";
			this.answerKey = 'E';
			this.answer = "Control consists of the logic of the code. It interacts with data and manipulates it.";
			break;
		case 3:
			this.question = "What does the Model part of MVC control.";
			this.choiceA = "The \"brain\" of the program, uses data + user input to complete purpose.";
			this.choiceB = "The long-term stored information of a program. (Database)";
			this.choiceC = "The GUI; how the user interacts with the program.";
			this.choiceD = "The efficiency that the program runs at.";
			this.choiceE = "All of the above.";
			this.answerKey = 'B';
			this.answer = "The \"Model\" in MVC refers to the data that the program performs actions on.";
			break;
		case 4:
			this.question = "What is the purpose of MVC?";
			this.choiceA = "Make code modular so you can modify parts without breaking the entirety of the program.";
			this.choiceB = "Ensures that code is organized and purposeful.";
			this.choiceC = "Ensures the proper breakdown of a problem.";
			this.choiceD = "To make coding more confusing and difficult.";
			this.choiceE = "A, B, C, but not D";
			this.answerKey = 'E';
			this.answer = "The MVC organizational pattern isolates different aspects of code to ensure "
					+ "that code is purposeful, effective, and easy to modify in the long term.";
			break;
		default:
			System.out.print("ERROR");
		}
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
