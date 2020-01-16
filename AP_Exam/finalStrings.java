package AP_Exam;

import java.util.Random;

import model_questions.Question;

/**
 * Consolidation of all string type questions
 * JoshSkylerStringQuestions, BobaQuestions, StringQuestions
 *
 * @author Cynthia Li 
 * @team   Period 4 modeling
 */


public class finalStrings extends Question{
	
	private Integer arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10;
	
	public finalStrings()
    {

		Random rand = new Random();
		
		 //answer set	
		arg1 = rand.nextInt(20);
		arg2 = rand.nextInt(20);
		if (arg1 > arg2)
		 {
			int temp = arg1;
	        arg1 = arg2;
	        arg2 = temp; 
		 }
		
		//set 2
	 	arg3 = rand.nextInt(20); 
	 	arg4 = rand.nextInt(20);
	    if (arg3 > arg4)
			 {
				int temp = arg3;
		        arg3 = arg4;
		        arg4 = temp;
			 }
		
	    //set 3
		arg5 = rand.nextInt(20);
		arg6 = rand.nextInt(20);
		 	
		if (arg5 > arg6)
			 {
				int temp = arg5;
		        arg5 = arg6;
		        arg6 = temp;
			 }
			
		//set 4
		arg7 = rand.nextInt(20);
		arg8 = rand.nextInt(20);
		if (arg7 > arg8)
			 {
				int temp = arg7;
		        arg7 = arg8;
		        arg8 = temp;
			 }
			
		//set 5
		arg9 = rand.nextInt(20);
		arg10 = rand.nextInt(20);	
		if (arg9 > arg10)
			 {
				int temp = arg9;
		        arg9 = arg10;
		        arg10 = temp;
			 }
		
		System.out.println(arg1 + " " + arg2);
		System.out.println(arg3 + " " + arg4);
		System.out.println(arg5 + " " + arg6);
		System.out.println(arg7 + " " + arg8);
		System.out.println(arg9 + " " + arg10);
		
			
		setupQuestionData();
		setupQuestion();
 
    }

	
	protected void setupQuestionData() {
		
		Random rand = new Random();
		int random = rand.nextInt(4);
		
		
		switch(random){
		
		case 0:
			System.out.println("Case 0");

			String[] sentences = new String[9];
			sentences[0] = "The most common black boba pearls are made of tapioca";
			sentences[1] = "Classic boba drinks are made from milk tea";
			sentences[2] = "Boba tea can come in many flavors such as taro or mango";
			sentences[3] = "Cool boba places include ICMonster, Sharetea and MeetFresh";
			sentences[4] = "Boba is a drink with origins in Taiwan";
			sentences[5] = "Each boba pearl is around 10-15 calories";
			sentences[6] = "Boba can also be called pearl tea, tapioca tea, and bubble tea";
			sentences[7] = "The average cup of boba milk tea contains 299 calories and 38 grams of sugar";
			sentences[8] = "A cool substitute for tapioca pearls are popping boba pearls";
			
			Random random1 = new Random();
			int randp = random1.nextInt(8);
	         
			String sentence;
			sentence = sentences[randp];
			
			choices = answerArray(sentence.substring(arg1, arg2), sentence.substring(arg3, arg4), 
					sentence.substring(arg5, arg6), sentence.substring(arg7, arg8), sentence.substring(arg9, arg10));

			this.question = String.format("If String boba = \"" + sentences[randp] + ";\", "
					+ " what would boba.substring(" + arg1 + ", " + arg2 + ") return?");
			
			this.choiceA = choices[0];
			this.choiceB = choices[1];
			this.choiceC = choices[2];
			this.choiceD = choices[3];
			this.choiceE = choices[4];
			
			this.answerKey = getAns(choices, sentence.substring(arg1, arg2));
			this.answer = sentence.substring(arg1, arg2);
			break;
			
			
		case 1:
			System.out.println("case 1");
			
			char[] charList = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    	Shuffle shuffle = new Shuffle();
	    	String arg1 = (shuffle.Phrase(charList)).substring(0, 11);
	    	
			Random rando = new Random();
			
			int bound1, bound2;
	        
			bound1 = rando.nextInt(5)+1;
			bound2 = rando.nextInt(4)+7;				
	        
	        this.question = String.format("What is the result of the method '.substring(" + bound1 + "," + bound2 + ") ' on " + arg1  + "?");
	        
	        this.choiceA = arg1.substring(bound1 - 1, bound2 + 1 );
	        this.choiceB = arg1.substring(bound1, bound2); //correct answer
	        this.choiceC = arg1.substring(bound1 + 1 , bound2 - 1);
	        this.choiceD = arg1.substring(bound1 - 1, bound2);
	        this.choiceE = "Null";
	        
	        this.answerKey = this.charB;
	        this.answer =  String.format(arg1.substring(bound1,bound2));
	        break;
	        
	        
		case 2:
			System.out.println("case 2");
			
        	this.question = String.format(
        		"String holiday = Christmas \n"
        		+ "String star \n"
        		+ "int len = holiday.length() \n"
        		+ "star = holiday.substring(0, (len/3)) \n"
        		+ "System.out.println (star) \n"
        		+ "what does star print out as? \n");

		        this.choiceA = String.format("Chrism");
		        this.choiceB = String.format("Chr");
		        this.choiceC = String.format("Christ");
		        this.choiceD = String.format("Ch");
		        this.choiceE = "None of the above";
		        
		        this.answerKey = this.charB;
		        this.answer = "Chr \n";
		        break;
		        
        case 3:
			System.out.println("case 3");
			
        	   this.question = String.format(
        	            "Given \n" +
        	            "String s = SYRUPS \n" +
        	            "int index = s.substring(1, 4).indexOf(S) \n" +
        	            "what is value of index? \n");

        	   this.choiceA = String.format("0");
               this.choiceB = String.format("2");
               this.choiceC = String.format("5");
               this.choiceD = String.format("1");
               this.choiceE = String.format("-1");
               
               this.answerKey = this.charD;               
               this.answer = "1 \n";  
               break;
               
        case 4:
        	   System.out.println("case 4");
			
        	   this.question = String.format(
        	              "private String s; \n"
        	            + "private int n; \n"
        	            + "public void changer(String x, int y)"
        	            + "{ \n "
        	            + "x = x + \"Christmas\" \n"
        	            + "y = y*2 \n"
        	            + "Assume s has the value \"merry\" and n = 6. What are the values of s & n after the call changer(s, n)? \n");
     
				this.choiceA = String.format("s = merry, n = 6");
				this.choiceB = String.format("s = merry christmas, n = 6");
				this.choiceC = String.format("s = merry, n = 12");
				this.choiceD = String.format("s = merry christmas, n = 12");
				this.choiceE = String.format("s = christmas, n = 12");

				this.answerKey = this.charD;
				this.answer = "s = merry christmas, n = 12";
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
	
		private String[] answerArray(String q0, String q1, String q2, String q3, String q4)
		{
			int rand;
			String[] choices = new String[5];
			
			String hold;
			
			choices[0] = q0;
			choices[1] = q1;
			choices[2] = q2;
			choices[3] = q3;
			choices[4] = q4;
			
			for(int i = 0; i < 4; i++)
			{
				hold = choices[i];
				rand = (int) Math.floor(Math.random() * 5);
				choices[i] = choices[rand];
				choices[rand] = hold;
				
			}
			return choices;	
		}
		
		private char getAns(String quests[], String ans) {
			char returnVal;
			
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
			else returnVal = 'X';
			
			return returnVal;
		}
		
		public class Shuffle {
			public String Phrase(char[] input) {
				Random rand = new Random();
				int secondI=0;   
			       do{
			       int randomInt1 = rand.nextInt(input.length);
			       int randomInt2 = rand.nextInt(input.length);
			       
			       if(randomInt1 == randomInt2)
			       {
			    randomInt1 = ((randomInt2 + 1)%(input.length));     
			       }
			        char temp1 = input[randomInt1];
			        char temp2 = input[randomInt2];
			        input[randomInt1] = temp2;
			        input[randomInt2] = temp1; 
			        secondI++;
			    } while(secondI<100);
			       
			       String output = new String(input);
			       return output;
			}
		
	}}