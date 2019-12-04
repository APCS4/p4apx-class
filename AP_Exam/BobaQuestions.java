package AP_Exam;
import java.lang.reflect.Array; 
import java.util.Random;

/**
 * Grace Liu and Cynthia Li's boba questions BOBAA
 *
 * @author Team Boba
 * @version 6.9
 */
public class BobaQuestions extends Question
{ 
	//private char[] operators = {'/', '%', '+', '-'};
	
    /**
     * Constructor for objects of class MathQuestions
     */
    public BobaQuestions()
    {
    	Random rand = new Random();
    	Integer arg1 = rand.nextInt(1);
    	Integer arg2 = rand.nextInt(20);
    	Integer arg3 = rand.nextInt(1);
    	Integer arg4 = rand.nextInt(20);
    	Integer arg5 = rand.nextInt(1);
    	Integer arg6 = rand.nextInt(20);
    	Integer arg7 = rand.nextInt(1);
    	Integer arg8 = rand.nextInt(20);
    	Integer arg9 = rand.nextInt(1);
    	Integer arg10 = rand.nextInt(20);
    	//Integer opIndex = rand.nextInt(operators.length);
    	setupQuestion(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
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
	public void setupQuestion(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10)
    {      
		//Make an array
		String[] sentence = new String[] {"The most common black boba pearls are made of tapioca", "Classic boba drinks are made from milk tea", "Boba can come in many flavors such as taro or mango", "Cool boba places include ICMonster, Sharetea and MeetFresh", "Boba is a drink with origins in Taiwan", "Each boba pearl is around 10-15 calories", "Boba can also be called pearl tea, tapioca tea, and bubble tea", "Boba isn't the healthiest but it's G O D L Y", "A cool substitute for tapioca pearls are popping boba pearls"};
		
        // Grab a random sentence from the array
		Random rand = new Random();
		int i = rand.nextInt(11);
		String here = (String) Array.get(sentence, i);
        this.question = String.format("What is String substring(" + arg1 + ", " + arg2 + "of the following string: " + (String)Array.get(sentence, i));
        
        
        // format question choices
        this.choiceA = String.format("%f",(here.substring(arg1, arg2)));
        this.choiceB = String.format("%x",(here.substring(arg3, arg4)));
        this.choiceC = String.format("%f",(here.substring(arg5, arg6)));
        this.choiceD = String.format("%x",(here.substring(arg7, arg8)));
        this.choiceE = String.format("%f",(here.substring(arg9, arg10)));
        
        // real time calc answer based off args AND operator
        String answerCalc;
        switch(i)
        {
            case '/':
                answerCalc = here.substring(arg1, arg2);
                this.answerKey = this.answerA;
                break;
            case '+':
                answerCalc = here.substring(arg3, arg4);
                this.answerKey = this.answerB;
                break;
            case '-':
                answerCalc = here.substring(arg5, arg6);
                this.answerKey = this.answerC;
                break;
            case '%':
                answerCalc = here.substring(arg7, arg8);
                this.answerKey = this.answerD;
                break;
            case '#':
                answerCalc = here.substring(arg9, arg10);
                this.answerKey = this.answerD;
                break;    
            default: // not supported
                return;
        }
       
        
        // format question answer based off of operation calculation
        
        
        this.answer =  String.format(
            "String substring(" + arg1 + ", " + arg2 + ")" + here.substring(arg1, arg2));
    
        
    }
    
}
