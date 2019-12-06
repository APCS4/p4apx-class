package AP_Exam;

import java.util.Random;

public class encapsulationQuestions extends Question {
	String[] question1 = new String[7]; 
	String[] question2 = new String[7];
	String[] question3 = new String[7];
	
	  
	
	public encapsulationQuestions() {
		
		this.setQuestions();
		Random rand = new Random();
		int randQ = rand.nextInt(3);
		
		switch(randQ) {
		case 1: 
			this.question = question1[0];
			this.choiceA = question1[1];
			this.choiceB = question1[2];
			this.choiceC = question1[3];
			this.choiceD = question1[4];
			char a = question1[5].charAt(0);
			this.answerKey = a;
			break;
		case 2: 
			this.question = question2[0];
			this.choiceA = question2[1];
			this.choiceB = question2[2];
			this.choiceC = question2[3];
			this.choiceD = question2[4];
			 a = question2[5].charAt(0);
			this.answerKey = a;
			break;
		case 3: 
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
		
		question1[0] = "What is encapsulation?";
		question1[1] = "It is a way of combining various data members into a single unit";
		question1[2] = "It is a way of combining various member functions into a single unit";
		question1[3] = "It is a way of combining various data members and member functions into a single unit which can oaperate on any data";
		question1[4] = "It is a way of combining various data members and member functions that operate on those16 data members into a single unit";
		question1[5] = "C";
	
		
		question2[0] = "If data members are private, what can we do to access them from the class object? ";
		question2[1] = "Create public methods to access those data members";
		question2[2] = "Create private member methods to access those data members";
		question2[3] = "Create protected member methods to access those data members";
		question2[4] = " Private data members can never be accessed from outside the class";
		question2[5] = "A";
		
		
		question3[0] = "Which feature can be implemented using encapsulation?";
		question3[1] = "Inheritance";
		question3[2] = "Abstraction";
		question3[3] = "Polymorphism";
		question3[4] = "Overloading";
		question3[5] = "B";

		 
	}

	
}
