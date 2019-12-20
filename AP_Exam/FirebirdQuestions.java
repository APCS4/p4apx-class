package AP_Exam;
import java.util.*;

/**
 * @author Phoenix Dimagiba
 * @version 12/19/19
 */

//this is an ecletic collection, no specific topic
public class FirebirdQuestions extends Question{
	/**
     * calls setupQuestion -> load values and set up things
     */
	public FirebirdQuestions()
    {
    	setupQuestionData();
    	setupQuestion();
    }
	
	//setupQuestion methods sets up questions
	@Override 
	protected void setupQuestionData() {
        ConsoleMethods.println("mr. mort notice me please");
		// finds random number to determine next question
		Random rand = new Random();
		int random = rand.nextInt(4);
		
		switch(random){
		case 0:
			this.question = "Order the following data types from smallest to largest: int, short, double, byte";
			this.choiceA = "byte, short, int, double";
			this.choiceB = "byte, int, short, double";
			this.choiceC = "double, int, short, byte";
			this.choiceD = "short, double, byte, int";
			this.choiceE = "double, byte, int, short";
			this.answerKey = this.charA;
			this.answer = "byte, short, int, double";
			break;
		
		case 1:
			this.question = "Methods have what general syntax?";
			this.choiceA = "return_type method_name modifiers (arguments)";
			this.choiceB = "arguments method_name modifiers (return_type)";
			this.choiceC = "modifiers return_type method_name (argumdnts)";
			this.choiceD = "modifiers method_name arguments (return_type) ";
			this.choiceE = "None of the above";
			this.answerKey = this.charC;
			this.answer = "modifiers return_type method_name (argumdnts)";
			break;
		
		case 2:
			this.question = "What happens when you don't initialize the loop control variable?";
			this.choiceA = "Your compiler crashes.";
			this.choiceB = "Java produces an error message.";
			this.choiceC = "The code compiles but doesn't work correctly.";
			this.choiceD = "The compiler ignores the error.";
			this.choiceE = "";
			this.answerKey = this.charB;
			this.answer = "Java produces an error message.";
			break;
			
		case 3:
			this.question = "Given Val = (a < b) ? a : b; in what situation would Val = a?";
			this.choiceA = "a >= b";
			this.choiceB = "a > b";
			this.choiceC = "Val will never be b";
			this.choiceD = "a < b";
			this.choiceE = "a = b";
			this.answerKey = this.charD;
			this.answer = "a < b";
			break;
			
		case 4:
			this.question = "For loops have what general syntax?";
			this.choiceA = "for (expression1; expression2; statement3)\n	statement";
			this.choiceB = "for (statement1; expression2; expression3)\n	statement";
			this.choiceC = "for (statement1; expression2; statement3)\n		expression";
			this.choiceD = "for (expression1; statement2; statement3)\n		statement";
			this.choiceE = "for (statement1; expression2; statement3)\n		statement";
			this.answerKey = this.charE;
			this.answer = "for (statement1; expression2; statement3)\n	statement";
			break;
			
		
		// give feedback to user if they screw up
		default:
			System.out.print("It seems you've done something wrong.");
		}
	}
}