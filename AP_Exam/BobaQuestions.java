package AP_Exam;

import java.util.Random;
//The class for all questions pertaining to MVC
public class BobaQuestions extends Question{
	public BobaQuestions()
    {
		//Sets up all the questions to be used by the question class so when called a 
		//question and answer is displayed and not null
    	setupQuestion();
    }
	
	public void setupQuestion() {
		//String array of questions
		String[] choices = new String[9];
		
		//Randomizes questions
		int random = (int) Math.floor(Math.random()*9);
		
		
		switch(random){
		case 0:
			//Question
			this.question = "Using String \"The most common black boba pearls are made of tapioca\", "
					+ "what would String.substring(2) return?";
			
			//Question Choices
			choices = answerArray("h","e", "e most common black boba pearls are made of tapioca",
					"he most common black boba pearls are made of tapioca", "hooloerafa");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			//Correct answer
			this.answerKey = getAns(choices, "e most common black boba pearls are made of tapioca");
			this.answer = "\"e most common black boba pearls are made of tapioca\"."
					+ "Boba pearls are chewy.";
			break;
			
		case 1:
			this.question = "Using String \"Classic boba drinks are made from milk tea\","
					+ "what would String.substring(8-10)) return?";
			
			choices = answerArray("milk","tea", "boba", 
					"drink", "made");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "boba");
			this.answer = "\"boba\". Is good";
			break;
			
		case 2:
			this.question = "Using String \"Boba tea can come in many flavors such as taro or mango\","
					+ "what would String.substring(10-20)) return?";
			
			choices = answerArray("n come in many","can come in many f", "an come in", 
					"an come in m", "tea can come in m");
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, "an come in");
			this.answer = "\"an come in\". You can pretty much add boba to anything really";
			break;

		default: 
			System.out.print("ERROR");
			
			
		}
	}
	
	//loadQuestArray loads an array with the 5 possible questions
	private String[] answerArray (String q0, String q1, String q2, String q3, String q4)
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
