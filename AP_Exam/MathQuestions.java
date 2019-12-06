package AP_Exam;

import java.util.Random;

/**
 * Class to support divide and modulo Math questions.
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class MathQuestions extends Question
{ 
	private char[] operators = {'/', '%'};
	
    /**
     * Constructor for objects of class MathQuestions
     * @param  void
     */
    public MathQuestions()
    {
    	Random rand = new Random();
    	Integer arg1 = rand.nextInt(50);
    	Integer arg2 = (int)Math.sqrt((double)arg1);
    	Integer opIndex = rand.nextInt(operators.length);
    	setupQuestion(arg1, operators[opIndex], arg2);
    }

    /**
     * Main test method to support console execution
     * @param  void
     * @return void
     */
    public static String mainTest ()
    {
    	Question q = new MathQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * MathDivOps question setup
     *
     * @param  arg1      1st argument in math expression
     * @param  operator  operator in math expression (/ or % only)
     * @param  arg2      2st argument in math expression
     * @return void
     */
	@Override
    public void setupQuestion(int arg1, char operator, int arg2)
    {        
        // format question
        this.question = String.format("What is (int)" + arg1 + " " + "%s" + " (int)" + arg2, operator );
        
        // format question choices
        this.choiceA = String.format("%f",(float)arg1/(float)arg2);
        this.choiceB = String.format("%x",arg1/arg2);
        this.choiceC = String.format("%f",(float)arg1*(float)arg2);
        this.choiceD = String.format("%x",arg1%arg2);
        this.choiceE = "None of the above";
        
        // real time calc answer based off args AND operator
        int answerCalc;
        switch(operator)
        {
            case '/':
                answerCalc = arg1 / arg2;
                this.answerKey = this.answerB;
                break;
            case '%':
                answerCalc = arg1 % arg2;
                this.answerKey = this.answerD;
                break;
            default: // not supported
                return;
        }
        
        // format question answer based off of operation calculation
        this.answer =  String.format(
            "(int)"+arg1 +          // arg1
            " "+
            "%s"+                   // operator
            " " +        
            "(int)"+ arg2 +         // arg2
            " = " + 
            answerCalc              // answer
            ,operator);             // operator parameter % 
                                    // requires var (may be hidden feature :)
        
        
    }
    
}
