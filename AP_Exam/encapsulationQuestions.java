package AP_Exam;

import java.util.Random;

public class encapsulationQuestions extends Question {

	int lineN = 0; 

	
	public encapsulationQuestions() {
		
		
		Random rand = new Random();
		int r = rand.nextInt(3);
		
		switch(r) { 
		
		case 0: //This is question 1 
		lineN = this.lineNumber("@question1");
			
			
		case 1: 
		lineN = this.lineNumber("@question1");
			
		case 2: 
		lineN = this.lineNumber("@question1");	
		
		
		}
		
	} 
	
	private String restofLine(String a) {
		
		return null; 
	}
	
	private int lineNumber(String b) {
		return 0; 
	}
	
}
