package AP_Exam;

import java.util.ArrayList;
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
		int random = rand.nextInt(1);
		ArrayList<String> questArray = new ArrayList<>();
		
		switch(random)
		{
		case 0:
			questArray.clear();
			questArray.add("^");
			questArray.add("||");
			questArray.add("!=");
			questArray.add("%");
			questArray = randomizeQuest(questArray);
			System.out.print(questArray);
			this.question = "Which of the following is NOT a boolean operator?\n"
						  + "^, ||, !=, %";
			this.choiceA = questArray.get(0);
			this.choiceB = questArray.get(1);
			this.choiceC = questArray.get(2);
			this.choiceD = questArray.get(3);
			this.answerKey = getAns(questArray, "%");
			this.answer = "Choice D is correct. % is not a boolean operator";
			break;
		case 1:
			this.question = "What is the output of the following code?\n"
						  + "if(3 < 5)\n"
						  + "{\n"
						  + "    System.out.println( false && false );\n"
						  + "}";
			this.choiceA = "true";
			this.choiceB = "false";
			this.choiceC = "The code does not execute";
			break;
		default:
			System.out.print("ERROR");
		}
	}
	
	private ArrayList<String> randomizeQuest(ArrayList<String> quest)
	{
		String temp = "";
		int rand;
		for( int i = 0; i < quest.size(); i++)
		{
			rand = (int)Math.floor(Math.random()*quest.size());
			temp = quest.get(i);
			quest.set(i, quest.get(rand));
			quest.set(rand, temp);
		}
		return quest;
	}
	
	private char getAns(ArrayList<String> quest, String ans)
	{
		char answer;
	
		if(quest.size() > 0 && quest.get(0).contentEquals(ans))
		{
			answer = 'A';
		}
		else if(quest.size() > 1 && quest.get(1).contentEquals(ans))
		{
			answer = 'B';
		}
		else if(quest.size() > 2 && quest.get(2).contentEquals(ans))
		{
			answer = 'C';
		}
		else if(quest.size() > 3 && quest.get(3).contentEquals(ans))
		{
			answer = 'D';
		}
		else if(quest.size() > 4 && quest.get(4).contentEquals(ans))
		{
			answer = 'E';
		}
		else
		{
			answer = 'X';
		}
		
		return answer;
	}
	
}
