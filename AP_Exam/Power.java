package AP_Exam;
import java.util.Random;

public class Power extends Question{
	/**
	 *  Author: Alex Clanton, Mithil Pujar
	 *	Power Button, rando questions and answers
	 *
	 *
	 *	Ver 1.0
	 */
	
	
	public Power()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		/**
		 * setup the question 
		 */
		
		
		int rando = (int) Math.floor(Math.random()*4);
		String[] pick = new String[5];
		
		int zero =2;

		switch(rando){
		/**
		 * every case is a question, with the order of questions and answers randomized
		 * done via arrays and a 2 method calls
		 *
		 *
		 */
		
		
		case 0:
			
			
			this.question = "What Iteration is a controlled by a programmer variable choice";
			
			pick = loadArray("Do While","Switch Case", "For", 
					"If,Else,For", "Thats done by the user");
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			
			
			
			this.answerKey = Ans(pick,"For");
			this.answer = "U got it homes";
			break;
		
		case 1:
			this.question = "What is the correct format for writing a for loop?";
			pick=loadArray("For:","for(int z=12; z<=103; z--);","for{in i=1: i<6:}", "for {int i = 1: i<=6:} ()", "for: a=1, b=2, i++" );
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			
			this.answerKey = Ans(pick, "for(int z=12; z<=103; z--);");
			this.answer = "U got it homes";
			break;
		
		case 2:
			
			this.question = "Which of the following is most closely associated with iterations?";
			pick=loadArray("loops such as for loops","Recursion","Instance Initialization","Public Static Void","if else statements");
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			this.answerKey = Ans(pick,"loops such as for loops");
			this.answer = "U got it homes";
			break;
		case 3:
		
			this.question = "Which of the following is most closely associated with iterations?";
			pick=loadArray("loops such as for loops","Recursion","Instance Initialzation Blocks","Public Static Void","if else statement");
			
			this.choiceA = pick[0];
			this.choiceB = pick[1];
			this.choiceC = pick[2];
			this.choiceD = pick[3];
			this.choiceE = pick[4];
			this.answerKey = 'A';
			this.answer = "U got it homes";
			break;
		/*
		case 4:
		
			this.question = "Consider the following code segment:\n for (int p = 1; p <= 100; k++)\n + if ((p % 4) == 0)\n + System.out.println(p);";
			this.choiceA = "for(intp=1;p<=25;p++)\n + System.out.println(p);";
			this.choiceB = "for(intp=1;p<=100;p=p+4)\n System.out.println(p);";
			this.choiceC = "for(intp=1;p<=100;p--)\n System.out.println(p % 9);";
			this.choiceD = "for(intp=4;p<=25;p=19*p)\n System.out.println(p);";
			this.choiceE = "for(intp=4;p<=100;p=p+4)\n System.out.println(p);";
			this.answerKey = 'E';
			break;
		
		*/
		default:
			System.out.print("elproblem");
		
		
		}
	}

	private String[] loadArray (String ques1, String ques2, String ques3, String ques4, String ques5)
	{
		/**
		 * 
		 */
		
		int rando; //random int placehold
		String[] pick = new String[5]; //temporary storage for questions
		
		String hold; //for swap algo
		
		//load questions into array
		pick[0] = ques1;
		pick[1] = ques2;
		pick[2] = ques3;
		pick[3] = ques4;
		pick[4] = ques5;
		
		
		for(int i = 0; i <5; i++)
		{
			hold = pick[i];
			rando = (int) Math.floor(Math.random() * 5);
			pick[i] = pick[rando];
			pick[rando] = hold;
			
		}
		return pick;	
	}
	
	
	private char Ans(String ques[], String an) {
		char ret;
		
		
		if(ques[0].equals(an) == true)
			ret = 'A';
		else if(ques[1].equals(an) == true)
			ret = 'B';
		else if(ques[2].equals(an) == true)
			ret = 'C';
		else if(ques[3].equals(an) == true)
			ret = 'D';
		else if(ques[4].equals(an) == true)
			ret = 'E';
		else ret = 'X'; 
		
		return ret;
	}
	
}
	
	
	
