package AP_Exam;

import java.util.Random;

public class BackgroundInfoQuestions extends Question {
	public BackgroundInfoQuestions() {
		setUpQuestion();
	}
	public void setUpQuestion() {
		Random rand = new Random();
		int randQ = rand.nextInt(3);
		switch(randQ) {
		case 0: 
			this.question = "What year was Java created?";
			this.choiceA = "1990";
			this.choiceB = "2000";
			this.choiceC = "1989";
			this.choiceD = "1996";
			this.answerKey = 'D';
			break;
		case 1:
			this.question = "What type of programming language is Java?";
			this.choiceA = "Data-oriented";
			this.choiceB = "Iterative";
			this.choiceC = "Object-oriented";
			this.choiceD = "Imperative";
			this.answerKey = 'C';
			break;
		case 2:
			this.question = "What is the name of the execution environment for Java?";
			this.choiceA = "Java Virtual Machine";
			this.choiceB = "Java Bytecode Interpreter";
			this.choiceC = "Java Bytecode Runner";
			this.choiceD = "Java Program Executor";
			this.answerKey = 'A';
			break;
		}
	}

}
