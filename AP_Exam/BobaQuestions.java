package AP_Exam;

import java.util.Random;

/**
 * Grace Liu and Cynthia Li's boba questions 
 *
 * @author Team Boba
 * @version 6.9
 */
public class BobaQuestions extends Question
{ 
	private char[] operators = {'/', '%', '+', '-'};
	
    /**
     * Constructor for objects of class MathQuestions
     */
    public BobaQuestions()
    {
    	Random rand = new Random();
    	Integer arg1 = rand.nextInt(100);
    	Integer arg2 = rand.nextInt(50);
    	Integer opIndex = rand.nextInt(operators.length);
    	setupQuestion(arg1, operators[opIndex], arg2);
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
    public void setupQuestion(int arg1, char operator, int arg2)
    {   
		//Make an array
		String[] sentence = new String[] {"The most common black boba pearls are made of tapioca", "Classic boba drinks are made from milk tea", "Boba can come in many flavors such as taro or mango", "Cool boba places include ICMonster, Sharetea and MeetFresh", "Boba is a drink with origins in Taiwan", "Each boba pearl is around 10-15 calories", "Boba can also be called pearl tea, tapioca tea, and bubble tea", "Boba isn't the healthiest but it's G O D L Y", "A cool substitute for tapioca pearls are popping boba pearls"};
        
		// format question
        this.question = String.format("What is (int)" + arg1 + " " + "%s" + " (int)" + arg2 + "!!!??" , operator );
        
        // format question choices
        this.choiceA = String.format("%f",(float)arg1/(float)arg2);
        this.choiceB = String.format("%x",arg1+arg2);
        this.choiceC = String.format("%f",(float)arg1-(float)arg2);
        this.choiceD = String.format("%x",arg1%arg2);
        this.choiceE = "None of the above";
        
        // real time calc answer based off args AND operator
        int answerCalc; 
        switch(operator) 
        {
            case '/':
                answerCalc = arg1 / arg2;
                this.answerKey = this.answerA;
                break;
            case '+':
                answerCalc = arg1 + arg2;
                this.answerKey = this.answerB;
                break;
            case '-':
                answerCalc = arg1 - arg2;
                this.answerKey = this.answerC;
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

//The most common black boba pearls are made of tapioca
//Classic boba drinks are made from milk tea
//Boba can come in many flavors such as taro or mango
//Cool boba places include ICMonster, Sharetea and MeetFresh
//Boba is a drink with origins in Taiwan
//Each boba pearl is around 10-15 calories
//Boba can also be called pearl tea, tapioca tea, and bubble tea
//Boba isn't the healthiest but it's G O D L Y
//A cool substitute for tapioca pearls are popping boba pearls
