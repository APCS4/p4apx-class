package AP_Exam;

import java.util.Random;

import Util.ConsoleMethods;	// Console support

/**
 * Boba questions with substrings
 *
 * @author Team Boba: Grace Liu and Cynthia Li 
 * @version 6.9
 */



//hello I am here to tell you that 
//the name of your team is very inappropriate 
//and you should change it before china finds this code

//also your formatting is bad, Mr. L would give you a 0/50 
//or in his words "Formatting Horrible, Pseudocode missing, Doesn't even work 0/50"


public class BobaQuestions extends Question{
	private Integer arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10;
	
	public BobaQuestions()
    {
		System.out.println("Boba");

		//Sets up all the questions to be used by the question class so when called a 
		//question and answer is displayed and not null
		Random rand = new Random();
		 //answer set	
		    arg1 = rand.nextInt(20);
		 	arg2 = rand.nextInt(20);
		if (arg1 < arg2)
		 {
			arg1 = arg1;
			arg2 = arg2;
		 }
		else
		 {
			int temp = arg1;
	        arg1 = arg2;
	        arg2 = temp;
		 }
		//set 2
	 	    arg3 = rand.nextInt(20);
			arg4 = rand.nextInt(20);
	    if (arg3 < arg4)
			 {
				arg3 = arg3;
				arg4 = arg4;
			 }
		else
			 {
				int temp = arg3;
		        arg3 = arg4;
		        arg4 = temp;
			 }
		
	    //set 3
		 	arg5 = rand.nextInt(20);
		 	arg6 = rand.nextInt(20);
		if (arg5 < arg6)
			 {
				arg5 = arg5;
				arg6 = arg6;
			 }
		else
			 {
				int temp = arg5;
		        arg5 = arg6;
		        arg6 = temp;
			 }
			
		//set 4
		   arg7 = rand.nextInt(20);
		 	arg8 = rand.nextInt(20);
		if (arg7 < arg8)
			 {
				arg7 = arg7;
				arg8 = arg8;
			 }
		else
			 {
				int temp = arg7;
		        arg7 = arg8;
		        arg8 = temp;
			 }
			
		//set 5
		    arg9 = rand.nextInt(20);
			arg10 = rand.nextInt(20);
		if (arg9 < arg10)
			 {
				arg9 = arg9;
				arg10 = arg10;
			 }
		else
			 {
				int temp = arg9;
		        arg9 = arg10;
		        arg10 = temp;
			 }
		


		//Integer opIndex = rand.nextInt(operators.length);
			setupQuestionData();
			setupQuestion();
 
    }
	
	
	 /**
     * Sets up a Binary Math questions according to instance variables (this...) in Question class
     *
     * @return    void
     * @Override
     */
    
	

	
	protected void setupQuestionData() {
		//String array of answers
		String[] choices = new String[5];
		
		//Randomizes questions
		Random rand = new Random();
		int random = rand.nextInt(8);;
		
		/*
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
		*/
		
		System.out.println(arg1 + " " + arg2);

		
		
		//Create sentence and choices.
		String sentence;
		
		switch(random){
		
		case 0:
			//Question
			//set up random limits for substringing later
			System.out.println("Here 0");

			sentence = "The most common black boba pearls are made of tapioca";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));

			this.question = String.format("Using String \"The most common black boba pearls are made of tapioca\", "
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			//Question Choices
			
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
			System.out.println("Here 1");

			sentence = "Classic boba drinks are made from milk tea";			
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Classic boba drinks are made from milk tea\", "
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 2: 
			System.out.println("Here 2");

			sentence = "Boba tea can come in many flavors such as taro or mango";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Boba tea can come in many flavors such as taro or mango\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 3:
			System.out.println("Here 3");

			sentence = "Cool boba places include ICMonster, Sharetea and MeetFresh";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Cool boba places include ICMonster, Sharetea and MeetFresh\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 4:
			System.out.println("Here 4");

			sentence = "Boba is a drink with origins in Taiwan";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Boba is a drink with origins in Taiwan\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 5:
			System.out.println("Here 5");

			sentence = "Each boba pearl is around 10-15 calories";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Each boba pearl is around 10-15 calories\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 6:
			System.out.println("Here 6");

			sentence = "Boba can also be called pearl tea, tapioca tea, and bubble tea";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"Boba can also be called pearl tea, tapioca tea, and bubble tea\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 7:
			System.out.println("Here 7");

			sentence = "The average cup of boba milk tea contains 299 calories and 38 grams of sugar";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"The average cup of boba milk tea contains 299 calories and 38 grams of sugar\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
		case 8:
			System.out.println("Here 8");

			sentence = "A cool substitute for tapioca pearls are popping boba pearls";
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));
			
			this.question = String.format("Using String \"A cool substitute for tapioca pearls are popping boba pearls\","
					+ " what would String.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];

			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;

		default:
			this.choiceA = "ERROR";
			this.choiceB = "ERROR";
			this.choiceC = "ERROR";
			this.choiceD = "ERROR";
			this.choiceE = "ERROR";
			System.out.print("ERROR");
			
			
		}
	}
	
	//loadQuestArray loads an array with the 5 possible questions
		private String[] answerArray(String q0, String q1, String q2, String q3, String q4)
		{
			int rand;
			String[] choices = new String[5]; //temporary storage for questions
			
			String hold;
			
			//make array
			choices[0] = q0;
			choices[1] = q1;
			choices[2] = q2;
			choices[3] = q3;
			choices[4] = q4;
			
			//swap the Strings 
			for(int i = 0; i < 4; i++)
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
			char returnVal;
			
			//Compares each question in array to the correct answer string
			if(quests[0].equals(ans) == true)
				returnVal = 'A';
			else if(quests[1].equals(ans) == true)
				returnVal = 'B';
			else if(quests[2].equals(ans) == true)
				returnVal = 'C';
			else if(quests[3].equals(ans) == true)
				returnVal = 'D';
			else if(quests[4].equals(ans) == true)
				returnVal = 'E';
			else returnVal = 'X'; //default case for if there is an error
			
			return returnVal;
		}
		
	}