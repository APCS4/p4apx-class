package AP_Exam;

import java.util.Random;

public class encapsulationQuestions extends Question {
	String[] question1 = new String[7]; 
	String[] question2 = new String[7];
	String[] question3 = new String[7];
	
	  
	
	public encapsulationQuestions() {
		
		this.setQuestions();
		
		Random rand = new Random();
		int r = rand.nextInt(3);
		
		switch(r) { 
		case 0: 
			
		case 1: 
			this.question = question2[0];
			this.choiceA = question2[1];
			this.choiceB = question2[2];
			this.choiceC = question2[3];
			this.choiceD = question2[4];
			 a = question2[5].charAt(0);
			this.answerKey = a;
			break;
		case 2: 
			this.question = question3[0];
			this.choiceA = question3[1];
			this.choiceB = question3[2]; 
			this.choiceC = question3[3];
			this.choiceD = question3[4];
			 a = question3[5].charAt(0);
			this.answerKey = a;
			break;
		
		}
		
	} 
	
	
	
	private void setQuestions() {
				 
	}

	
}
