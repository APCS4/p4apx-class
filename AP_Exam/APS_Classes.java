package AP_Exam;

import model_questions.QuestionMC;

public class APS_Classes extends QuestionMC {
	public APS_Classes() {
		setupQuestion(qNumber);
	}
	
	public APS_Classes(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(3);
		}
	
		switch(qNumber) {
		case 0:
			question = "A car dealership needs a program to store information about the cars for sale. "
					+ "For each car, they want to keep track of the following information: number of doors (2 or 4), "
					+ "whether the car has air conditioning, and its average number of miles per gallon. "
					+ "Which of the following is the best design?";
			
			this.choiceA = "Use one class, Car, which has three data fields: "
					+ "int numDoors, boolean hasAir, and double milesPerGallon.";
			this.choiceB = "Use four unrelated classes: Car, Doors, AirConditioning, and MilesPerGallon.";
			this.choiceC = "Use a class Car which has three subclasses: Doors, AirConditioning, and MilesPerGallon.";
			this.choiceD = "Use a class Car, which has a subclass Doors, with a subclass AirConditioning, with a subclass MilesPerGallon.";
			this.choiceE = "Use classes: Doors, AirConditioning, and MilesPerGallon, each with a subclass Car.";
			
			answerKey = 'A';
			answer = "Use one class, Car, which has three data fields: " + 
					 "int numDoors, boolean hasAir, and double milesPerGallon.";
			break;
		case 1:
			question = "Consider the following instance variable and method.\n" + 
					"private int[] arr;\n" + 
					"/** Precondition: arr.length > 0 */\n" + 
					"public int checkArray() {\n" + 
					"int loc = arr.length / 2;\n" + 
					"for (int k = 0; k < arr.length; k++) {\n" + 
					"if (arr[k] > arr[loc]) loc = k;\n" + 
					"}\n" + 
					"return loc; }\n" + 
					"Which of the following is the best postcondition for checkArray ?";
			
			this.choiceA = "Returns the index of the first element in array\n" + 
					"is greater than arr[loc]";
			this.choiceB = "Returns the index of the last element in array\n" + 
					"greater than arr[loc]";
			this.choiceC = "Returns the largest value in array arr";
			this.choiceD = "Returns the index of the largest value in array arr";
			this.choiceE = "Returns the index of the largest value in the second half of array arr";
			
			answerKey = 'D';
			answer = "Returns the index of the largest value in array arr";
			break;
		case 2:
			question = "public class TimeRecord\n" + 
					"{\n" + 
					"private int hours;\n" + 
					"private int minutes; //0,5minutes,60\n" + 
					"public TimeRecord(int h, int m)\n" + 
					" {\n" + 
					"hours = h;\n" + 
					"minutes = m;\n" + 
					" }\n" + 
					"/** @return the number of hours */ \n" + 
					"public int getHours()\n" + 
					"{ /* implementation not shown */ } \n" + 
					"\n" + 
					"/** @return the number of minutes\n" + 
					"* Postcondition: 0 ≤ minutes < 60 */ \n" + 
					"public int getMinutes()\n" + 
					"{ /* implementation not shown */ } \n" + 
					"\n" + 
					"/** Adds h hours and m minutes to this TimeRecord\n" + 
					"*@param  h the number of hours \n" + 
					"*    Precondition: h ≥ 0\n" + 
					"*@param m the number of minutes\n" + 
					"*    Precondition: m ≥ 0 \n" + 
					"*/\n" + 
					"\n" + 
					"public void advance(int h, int m) \n" + 
					"{ \n" + 
					"hours = hours + h; \n" + 
					"minutes = minutes + m; \n" + 
					"/* missing code */ } \n" + 
					"}\n" + 
					"// ... other methods not shown } \n" + 
					"Which of the following can be used to replace /* missing code */ so that advance will correctly update the time?";
			
			this.choiceA = "minutes = minutes % 60;";
			this.choiceB = "minutes = minutes + hours % 60;";
			this.choiceC = "hours = hours + minutes / 60;\n"
						 + "minutes = minutes % 60;";
			this.choiceD = "hours = hours + minutes % 60;\n"
					   	 + "minutes = minutes / 60;";
			this.choiceE = "hours = hours + minutes / 60;";
			
			answerKey = 'C';
			answer = "hours = hours + minutes / 60;\n"
					 + "minutes = minutes % 60;";
			break;
		case 3:
			question = "public class TimeRecord\n" + 
					"{\n" + 
					"private int hours;\n" + 
					"private int minutes; //0,5minutes,60\n" + 
					"public TimeRecord(int h, int m)\n" + 
					" {\n" + 
					"hours = h;\n" + 
					"minutes = m;\n" + 
					" }\n" + 
					"/** @return the number of hours */ \n" + 
					"public int getHours()\n" + 
					"{ /* implementation not shown */ } \n" + 
					"\n" + 
					"/** @return the number of minutes\n" + 
					"* Postcondition: 0 ≤ minutes < 60 */ \n" + 
					"public int getMinutes()\n" + 
					"{ /* implementation not shown */ } \n" + 
					"\n" + 
					"/** Adds h hours and m minutes to this TimeRecord\n" + 
					"*@param  h the number of hours \n" + 
					"*    Precondition: h ≥ 0\n" + 
					"*@param m the number of minutes\n" + 
					"*    Precondition: m ≥ 0 \n" + 
					"*/\n" + 
					"\n" + 
					"public void advance(int h, int m) \n" + 
					"{ \n" + 
					"hours = hours + h; \n" + 
					"minutes = minutes + m; \n" + 
					"/* missing code */ } \n" + 
					"}\n" + 
					"// ... other methods not shown } \n" + 
					"/*Consider the following declaration that appears in a client program.*/\n" + 
					"TimeRecord[] timeCards 5 new TimeRecord[100]; \n" + 
					"\n" + 
					"/*Assume that timeCards has been initialized with TimeRecord objects. Consider the following code segment that is intended to compute the total of all the times stored in timeCards. */\n" + 
					"\n" + 
					"TimeRecord total = new TimeRecord(0,0); \n" + 
					"for (int k = 0; k < timeCards.length; k++) { \n" + 
					"/* missing expression */ ; \n" + 
					"} \n" + 
					"\n" + 
					"/*Which of the following can be used to replace\n" + 
					"/* missing expression */ so that the code segment will work as intended?";
			
			this.choiceA = "timeCards[k].advance()";
			this.choiceB = "total += timeCards[k].advance()";
			this.choiceC = "total.advance(timeCards[k].hours, timeCards[k].minutes)";
			this.choiceD = "total.advance(timeCards[k].getHours(), timeCards[k].getMinutes())";
			this.choiceE = "timeCards[k].advance(timeCards[k].getHours(), timeCards[k].getMinutes())";
			
			answerKey = 'D';
			answer = "total.advance(timeCards[k].getHours(), timeCards[k].getMinutes())";
			break;
		}
	}
}
