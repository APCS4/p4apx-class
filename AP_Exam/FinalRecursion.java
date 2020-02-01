package AP_Exam;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import Util.ConsoleMethods;
import model_questions.Question;
import model_questions.QuestionMC;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * 
 * @author 
 * @version 
 */
public class FinalRecursion extends QuestionMC
{
	private String code;
	private String type = Integer.toString(rand.nextInt(2) + 1);
	
	private String[] loadQuestArray (String q0, String q1, String q2, String q3, String q4)
	{
		int rand;
		String[] choices = new String[5];
		String hold;
		choices[0] = q0;
		choices[1] = q1;
		choices[2] = q2;
		choices[3] = q3;
		choices[4] = q4;
		//randomly swap the Strings
		for(int i = 0; i <5; i++)
		{
			hold = choices[i];
			rand = (int) Math.floor(Math.random() * 5);
			choices[i] = choices[rand];
			choices[rand] = hold;
		}
		return choices;	
	}
	public FinalRecursion()
	{	
		setupQuestion(qNumber);
	}
	
	public FinalRecursion(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber)
	{
		ConsoleMethods.println("Recursion class setupQuestionData method");
		
		String[] ansq = new String[5];//string array that holds all of the answers
		char[] ansc = {'A', 'B', 'C', 'D', 'E'};//character array to hold a, b, c, d, and e
		String type = Integer.toString(rand.nextInt(2)+1);
		
		if(qNumber == -1) {
			qNumber = rand.nextInt(9) + 1;
		}
		switch (qNumber) //switch case for questions
		{
			case 1: //question #1
				answer = "248832"; //correct answer
				
				this.question = "Consider the following code:\r\n" + //display the question
				                "\r\n" + 
				                "\r\n" + 
				                "public static void main(String[] args)\r\n" + 
				                "{\r\n" + 
				                "   System.out.println(equation(8));\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "public static int equation(int a)\r\n" + 
				                "{\r\n" + 
				                "   if(a <= 5)\r\n" + 
				                "      return 12;\r\n" + 
				                "   return equation(a-2) * equation(a-1);\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "What is the output for the code above?";
				
				choices = loadQuestArray("144", "48", "1728", "248832", "104");
				loadChoices(choices);
				answerKey = getAns(choices, "248832");
				break;
			case 2: //question #2
				answer = "public long factorial(long a)\r\n" + //correct answer 
					  "{\r\n" + 
					  "     if(a <= 1)\r\n" + 
					  "         return 1;\r\n" + 
					  "\r\n" + 
					  "     return a * factorial(a-1);\r\n" + 
					  "}";
				
				this.question = "Which of the following is a recursive factorial function?  \r\n" + //display the question
						        "Recall that an example of a factorial is: \r\n" + 
						        "\r\n" + 
						        "5!=5*4*3*2*1";
				
				choices = loadQuestArray(
						"public long factorial(long a)\r\n" + //answer choices
						  "{\r\n" + 
						  "    return a * factorial(a-1) * factorial(a-2);\r\n" + 
						  "}", 
						  
						  "public long factorial(long a)\r\n" + 
								  "{\r\n" + 
								  "    long ret = 1;\r\n" + 
								  "\r\n" + 
								  "    for(int i = 2; i < a; i++)\r\n" + 
								  "        ret *= i;\r\n" + 
								  "\r\n" + 
								  "    return ret;\r\n" +
								  "}",
								 
							"public long factorial(long a)\r\n" + 
								  "{\r\n" + 
								  "     if(a <= 1)\r\n" + 
								  "         return 1;\r\n" + 
					    		  "\r\n" + 
								  "     return a * factorial(a-1);\r\n" + 
								  "}",
								 
							"public long factorial(long a)\r\n" + 
									  "{\r\n" + 
									  "    a * a-1 * a-2 * a-3 * a-4;\r\n" + 
									  "}",
									  
							 "None of these");
					loadChoices(choices);
					answerKey = getAns(choices, answer);
				break;
			case 3: //question #3
				answer = "tHISISMYFAVORITEyAYFORPROGRAMMING"; //correct answer
				
				this.question = "Consider the following code:\r\n" + //display the question
						        "\r\n" + 
						        " \r\n" + 
						        "\r\n" + 
						        "public static void main(String[] args)\r\n" + 
						        "{\r\n" + 
						        "     System.out.println(foo(\"This is my favorite: Yay for programming!!!\"));\r\n" +
						        "\r\n" + 
						        "public static String foo(String s)\r\n" + 
						        "{\r\n" + 
						        "    if(!s.equals(\"\"))\r\n" + 
						        "    {\r\n" + 
						        "        char c = s.charAt(0);\r\n" + 
						        "\r\n" + 
						        "        if(c >= 'A' && c <= 'Z')\r\n" + 
						        "            return Character.toLowerCase(c) + foo(s.substring(1));\r\n" + 
						        "        else\r\n" +
						        "            if (c >= 'a' && c <= 'z')\r\n" + 
						        "                return Character.toUpperCase(c) + foo(s.substring(1));\r\n" + 
						        "\r\n" + 
						        "        return foo(s.substring(1));\r\n" +
						        "    }\r\n" + 
						        "\r\n" + 
						        "    return \"\";\r\n" + 
						        "}\r\n" + 
						        "\r\n" + 
						        "What is the output for the main function above?";
				
				choices = loadQuestArray("ThIs iS mY fAvOriTe: YaY fOr PrOgRaMmIng!!!", "tHIS IS MY FAVORITE: yAY FOR PROGRAMMING!!!", "tHIS IS MYFAVORITE", "tHISISMYFAVORITEyAYFORPROGRAMMING", "ThIs iS mY fAvOriTe");
				loadChoices(choices);
				answerKey = getAns(choices, answer);
				break;
			case 4:
				answer = "24"; //correct answer
				
				this.question = "public static int foo(int a, int b)\r\n" + //display the question
								"{\r\n" + 
								"    if(b <= 1 || b <= a)\r\n" + 
								"        return 1;\r\n" + 
								"\r\n" + 
								"    return (b - a) * foo(a,b-1);\r\n" +
								"}\r\n" + 
								"\r\n" + 
								"Based on the code above, what is the value of the following function call:\r\n" +
								"foo(5,9);";
				
				choices = loadQuestArray("36", "24", "32", "18", "16");
				loadChoices(choices);
				answerKey = getAns(choices, answer);
				break;
			case 5:
				answer = "Error, infinite loop"; //correct answer
				
				this.question = "public void draw()\r\n" + //display the question
								"{\r\n" + 
								"  recurs(11);\r\n" + 
								"}\r\n" + 
								"void recurs(int count)\r\n" + 
								"{\r\n" +
								"    if (count == 0)\r\n" + 
								"        return;\r\n" + 
								"    else\r\n" + 
								"    {\r\n" +
								"        System.out.print(count + \" \");\r\n" + 
								"        int recount = count - 2;\r\n" + 
								"        recurs(recount);\r\n" + 
								"        return;\r\n" + 
								"    }\r\n" + 
								"}";
				
				choices = loadQuestArray("11 9 7 5 3 1 -1", "9 7 5 3 1", "9 7 5 3 1 -1", "11 9 7 5 3 1", "Error, infinite loop");
				loadChoices(choices);
				answerKey = getAns(choices, answer);
				break;
			case 6:
				recursion2(0);
				break;
			case 7:
				recursion2(1);
				break;
			case 8:
				recursion2(2);
				break;
			case 9:
				recursionp3(type);
				
				}
		}
	
		// recursion 2 start
		private void recursion2(int qID) 
		{
			
			int value; 	
	    	value = rand.nextInt(15);
	    	/** 
	    	 * We randomized an integer between the numbers 0, 1, 2 in order to switch randomly between 
	    	 * our three types of questions. All three have different recursion code displayed. 
	    	 * */ 	
	    	//number = r.nextInt((max - min) + 1) + min;
	    	
	    	switch(qID) 
	    	{
	    	
	    	/**
	    	 *our switch case alternates between our three types of recursion questions and 
	    	 *assigns different choices to the answer options, formats the different question, 
	    	 *and assigns the correctanswer choice to the answer shown by calling a method in which 
	    	 *we actually run the recursion code
	    	 * */
	    	
	    		case 0 : 
	    		
	    			this.question = String.format("public int treasure(int n)\n {\n if (n<0)\n return 2;\n else\n return treasure(n-1 + treasure(n-3)\n What value is returned by the call treasure(" + value + ")");
	    		
	    			this.choiceA = String.format("%d",treasure(value));
	    	        this.choiceB = String.format("%f", value + 0.3);
	    	        this.choiceC = String.format("%d",2);
	    	        this.choiceD = String.format("%d", treasure(value) + 5);
	    	        this.choiceE = "None of the above";
	    	        
	    	        this.answer =  String.format(choiceA);
	    	        this.answerKey = this.charA;
	    	        
	    			break;
	    			
	    		case 1 : 
	    			this.question = String.format("public int cheese(int n)\n {\n if (n == 0)\n {\n return 6;\n } else {\n return cheese(n-1);}\n What would be the output following the call cheese(" + value+ ")");
	    			
	    			
	    			this.choiceA = String.format("%d", 9);
	    	        this.choiceB = String.format("%d", 4);
	    	        this.choiceC = String.format("%d",6);
	    	        this.choiceD = String.format("%d", 0);
	    	        this.choiceE = "None of the above";
	    	        this.answer =  String.format(choiceC);
	    	        this.answerKey = this.charC;	
	    		
	    			break;
	    		case 2 :
	    			this.question = String.format("public int result(int n)\n {\n if (n == 1)\n return 2;\n else\n return 2 * result(n-1);\n }\n What value does result(" + value + ") return?");
	    			
	    			
	    			this.choiceA = String.format("%f", result(value)+0.66);
	    	        this.choiceB = String.format("%d", result(value)+2);
	    	        this.choiceC = String.format("%d",2);
	    	        this.choiceD = String.format("%d", result(value));
	    	        this.choiceE = "None of the above";
	    	        this.answer =  String.format(choiceD);
	    	        this.answerKey = this.charD;
	    			break;
	    		}    	
		}
	    	
	    	/**
	    	 *There's 3 different methods which run the code portrayed in the 3 different
	    	 *recursion questions we ask. This helps us always get the right answer to assign
	    	 *to one of the choices.
	    	 * 
	    	 */
	    	public int treasure(int n) {
	    		
	    		if(n<0) {
	    			return 2; 
	    		} else {
	    			return treasure(n-1) + treasure(n-3);
	    		}
	    		}
	    	
	    	public int cheese(int n){
	    		if(n == 0) {
	    			return 6; 
	    		}
	    		else {
	    		return cheese(n-1);
	    		}
	    	}
	    	
	    	public int result(int n) {
	    		if (n == 1) {
	    			return 2; 
	    		} else {
	    			return 2 * result (n-1);
	    		}
	    		
	    	}
		
	// recursionp3 start
	    	// placeholder
	private void recursionp3(String type) 
	{
		//generates 2 random numbers as starting x and y value to run sample recursion code
				int random1 = rand.nextInt(10)+1;
				int random2 = rand.nextInt(10)+1;
				
				//MethodCode.java searches RecursionCode.java for inputed type
				//returns code of entire method.
				code = getMethodCode(type);
				
				//formats question prompt
				this.question = String.format("What value will type" + type + "(%d, %d) return?\n" + code.replace("%", "%%"), random1, random2);
				
				//Executes sample code with respective parameters to retrieve and define answer
				//adding answerValue into array list answers to be shuffled throughout letters
				int answerValue = 0;
			    if (type.equals("1")) {
			    	answerValue = (type1(random1, random2));
			    	this.answer = String.format(Integer.toString(answerValue));
			    } 
			    else if (type.equals("2")) {
			    	answerValue = (type2(random1, random2));
			    	this.answer = String.format(Integer.toString(answerValue));
			    }  
				System.out.println(answerValue);
			    int[] answers = {random1/random2, random1-random2, answerValue, random1+random2};
			    long timeInMilliSeconds = System.currentTimeMillis();
			    int rnd = (int)(timeInMilliSeconds % 4);


			        // format question choices
			        this.choiceA = String.format("%d",answers[rnd % 4]);
			        this.choiceB = String.format("%d",answers[(rnd+1) %4]);
			        this.choiceC = String.format("%d",answers[(rnd+2) %4]);
			        this.choiceD = String.format("%d",answers[(rnd+3) %4]);
			        this.choiceE = "None of the above";
			        
			        // sets correct letter answer if it equals the this.answer
			        if (choiceA.equals(this.answer)) {
			        	this.answerKey=this.charA;
			        } else if (choiceB.equals(this.answer)) {
				        this.answerKey=this.charB;
				    } else if (choiceC.equals(this.answer)) {
				        this.answerKey=this.charC;
				    } else if (choiceD.equals(this.answer)) {
				        this.answerKey=this.charD;
				    }
			        	        
			    }
			    
	
	/**
	 * printHint Method:
	 * Format hint to include an example of the same type of question
	 * pop up when called from AP_UI.java through q2 object (pops up at the same
	 * time as the rest of the question)
	 */
	public void printHint() {
		String hint = "";
		if (type.equals("1")) {
			hint = String.format(code + "\nHint: type1(3,2) returns: \n 3 + type1(1,3)\n 3 + 1 +type1(2,1)\n 3 + 1 + 2 \n 6");
		}
		else if(type.equals("2")) {
			hint = String.format(code.replace("%", "%%") + "\nHint: type2(5,3) returns: \n type2(10,1) + 5 \n type(20,0) + 10 + 5 \n 0 + 10 +5 \n 15");
		}
		JOptionPane.showMessageDialog(null, hint, "Hint", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int type1(int x, int y) {
        if (x==2) {
            return x;
        } 
        else {
            return x+ type1(y-1,x);
        }
    }
    
    public static int type2(int x, int y) {
    	System.out.println("x:" + x + ", y:" + y);
        if(y==0) {
            return 0;
        } 
        if (y % 2 == 0) {
            return type2(x+x, y/2);
        }
        return type2(x+x, y/2) + x;
    }
	


public static String getMethodCode(String method)
{   //Scanner reads every line and adds to ArrayList Lines
    ArrayList<String> lines = new ArrayList<String>();
    Scanner sc = null;
    try {
    	String s = System.getProperty("user.dir");
        sc = new Scanner(new File("AP_Exam/RecursionCode.java"));
        while (sc.hasNextLine())
        {
            lines.add(sc.nextLine());
        }
        
    }
    catch (FileNotFoundException e){}
   
          
    //whether the method name is found or not
    boolean method_found = false;
    //counts number of brackets
    int bracket = 0;
    StringBuffer output = new StringBuffer();
    for (int j=0; j<lines.size(); j++)
    {   //checks if opening curly bracket is on the same line as method
    	
        if (method_found == false && lines.get(j).contains(method) && lines.get(j).contains("public")) {
            method_found = true;
            output.append(lines.get(j) + "\n");
            if (lines.get(j).contains("{")) {
                bracket += 1;
            }
        }
        //checks if sequential line has opening curly bracket
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
}}

