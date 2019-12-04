package AP_Exam;

import java.util.Random;

public class BooleanQuestions extends Question
{
	int numChoices = 0;
	public BooleanQuestions()
	{
		setupQuestion();
	}
	
	private void setupQuestion()
	{
		Random rand = new Random();
		int random = rand.nextInt(5);
		
		switch(random)
		{
		case 0:
			this.question = "Which of the following is NOT a boolean operator?\n"
						  + "^, ||, !=, %";
			this.choiceA = "^";
			this.choiceB = "||";
			this.choiceC = "!=";
			this.choiceD = "%";
			this.answerKey = answerD;
			this.answer = "Choice D is correct. % is not a boolean operator";
			break;
		case 1:
<<<<<<< HEAD
			this.question = "What is the output of the following code?\n"
						  + "if(3 < 5)\n"
						  + "{\n"
						  + "    System.out.println( false && false );\n"
						  + "}";
			this.choiceA = "true";
			this.choiceB = "false";
			this.choiceC = "The code does not execute";
			numChoices = 3;
=======
			this.question = ""; 
>>>>>>> branch 'master' of https://github.com/APCS4/p4apx-class.git
		}
	}
}
