package AP_Exam;

import java.util.Random;
import java.lang.*;

/**
 * Power and Square Root Question Setup. 
 * Questioning the user based on the two functions from the math package, sqrt and pow
 *
 * @author Evan Knaggs, Neo Argatides
 * @version 12/6/2019
 * 
 */
public class PowSqrt extends Question
{ 
	private char[] operators = {'1', '2'};
	
    /**
     * Constructor for objects of class PowSqrt
     */
    public PowSqrt()
    {
    	Random rand = new Random();
    	
    	Integer base = rand.nextInt(30) + 1;
    	Integer rooted = rand.nextInt(25) + 1;
    
    	//Integer choose = rand.nextInt(2);
    	
    	Integer opIndex = rand.nextInt(operators.length);
    	setupQuestion(base, operators[opIndex], rooted);
    	
    	//Integer arg1 = rand.nextInt(50);
    	//Integer arg2 = (int)Math.sqrt((double)arg1);
    	//Integer opIndex = rand.nextInt(operators.length);
    	//setupQuestion(arg1, operators[opIndex], arg2);
    }

    
    public static String mainTest ()
    {
    	Question q = new MathQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * PowSqrt
     *
     * @param  square      argument for exponents
     * @param  which  operator in math expression (pow / sqrt)
     * @param  root      argument for square roots
     * @return    error code
     */
	@Override
    public void setupQuestion(int square, char which, int root)
    {   
		//question option for pow or sqrt (formats the question)
		if(which == '1')
		{
			this.question = String.format("What is pow(" + square + ", 2)?");
		}
		else
		{
			this.question = String.format("What is sqrt(" + root + ")?");
		}

        // format question choices (randomized)
        this.choiceA = String.format("%f",(float)square * (float)root);
        this.choiceB = String.format("%f",Math.pow((float)square, 2));
        this.choiceC = String.format("%f",(float)square / (float)root);
        this.choiceD = String.format("%f",Math.sqrt((float)root));
        this.choiceE = "None of the above";
        
        // real time calc answer based off args AND operator
        double answerCalc;
        switch(which)
        {
            case '1': // exponents
            	answerCalc = Math.pow(square, 2);
                this.answerKey = this.answerB;
                break;
            case '2': //square roots
            	answerCalc = Math.sqrt((float)root);
                this.answerKey = this.answerD;
                break;
            default: // not supported
            
                return;
        }
        
        //formats answer into string from above switch case
        if(which == '1')
        {
        	this.answer = String.format("pow(" + square + ", 2) = " + answerCalc);
        }
        else
        {
        	this.answer = String.format("sqrt(" + root + ") = " + answerCalc);
        }
        
        
    }
    
}
