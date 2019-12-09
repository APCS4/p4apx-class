package Util;


import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * returns the code of a class the scanner reads
 *
 * @author Ethan Davies (major inspiration from Sydney Hsieh)
 * @version 12/6
 */

public class GetCodeV2//V2 cause it my second attempt
{
	/*So we totally stole all the same code from the methodSearch class from out 1st tri portfolios sry.
	 * But instead of only wanting snippets of the code we wanted the whole class. So we looked for the 
	 * word public which should include the 1st line with public class thing and then go all the way until
	 * the end of the class, which is what we want. Other ways were hard
	 */
	
	/**
	 * codeGetV2: gets the code of specified class
	 * @param void 
	 * @return String
	 *
	 */
    public static String codeGetV2(int Type)
    {
    	String file= getFileNames(Type);
    	
        Scanner sc = null;
        try {
            sc = new Scanner(new File(file));
        }
        catch (FileNotFoundException e){}
        
        //Scanner reads every line and adds to ArrayList Lines
        ArrayList<String> lines = new ArrayList<String>();
        while (sc.hasNextLine())
        {
            lines.add(sc.nextLine());
        }
        
        //whether the method name is found or not
        boolean method_found = false;
        //counts number of brackets
        int bracket = 0;
        StringBuffer output = new StringBuffer();
        for (int j=0; j<lines.size(); j++)
        {   //checks if opening curley bracket is on the same line as method
            if (method_found == false && lines.get(j).contains("public")) {
                method_found = true;
                output.append(lines.get(j) + "\n");
                if (lines.get(j).contains("{")) {
                    bracket += 1;
                }
            }
            //checks if sequential line has opening curely bracket
            else if (method_found && lines.get(j).contains("{")) {
                bracket += 1;
                output.append(lines.get(j) + "\n");
            }
            //if line contains closing bracket, bracket decreases by one. (only if bracket is 
            //positive to begin with)
            else if (method_found && lines.get(j).contains("}") && (bracket >= 1)) {
                bracket -= 1;
                output.append(lines.get(j) + "\n");
            }
            //if line does not contain bracket, but bracket is still positive, the line is printed
            else if (method_found && bracket >= 1) {
            	output.append(lines.get(j) + "\n");
            }
            //Once bracket = 0, the full method is found
            else if (method_found && bracket == 0) {
                break;
            }
        }
        return output.toString();
    }
    

    public static String getFileNames(int Type) 
    {
    	String ret = "";
    	switch(Type)
    	{
    	case 0:
    		String Control [] = 
    	{
    			"AP_Exam/AnswerChoiceIndex.java",
				"AP_Exam/Ap_Console.java",
				"AP_Exam/BackgroundInforQuestions.java",
				"AP_Exam/BinaryMathQuestions.java",
				"AP_Exam/BobaQuestions.java",
				"AP_Exam/BooleanQuestions.java",
				"AP_Exam/CA.java",
				"AP_Exam/DataTypeQuestions.java",
				"AP_Exam/encapsulationQuestion.java",
				"AP_Exam/ListQuestions2.java",
				"AP_Exam/MathQuestions.java",
				"AP_Exam/MVCQuestion.java",
				"AP_Exam/OperatorQuestions.java",
				"AP_Exam/PolymorphismQuestions.java",
				"AP_Exam/Power.java",
				"AP_Exam/PowSqrt.java",
				"AP_Exam/Question.java",
				"AP_Exam/Scoring.java",
				"Util/ConsoleMethods.java",
				"Util/GetCodeV2.java",
				"Util/MethodSearch.java",
				"Util/Palindrome.java"
    	};
    		ret = Control [(int) Math.floor(Math.random()*22)];
    		break;
    	case 1:
    		String View [] =
		{
				"AP_UI.java",
				"MenuControl.java",
				"MethodSearchUI.java",
				"PalindromeUI.java",
				"Util/ConsoleMethods.java",
				"Util/OutputCode.java"
		};
    		ret = View [(int) Math.floor(Math.random()*6)];
    		break;

    	default:
    		break;
    	}
    	
    	
    	return ret;
    }
}




















