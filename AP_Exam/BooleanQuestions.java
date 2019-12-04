package AP_Exam;

import java.util.Random;

public class BooleanQuestions extends Question
{
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
			this.question = "";
		}
	}
}
