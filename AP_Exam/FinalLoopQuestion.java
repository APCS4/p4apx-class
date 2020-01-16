package AP_Exam;

import java.util.Random;

import Util.ConsoleMethods;
import model_questions.Question;

public class FinalLoopQuestion extends AP_Exam.Question
{
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
	public FinalLoopQuestion()
	{
		setupQuestionData();
		setupQuestion();
		Random random1 = new Random();
		int randp = random1.nextInt(15);
		switch (randp)
		{
		case 0:
			this.question = "What Iteration is a controlled by a programmer variable choice?";
			choices = loadQuestArray("Do While", "Switch Case", "For", "If,Else,For", "Thats done by the user");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceC;
			answerKey = this.charC;
			break;
		case 1:
			this.question = "What is the correct format for writing a for loop?";
			choices = loadQuestArray("For: ","for(int z=12; z<=103; z++);","for{in i=1: i<6:}","for {int i = 1: i<=6:} ()","for: a=1, b=2, i++");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charB;
			break;
		case 2:
			this.question = "Which of the following is the most closely associated with iterations?";
			choices = loadQuestArray("Loops such as for loops","Recursion", "Instance Initialization","Public Static Void", "If else statements");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charC;
			break;
		case 3:
			this.question = "What is the function of a do while loop?";
			choices = loadQuestArray("To replace a for loop in all cases for "
					+ "shortening code","Recursion only","Executing a block of code "
							+ "at least once and then repeatedly executing it based on"
							+ " a boolean condition","Allowing code to be repeatedly "
									+ "executed","To create simultaneous control flows"
											+ " for simplified code");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceC;
			answerKey = this.charC;
			break;
		case 4:
			this.question = "What is the output of the loop:\n"
					+ "for (int k = 0; k < 20; k = k + 2)\n"
					+ "{\n"
					+ "    if (k % 3 == 1)\n"
					+ "    {\n"
					+ "        System.out.print(k + \" \")\n"
					+ "    }\n"
					+ "};\n";
			choices = loadQuestArray("4 16", "4 10 16", "0 6 12 18", "1 4 7 10 13 16 19",
					"0 2 4 6 8 10 12 14 16 18");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charB;
			break;
		case 5:
			this.question = "What is the output of the loop:\n"
					+ "for (int i = 0; i <= 10; i = i + 1)\n" +
					"	{\n" +
					"	System.out.print(i)\n" +
					"	};\"";
			choices = loadQuestArray("0123456789", "012345678910",
					"123456789", "12345678910", "Error in code");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceB;
			answerKey = this.charB;
			break;
		case 6:
			this.question = "What is the output of the loop:\n"
					+ "for (int j = 4; j < 9; j = j + 2)\n"
					+ "{\n"
					+ "    System.out.println(j + \" \")"
					+ "\n};";
			choices = loadQuestArray("4 6 8", "4 5 6 7 8", "5 7 9", "4 6 8 10", "5 7");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceA;
			answerKey = this.charA;
			break;
		case 7:
			this.question = "What is the output of the loop:\n"
					+ "for (int l = 16; l >=0; l = l - 1)\n"
					+ "{\n"
					+ "    if (l % 3 == 0)\n"
					+ "    {\n"
					+ "        System.out.print(l)\n"
					+ "    }\n"
					+ "};\n";
			choices = loadQuestArray("161514131211109876543210", "161310741", "15129630",
					"1512963", "1651");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			answer = this.choiceC;
			answerKey = this.charC;
			break;
		}
	}
}