
package AP_Exam;

import java.util.Random;

import model_questions.Question;
import model_questions.QuestionTF;
import Util.ConsoleMethods;

/**
 * Class to show support for True False questions.
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class ProgrammingQuestions extends QuestionTF
{ 
	
    /**
     * Constructor for objects of class MathQuestions
     * 
     * @param  void
     */
    public ProgrammingQuestions()
    {	    	
    	// This outputs constructor being run
        ConsoleMethods.println("ProgrammingQuestions Constructor");
        
    }
    
    /**
     * Sets up a Math question according to instance variables (this...) in Question class
     *
     * @return void
     */
    @Override
    protected void setupQuestionData()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("ProgrammingQuestions setupQuestionData()");
        Random randomGenerator = new Random();

  		switch(randomGenerator.nextInt(3)) {
  			case 0:
  				super.setupQuestionData();
  				break;
  			case 1:
  				this.question = String.format("A double linked list contains a previous and next pointer?" );
  				this.answer = "A double linked list has data and both previous and next pointers.";
  				this.answerKey = charTrue;
  				break;
			default:
				this.question = String.format("An email viewer resembles a stack implementation?" );
  				this.answer = "The latest item on top of and email viewer resembles pushing an item on top of a stack.";
  				this.answerKey = charTrue;	
  		}
    }
    
    /**
     * Main test method to support console execution
     * 
     * @param  args		// satisfies default for Java
     * @return void
     */
    public static void main(String[] args)
    {
    	ConsoleMethods.println(mainTest());
    }
    
    /**
     * MainTest supports console execution and receiving write or wrong return message
     * 
     * @param  void
     * @return score / right or wrong
     */
    public static String mainTest()
    {
    	Question q = new ProgrammingQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
}
