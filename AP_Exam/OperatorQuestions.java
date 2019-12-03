package AP_Exam;

import java.util.Random;

public class OperatorQuestions extends Question{
	public OperatorQuestions()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		Random rand = new Random();
		int randomQuestion = rand.nextInt(5);
		switch(randomQuestion){
		case 0:
			this.question = "What does && stand for?";
			this.choiceA = "logical AND short circuit";
			this.choiceB = "logical OR short circuit";
			this.choiceC = "boolean logical AND";
			this.choiceD = "boolean logical OR";
			this.choiceE = "None of the Above";
			this.answerKey = 'A';
			break;
		case 1:
			this.question = "What does || stand for?";
			this.choiceA = "logical AND short circuit";
			this.choiceB = "logical OR short circuit";
			this.choiceC = "boolean logical AND";
			this.choiceD = "boolean logical OR";
			this.choiceE = "None of the Above";
			this.answerKey = 'B';
			break;
		case 2:
			this.question = "What does & stand for?";
			this.choiceA = "logical AND short circuit";
			this.choiceB = "logical OR short circuit";
			this.choiceC = "boolean logical AND";
			this.choiceD = "boolean logical OR";
			this.choiceE = "None of the Above";
			this.answerKey = 'C';
			break;
		case 3:
			this.question = "What does | stand for?";
			this.choiceA = "logical AND short circuit";
			this.choiceB = "logical OR short circuit";
			this.choiceC = "boolean logical AND";
			this.choiceD = "boolean logical OR";
			this.choiceE = "None of the Above";
			this.answerKey = 'D';
			break;
		case 4:
			this.question = "What does ^ stand for?";
			this.choiceA = "logical AND short circuit";
			this.choiceB = "logical OR short circuit";
			this.choiceC = "boolean logical AND";
			this.choiceD = "boolean logical OR";
			this.choiceE = "None of the Above";
			this.answerKey = 'E';
			break;
		}
	}
}
