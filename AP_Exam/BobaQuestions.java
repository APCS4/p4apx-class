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
		//String array of answers
		String[] choices = new String[5];
		
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
		
		//Create sentence and choices.
		String sentence;
		
		switch(random){
		
		case 0:
			//Question
			//set up random limits for substringing later
			
			sentence = "The most common black boba pearls are made of tapioca";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			int i = rand.nextInt(11);
			this.question = "Using String \"The most common black boba pearls are made of tapioca\", "
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			//Question Choices
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			//Correct answer
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". And tapioca is from cassava plant roots!" ;
			break;

			
		case 1:
			
			sentence = "Classic boba drinks are made from milk tea";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Classic boba drinks are made from milk tea\", "
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". You can use any type of tea too.";
			break;
			
		case 2:
			
			sentence = "Boba tea can come in many flavors such as taro or mango";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Boba tea can come in many flavors such as taro or mango\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". You can pretty much add boba to anything really";
			break;
			
		case 3:
			
			sentence = "Cool boba places include ICMonster, Sharetea and MeetFresh";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Cool boba places include ICMonster, Sharetea and MeetFresh\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". Too bad the good places are all the way in Mira Mesa though rip ";
			break;
			
		case 4:
			
			sentence = "Boba is a drink with origins in Taiwan";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Boba is a drink with origins in Taiwan\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". The name \"boba\" has Chinese origins too. ";
			break;
			
		case 5:
			
			sentence = "Each boba pearl is around 10-15 calories";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Each boba pearl is around 10-15 calories\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". Not a very healthy drink rip ";
			break;
			
		case 6:
			
			sentence = "Boba can also be called pearl tea, tapioca tea, and bubble tea";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"Boba can also be called pearl tea, tapioca tea, and bubble tea\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". If you don't use the og name boba tho shame on you :) jkjk";
			break;
			
		case 7:
			
			sentence = "The average cup of boba milk tea contains 299 calories and 38 grams of sugar";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"The average cup of boba milk tea contains 299 calories and 38 grams of sugar\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". It's unhealthy but so GODLY FJFHGFUDJ";
			break;
			
		case 8:
			
			sentence = "A cool substitute for tapioca pearls are popping boba pearls";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = "Using String \"A cool substitute for tapioca pearls are popping boba pearls\","
					+ "what would String.substring(" + arg1 + ", " + arg2 + ") return?";
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = "\"" + sentence.substring(arg1, arg2) + "\". Mini water balloons filled with juice.";
			break;

		default: 
			System.out.print("ERROR");
			
			
		}
	}
	
	//loadQuestArray loads an array with the 5 possible questions
		private String[] answerArray (String q0, String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8)
		{
			int rand; //random int placehold
			String[] choices = new String[9]; //temporary storage for questions
			
			String hold; //for swap algo
			
			//load questions into array
			choices[0] = q0;
			choices[1] = q1;
			choices[2] = q2;
			choices[3] = q3;
			choices[4] = q4;
			choices[5] = q5;
			choices[6] = q6;
			choices[7] = q7;
			choices[8] = q8;
			
			//randomly swap the Strings 
			for(int i = 0; i <8; i++)
			{
				hold = choices[i];
				rand = (int) Math.floor(Math.random() * 8);
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