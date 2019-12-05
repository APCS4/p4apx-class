package AP_Exam;

import java.util.Random;
import java.lang.*;

/**
 * Write a description of class MathOps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PowSqrt extends Question
{ 
	private char[] operators = {'1', '2'};
	
    /**
     * Constructor for objects of class MathQuestions
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
     * MathDivOps 
     *
     * @param  arg1      1st argument in math expression
     * @param  operator  operator in math expression (/ or % only)
     * @param  arg2      2st argument in math expression
     * @return    error code
     */
	@Override
    public void setupQuestion(int square, char which, int root)
    {   
		double convert;
		//int randoom;
        // format question
		if(which == '1')
		{
			//this.question = String.format("What is " + square + " squared?");
			this.question = String.format("What is pow(" + square + ", 2)?");
		}
		else
		{
			//this.question = String.format("What is the square root of " + root + "?");
			this.question = String.format("What is sqrt(" + root + ")?");
		}
		
        //this.question = String.format("What is (int)" + arg1 + " " + "%s" + " (int)" + arg2, operator );
        
        // format question choices
        this.choiceA = String.format("%f",(float)square * (float)root);
        this.choiceB = String.format("%f",Math.pow((float)square, 2));
        this.choiceC = String.format("%f",(float)square / (float)root);
        this.choiceD = String.format("%f",Math.sqrt((float)root));
        this.choiceE = "None of the above";
        
        // real time calc answer based off args AND operator
        double answerCalc;//hello again
        switch(which)
        {
            case '1':
            	answerCalc = Math.pow(square, 2);
                //answerCalc = (int) Math.round((double)convert);
                this.answerKey = this.answerB;
                break;
            case '2':
            	answerCalc = Math.sqrt((float)root);
                //answerCalc = (int) Math.round((double)convert);
                this.answerKey = this.answerD;
                break;
            default: // not supported
            
                return;
        }
        
        if(which == '1')
        {
        	//this.answer = String.format(square + " squared = " + answerCalc);
        	this.answer = String.format("pow(" + square + ", 2) = " + answerCalc);
        }
        else
        {
        	//this.answer = String.format("The square root of " + root + " = " + answerCalc);
        	this.answer = String.format("sqrt(" + root + ") = " + answerCalc);
        }
        /* format question answer based off of operation calculation
        this.answer =  String.format(
            "(int)"+arg1 +          // arg1
            " "+
            "%s"+                   // operator
            " " +        
            "(int)"+ arg2 +         // arg2
            " = " + 
            answerCalc              // answer
            ,operator);             // operator parameter % 
                                    // requires var (may be hidden feature :) */
        
        
    }
    
}
