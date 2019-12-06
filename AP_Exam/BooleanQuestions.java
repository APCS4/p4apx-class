package AP_Exam;

import java.util.ArrayList;
import java.util.Random;

public class BooleanQuestions extends Question
{		
	private String[] boolOp1 = {"^", "||", "&&", "==", "!="};
	private String[] boolOp2 = {"!", ""};
	public BooleanQuestions()
	{
		setupQuestion();
	}
	
	private void setupQuestion()
	{
		Random rand = new Random();
		int random = rand.nextInt(3);
		ArrayList<String> questArray = new ArrayList<>();
		
		switch(random)
		{
		case 0:
			questArray.add("^");
			questArray.add("||");
			questArray.add("!=");
			questArray.add("%");
			questArray = randomizeQuest(questArray);
			this.question = "Which of the following is NOT a boolean operator?\n"
						  + "^, ||, !=, %";
			this.choiceA = questArray.get(0);
			this.choiceB = questArray.get(1);
			this.choiceC = questArray.get(2);
			this.choiceD = questArray.get(3);
			this.choiceE = "Don't pick this one";
			this.answerKey = getAns(questArray, "%");
			this.answer = "Choice " + answerKey + " is correct. % is not a boolean operator";
			break;
		case 1:
			questArray.add("true");
			questArray.add("false");
			questArray.add("The code will not run");
			this.question = "What is the output of the following code?\n"
						  + "if(3 < 5)\n"
						  + "{\n"
						  + "    System.out.println( false && false );\n"
						  + "}";
			this.choiceA = questArray.get(0);
			this.choiceB = questArray.get(1);
			this.choiceC = questArray.get(2);
			this.choiceD = "Don't pick this one";
			this.choiceE = "Or this one";
			this.answerKey = getAns(questArray, "false");
			this.answer = "Choice " + answerKey + " is correct. The boolean operator && only return true if both arguments are true.";
			break;
		case 2:
			ArrayList<String> qArray = createQuestion();
			System.out.println(qArray);
			this.question = qArray.get(0);
			this.choiceA = qArray.get(1);
			this.choiceB = qArray.get(2);
			this.choiceC = "Don't";
			this.choiceD = "Choose";
			this.answerKey = qArray.get(3).charAt(0);
			this.answer = "Choice " + answerKey + " is correct. " + qArray.get(4);
			break;
		/*case 3:
			
			this.question = "boolean bool = true;\r\n" + 
					"\r\n" + 
					"if ( !bool == true) {\r\n" + 
					"System.out.println(\"true\");\r\n" + 
					"}\r\n" + 
					"else {\r\n" + 
					"System.out.println(\"false\");\r\n" + 
					"} ";*/
		default:
			System.out.print("ERROR");
		}
	}
	
	private ArrayList<String> randomizeQuest(ArrayList<String> quest)
	{
		ArrayList<String> randomized = quest;
		String temp = "";
		int rand;
		for( int i = 0; i < quest.size(); i++)
		{
			rand = (int)Math.floor(Math.random()*quest.size());
			temp = randomized.get(i);
			randomized.set(i, randomized.get(rand));
			randomized.set(rand, temp);
		}
		return randomized;
	}
	
	private char getAns(ArrayList<String> quest, String ans)
	{
		char answer = 'X';
		
		for( int i = 0; i < quest.size(); i++ )
		{
			if(quest.get(i).contentEquals(ans))
			{
				answer = (char)(i+'A');
				break;
			}
		}
		
		return answer;
	}
	
	private ArrayList<String> createQuestion()
	{
		Random rand = new Random();
		ArrayList<String> qArray = new ArrayList<>();
		
		String OP = boolOp1[rand.nextInt(boolOp1.length)];
		String OP2 = boolOp2[rand.nextInt(boolOp2.length)];
		boolean arg1 = rand.nextBoolean();
		boolean arg2 = rand.nextBoolean();
		
		String question;
		question = String.format("What is " + OP2 + arg1 + " " + OP + " " + arg2 + "?");
		qArray.add(question); //Question at index 0
		
		qArray.add("true"); //Answer choices A and B at index 1 and 2, respectively
		qArray.add("false");
		
		boolean answer = true;
		String explanation = "";
		
		switch(OP) //Determines the answer and provides explanation
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
			System.out.println("ERROR at createQuestion class");
		}
			
		if(answer)//Determines letter that corresponds to answer and adds it at index 3
		{
			qArray.add("A");
		}
		else
		{
			qArray.add("B");
		}
		
		qArray.add(explanation);//adds explanation at index 4
		return qArray;
	}
}
