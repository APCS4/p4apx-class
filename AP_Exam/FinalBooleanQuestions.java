package AP_Exam;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import Util.ConsoleMethods;
import model_questions.Question;
import Util.*;

/**
 * This class presents the series of questions based on boolean operators and logic
 * 
 * @author Anthony Tseng & Jude Giolitto 
 */

public class FinalBooleanQuestions extends Question
{	
	private String[] boolOp1 = {"^", "||", "&&", "==", "!="};
	private String[] boolOp2 = {"!", ""};
	
	public FinalBooleanQuestions()
	{
		setupQuestion(); //calls setupQuestion method in Question class
	}
	
	/**
	 * setupQuestionData is the method that sets up questions, choiceArray, and answers
	 * 
	 */
	
	//@Override
	protected void setupQuestionData()
	{
		ConsoleMethods.println("BooleanQuestions class setupQuestionData method");
		
		int random = rand.nextInt(4);
		
		switch(random)
		{
		case 0:
			choiceDfixed = false;
			choiceEfixed = true;
			
			choiceArray.addAll(Arrays.asList("^", "||", "!=", "%", "")); //add answer choiceArray to choiceArray
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is NOT a boolean operator?\n"
						  + "^, ||, !=, %";
			this.answerKey = getAns(choiceArray, "%");
			this.answer = "Choice " + answerKey + " is correct. % is not a boolean operator";
			break;
		case 1:
			choiceDfixed = true;
			choiceEfixed = true;
			
			choiceArray.addAll(Arrays.asList("true", "false", "The code will not run", "", ""));
			
			this.question = "What is the output of the following code?\n"
						  + "if(3 < 5)\n"
						  + "{\n"
						  + "    System.out.println( false && false );\n"
						  + "}";
			loadChoices();
			this.answerKey = getAns(choiceArray, "false");
			this.answer = "Choice " + answerKey + " is correct. The boolean operator && only returns true if both arguments are true.";
			break;
		case 2:
			choiceDfixed = true;
			choiceEfixed = true;
			
			createCase2();
			
			this.question = choiceArray.get(0);
			this.choiceA = choiceArray.get(1);
			this.choiceB = choiceArray.get(2);
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
			this.answerKey = choiceArray.get(3).charAt(0);
			this.answer = "Choice " + answerKey + " is correct. " + choiceArray.get(4);
			break;
	
		case 3:
			String OP = boolOp1[rand.nextInt(boolOp1.length)]; //randomly selects operator
			String OP2 = boolOp2[rand.nextInt(boolOp2.length)]; //selects whether there will be ! before first argument or not
			boolean arg1 = rand.nextBoolean(); //randomize arguments
			boolean arg2 = rand.nextBoolean();
			
			String question;
			question = String.format("What is " + OP2 + arg1 + " " + OP + " " + arg2 + "?"); //create question
			choiceArray.add(question); //adds question at index 0
			
			choiceArray.add("true"); //adds answer choiceArray A and B at index 1 and 2, respectively
			choiceArray.add("false");
			
			boolean answer = true;
			String explanation = "";
			
			switch(OP) //determines answer and sets explanation
			{
			case "^":
				explanation = "^  is an operator that provides true if both arguments are different and false if both arguments are equal";
				if(OP2 == "")
				{
					answer = arg1^arg2;
				}
				else
				{
					answer = !arg1^arg2;
				}
				break;
			case "||":
				explanation = "|| is an operator that returns true if EITHER of the arguments are true and false if both arguments are false";
				if(OP2 == "")
				{
					answer = arg1||arg2;
				}
				else
				{
					answer = !arg1||arg2;
				}
				break;
			case "&&":
				explanation = "&& is an operator that returns true if and only if BOTH arguments are true. Otherwise, it returns false";
				if(OP2 == "")
				{
					answer = arg1&&arg2;
				}
				else
				{
					answer = !arg1&&arg2;
				}
				break;
			case "==":
				explanation = "== is an operator that returns true if both arguments are the same and false if they are different";
				if(OP2 == "")
				{
					answer = arg1==arg2;
				}
				else
				{
					answer = !arg1==arg2;
				}
				break;
			case "!=":
				explanation = "!= is an operator that return true if both arguments are unequal";
				if(OP2 == "")
				{
					answer = arg1!=arg2;
				}
				else
				{
					answer = !arg1!=arg2;
				}
				break;
			default:
				System.out.println("ERROR at BooleanQuestion.createQuestion");
			}
				
			if(answer)//determines letter that corresponds to answer and adds it at index 3
			{
				choiceArray.add("A");
			}
			else
			{
				choiceArray.add("B");
			}
			
			choiceArray.add(explanation);//adds explanation at index 4
			
			//displays question and answer in console for debugging purposes
			displayConsole(choiceArray.get(0), choiceArray.get(3));
		}
		
		int displayConsole; String quest = null; String ans;
		{
			ConsoleMethods.println(quest);
		}

		 {
			ConsoleMethods.println("Operator Question setup Question Data Method");
			AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
			Random rand = new Random();
			String[] array = new String[]{"logical AND short circuit", "logical OR short circuit", "boolean logical AND", "boolean logical OR", "None of them"};
			List<String> randArr = Arrays.asList(array);
			int randomQuestion = rand.nextInt(6);
			switch(randomQuestion){
			case 0:
				
				int Index0 = indexClass.returnIndex(randArr, "logical AND short circuit");
				char Ans0 = indexClass.returnAns(Index0);
				
				this.answerKey = Ans0;
				this.answer = "logical AND short circuit";
				break;
			case 1:
				this.question = "What does || stand for?";
				
				Collections.shuffle(randArr);
				this.choiceA = randArr.get(0);
				this.choiceB = randArr.get(1);
				this.choiceC = randArr.get(2);
				this.choiceD = randArr.get(3);
				this.choiceE = randArr.get(4);
				
				int Index1 = indexClass.returnIndex(randArr, "logical OR short circuit");
				char Ans1 = indexClass.returnAns(Index1);
				
				this.answerKey = Ans1;
				this.answer = "logical OR short circuit";
				break;
			case 2:
				this.question = "What does & stand for?";
				
				Collections.shuffle(randArr);
				this.choiceA = randArr.get(0);
				this.choiceB = randArr.get(1);
				this.choiceC = randArr.get(2);
				this.choiceD = randArr.get(3);
				this.choiceE = randArr.get(4);
				
				int Index2 = indexClass.returnIndex(randArr, "boolean logical AND");
				char Ans2 = indexClass.returnAns(Index2);
				
				this.answerKey = Ans2;
				this.answer = "boolean logical AND";
				break;
				
			case 3:
				this.question = "What does | stand for?";
				
				Collections.shuffle(randArr);
				this.choiceA = randArr.get(0);
				this.choiceB = randArr.get(1);
				this.choiceC = randArr.get(2);
				this.choiceD = randArr.get(3);
				this.choiceE = randArr.get(4);
				
				int Index3 = indexClass.returnIndex(randArr, "boolean logical OR");
				char Ans3 = indexClass.returnAns(Index3);
				
				this.answerKey = Ans3;
				this.answer = "boolean logical OR";
				break;
			case 4:
				this.question = "What does ^ stand for?";
				
				Collections.shuffle(randArr);
				this.choiceA = randArr.get(0);
				this.choiceB = randArr.get(1);
				this.choiceC = randArr.get(2);
				this.choiceD = randArr.get(3);
				this.choiceE = randArr.get(4);
				
				int Index4 = indexClass.returnIndex(randArr, "None of them");
				char Ans4 = indexClass.returnAns(Index4);
				
				this.answerKey = Ans4;
				this.answer = "boolean logical OR";
				break;
			case 5:
				int i = rand.nextInt(6) + 1;
				int lower = i - 1; 
				int higher = i + 3;
				this.question = "if ( -1 < j < " + i + "|| j >= " + higher + ") { \n code \n } \n what is the range of values of j which this code runs";
				this.choiceA = "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
				this.choiceB = "[" + rand.nextInt(13) + ", " + rand.nextInt(18) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
				this.choiceC = "[0" + ", " + lower + "]" + "U" + "[" + higher + ", infinity)";
				this.choiceD = "[" + rand.nextInt(6) + ", " + rand.nextInt(10) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
				this.choiceE = "[" + rand.nextInt(2) + ", " + rand.nextInt(30) + "]U"+ "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
				this.answerKey = 'C';
				this.answer = this.choiceC;
			default:
				System.out.println("d");
			}
			
		
		}
	}
	
	
	
	
	/**
	 * creates question 3(case 2) in the setupQuestion class
	 * 
	 * @return an ArrayList containing the question, answer choiceArray, answer, and explanation
	 */
	private void createCase2() //creates randomized question based on boolean operators
	{

		
		String OP = boolOp1[rand.nextInt(boolOp1.length)]; //randomly selects operator
		String OP2 = boolOp2[rand.nextInt(boolOp2.length)]; //selects whether there will be ! before first argument or not
		boolean arg1 = rand.nextBoolean(); //randomize arguments
		boolean arg2 = rand.nextBoolean();
		
		String question;
		question = String.format("What is " + OP2 + arg1 + " " + OP + " " + arg2 + "?"); //create question
		choiceArray.add(question); //adds question at index 0
		
		choiceArray.add("true"); //adds answer choiceArray A and B at index 1 and 2, respectively
		choiceArray.add("false");
		
		boolean answer = true;
		String explanation = "";
		
		switch(OP) //determines answer and sets explanation
		{
		case "^":
			explanation = "^  is an operator that provides true if both arguments are different and false if both arguments are equal";
			if(OP2 == "")
			{
				answer = arg1^arg2;
			}
			else
			{
				answer = !arg1^arg2;
			}
			break;
		case "||":
			explanation = "|| is an operator that returns true if EITHER of the arguments are true and false if both arguments are false";
			if(OP2 == "")
			{
				answer = arg1||arg2;
			}
			else
			{
				answer = !arg1||arg2;
			}
			break;
		case "&&":
			explanation = "&& is an operator that returns true if and only if BOTH arguments are true. Otherwise, it returns false";
			if(OP2 == "")
			{
				answer = arg1&&arg2;
			}
			else
			{
				answer = !arg1&&arg2;
			}
			break;
		case "==":
			explanation = "== is an operator that returns true if both arguments are the same and false if they are different";
			if(OP2 == "")
			{
				answer = arg1==arg2;
			}
			else
			{
				answer = !arg1==arg2;
			}
			break;
		case "!=":
			explanation = "!= is an operator that return true if both arguments are unequal";
			if(OP2 == "")
			{
				answer = arg1!=arg2;
			}
			else
			{
				answer = !arg1!=arg2;
			}
			break;
		default:
			System.out.println("ERROR at BooleanQuestion.createQuestion");
		}
			
		if(answer)//determines letter that corresponds to answer and adds it at index 3
		{
			choiceArray.add("A");
		}
		else
		{
			choiceArray.add("B");
		}
		
		choiceArray.add(explanation);//adds explanation at index 4
		
		//displays question and answer in console for debugging purposes
		displayConsole(choiceArray.get(0), choiceArray.get(3));
	}
	
	private void displayConsole(String quest, String ans)
	{
		ConsoleMethods.println(quest);
	}

	protected void setupQuestionData1() {
		ConsoleMethods.println("Operator Question setup Question Data Method");
		AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
		Random rand = new Random();
		String[] array = new String[]{"logical AND short circuit", "logical OR short circuit", "boolean logical AND", "boolean logical OR", "None of them"};
		List<String> randArr = Arrays.asList(array);
		int randomQuestion = rand.nextInt(6);
		switch(randomQuestion){
		case 0:
			
			int Index0 = indexClass.returnIndex(randArr, "logical AND short circuit");
			char Ans0 = indexClass.returnAns(Index0);
			
			this.answerKey = Ans0;
			this.answer = "logical AND short circuit";
			break;
		case 1:
			this.question = "What does || stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index1 = indexClass.returnIndex(randArr, "logical OR short circuit");
			char Ans1 = indexClass.returnAns(Index1);
			
			this.answerKey = Ans1;
			this.answer = "logical OR short circuit";
			break;
		case 2:
			this.question = "What does & stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index2 = indexClass.returnIndex(randArr, "boolean logical AND");
			char Ans2 = indexClass.returnAns(Index2);
			
			this.answerKey = Ans2;
			this.answer = "boolean logical AND";
			break;
			
		case 3:
			this.question = "What does | stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index3 = indexClass.returnIndex(randArr, "boolean logical OR");
			char Ans3 = indexClass.returnAns(Index3);
			
			this.answerKey = Ans3;
			this.answer = "boolean logical OR";
			break;
		case 4:
			this.question = "What does ^ stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index4 = indexClass.returnIndex(randArr, "None of them");
			char Ans4 = indexClass.returnAns(Index4);
			
			this.answerKey = Ans4;
			this.answer = "boolean logical OR";
			break;
		case 5:
			int i = rand.nextInt(6) + 1;
			int lower = i - 1; 
			int higher = i + 3;
			this.question = "if ( -1 < j < " + i + "|| j >= " + higher + ") { \n code \n } \n what is the range of values of j which this code runs";
			this.choiceA = "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceB = "[" + rand.nextInt(13) + ", " + rand.nextInt(18) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceC = "[0" + ", " + lower + "]" + "U" + "[" + higher + ", infinity)";
			this.choiceD = "[" + rand.nextInt(6) + ", " + rand.nextInt(10) + "]U" + "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.choiceE = "[" + rand.nextInt(2) + ", " + rand.nextInt(30) + "]U"+ "[" + rand.nextInt(5) + ", " + rand.nextInt(14) + "]";
			this.answerKey = 'C';
			this.answer = this.choiceC;
		}
		
	}

	
}


