package AP_Exam;
import model_questions.QuestionMC;

public class APS_PrimitiveTypes extends QuestionMC {
	
	
	public APS_PrimitiveTypes() {
		setupQuestion(qNumber);
	}
	
	public APS_PrimitiveTypes(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(3);
		}
		
		switch(qNumber) { //Primitive Types
		case 0:
			question = "Assume that a and b have been defined and initialized as int values. The expression\n "
					+  "!(!(a != b ) && (b > 7))\n" 
					+  "is equivalent to which of the following?";
			
			this.choiceA = "(a != b) || (b < 7)";
			this.choiceB = "(a != b) || (b <= 7)";
			this.choiceC = "(a == b) || (b <= 7)";
			this.choiceD = "(a != b) && (b <= 7)";
			this.choiceE = "(a == b) && (b > 7)";
			
			answerKey = 'B';
			answer = "(a != b) || (b <= 7)";
			break;
		case 1:
			question = "Assume that x and y have been declared and initialized with int values. Consider the following Java expression.\n" + 
					"\n" + 
					"(y > 10000) || (x > 1000 && x < 1500)\n" + 
					"\n" + 
					"Which of the following is equivalent to the expression given above?";
			
			this.choiceA = "(y > 10000 || x > 1000) && (y > 10000 || x < 1500)";
			this.choiceB = "(y > 10000 || x > 1000) || (y > 10000 || x < 1500)";
			this.choiceC = "(y > 10000) && (x > 1000 || x < 1500)";
			this.choiceD = "(y > 10000 && x > 1000) || (y > 10000 && x < 1500)";
			this.choiceE = "(y > 10000 && x > 1000) && (y > 10000 && x < 1500)";
			
			answerKey = 'A';
			answer = "(y > 10000 || x > 1000) && (y > 10000 || x < 1500)";
			break;
		case 2:
			question = "Consider the following code segment.\n" + 
					"\n" + 
					"int num = 2574;\n" + 
					"int result = 0;\n" + 
					"while (num > 0)\n" + 
					"{\n" + 
					"result = result * 10 + num % 10;\n" + 
					"num /= 10;\n" + 
					"}\n" + 
					"System.out.println(result);\n" + 
					"\n" + 
					"What is printed as a result of executing the code segment?\n";
			
			this.choiceA = "2";
			this.choiceB = "4";
			this.choiceC = "18";
			this.choiceD = "2574";
			this.choiceE = "4752";
			
			answerKey = 'E';
			answer = "4752";
			break;
		}		
	}
}
