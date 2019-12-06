package AP_Exam;

import java.util.Random;
//The class for all questions pertaining to MVC
public class BobaQuestions extends Question{
	public BobaQuestions()
    {
		//Sets up all the questions to be used by the question class so when called a 
		//question and answer is displayed and not null
		Random rand = new Random();
		 	Integer arg1 = rand.nextInt(1);
		 	Integer arg2 = rand.nextInt(20);
	 	    Integer arg3 = rand.nextInt(1);
			Integer arg4 = rand.nextInt(20);
		 	Integer arg5 = rand.nextInt(1);
		 	Integer arg6 = rand.nextInt(20);
			Integer arg7 = rand.nextInt(1);
		 	Integer arg8 = rand.nextInt(20);
			Integer arg9 = rand.nextInt(1);
			Integer arg10 = rand.nextInt(20);
		//Integer opIndex = rand.nextInt(operators.length);
			setupQuestion(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);

    }
	
	public void setupQuestion() {
		//String array of questions
		String[] choices = new String[9];
		
		//Randomizes questions
		int random = (int) Math.floor(Math.random()*9);
		
		Random rand = new Random();
		Integer arg1 = rand.nextInt(1);
    	Integer arg2 = rand.nextInt(20);
    	Integer arg3 = rand.nextInt(1);
	 	Integer arg4 = rand.nextInt(20);
	 	Integer arg5 = rand.nextInt(1);
	 	Integer arg6 = rand.nextInt(20);
		Integer arg7 = rand.nextInt(1);
		Integer arg8 = rand.nextInt(20);
		Integer arg9 = rand.nextInt(1);
		Integer arg10 = rand.nextInt(20);
		
		
		switch(random){
		case 0:
			//Question
			//set up random limits for substringing later
			
			
			String sentence = "The most common black boba pearls are made of tapioca";
			
			int i = rand.nextInt(11);
			this.question = "Using String \"The most common black boba pearls are made of tapioca\", "
					+ "what would String.substring(" + arg1 + ", "+ arg2 + ") return?";
			
			//Question Choices
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			//Correct answer
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;

			
		case 1:
			
			String sentence1 = "The most common black boba pearls are made of tapioca";
			
			this.question = "Using String \"Classic boba drinks are made from milk tea\","
					+ "what would String.substring(" + arg1 + ", "+ arg2 + ") return?";
			
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
			
		case 3:
			this.question = "Using String \"Cool boba places include ICMonster, Sharetea and MeetFresh\","
					+ "what would String.substring(5-15)) return?";
			
			choices = answerArray("boba places","boba places i", " boba place", 
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

//"The most common black boba pearls are made of tapioca", "Classic boba drinks are made from milk tea",
//"Boba can come in many flavors such as taro or mango", "Cool boba places include ICMonster, Sharetea and MeetFresh",
//"Boba is a drink with origins in Taiwan", "Each boba pearl is around 10-15 calories",
//"Boba can also be called pearl tea, tapioca tea, and bubble tea", 
//"Boba isn't the healthiest but it's G O D L Y", "A cool substitute for tapioca pearls are popping boba pearls"};