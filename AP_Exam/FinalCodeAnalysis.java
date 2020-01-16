package AP_Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model_questions.Question;

/**
 * 
 * This class ask several questions that asks for the output in a
 * segment of code. Cycles through three random pieces of code for questions
 *  
 * @author Allen Yang and Andrew Stratton
 *
 */

public class FinalCodeAnalysis extends AP_Exam.Question{
   
	public FinalCodeAnalysis()
    {
    	
        super.setupQuestion();

    }
	
	/**
	 * Runs the code in console with console io
	 * 
	 * @return score
	 */
    
    public static String mainTest ()
    {
    	Question q = new FinalCodeAnalysis();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * sets up question by passing question and answer choices to superclass
     */
	
	@Override
	protected void setupQuestionData() {
		System.out.println("start");
		Random rand = new Random();
    	int arg1 = rand.nextInt(4);
    	int arg2 = rand.nextInt(16)+1;
    	int q = rand.nextInt(3)+1;
    	
		Integer intAnswer = questionBank(arg1, arg2, q);
		ArrayList<String> answerchoices = new ArrayList<String>(0);
        this.answer = Integer.toString(intAnswer);
		
		answerchoices.add(this.answer);

		while (answerchoices.size() < 5) {
			int i = rand.nextInt(11) + intAnswer - 5;
			if (!answerchoices.contains(Integer.toString(i))) {
				answerchoices.add(Integer.toString(i));
			}
		}
		Collections.shuffle(answerchoices);

		this.choiceA = answerchoices.get(0);
		this.choiceB = answerchoices.get(1);
		this.choiceC = answerchoices.get(2);
		this.choiceD = answerchoices.get(3);
		this.choiceE = answerchoices.get(4);
		
		switch (answerchoices.indexOf(this.answer)) {
		case 0:
			this.answerKey = this.charA;
			break;
		case 1:
			this.answerKey = this.charB;
			break;
		case 2:
			this.answerKey = this.charC;
			break;
		case 3:
			this.answerKey = this.charD;
			break;
		case 4:
			this.answerKey = this.charE;
			break;
		}

        this.question = "Refer to the following code:\n" + questionText(arg1, arg2, q);

		
	}
	
	/**
	 * question bank with actual pieces of code
	 * 
	 * @param aarg argument 1
	 * @param barg argument 2
	 * @param q question number
	 * @return answer
	 */
	
	public static int questionBank(int aarg, int barg, int q) {
		int val;
		val = 0;
		switch (q) {
		case 1:
			for (int i = aarg; i < barg; i++) {
				if ((val + i) % 2 == 0) {
					val += 3;	
				}
			}
			break;
		case 2:
			int i = 0;
			while(i < barg) {
				if (i == aarg) {
					i++;
					continue;
				}
				i++;
			}
			val = i;
			break;
		
		case 3:
			for (i = barg; i > aarg; i--)
		       {
		          val += 2;
		       }
		}
		return val;
	}
	
	/**
	 * question bank in text format
	 * 
	 * @param aarg argument 1
	 * @param barg argument 2
	 * @param q question number
	 * @return text format of question
	 */
	public String questionText(int aarg, int barg, int q) {
		String text = "";
		Random rand = new Random();
		int random = rand.nextInt(9999999) % 12 +1;
		switch (random) {
			case 1:        
				text = String.format(
						"What does this method return?\n\n" +
						"int val = 0;\n" +
						"for (int i = %d; i < %d; i++) {\n" + 
						"	if ((val + i) %% 2 == 0) {\n" + 
						"		val += 3;\n" + 
						"	}\n" + 
						"}", aarg, barg);
				break;
			case 2:
				text = String.format(
						"What does this method return?\n\n"+
						"int i = 0;\n" + 
						"while(i < %d) {\n" + 
						"	if (i == %d) {\n" + 
						"		i++;\n" + 
						"		continue;\n" + 
						"	}\n" + 
						"	i++;\n" + 
						"}\n" + 
						"return i;\n", barg, aarg);
				break;
			case 3:
				text = String.format(
						"What does this method return?\n\n" +
						"int val = 0 \n" +
						"for (i = %d; i > %d; i--)\n" + 
						"{\n" + 
						"	val += 2;\n" + 
						"} \n" +
						"return val;", barg, aarg);
				break;
			case 4:
				text = "switch(ans)\n{\n     case 1:\n          ans = 11;\n          break;\n     case 2:\n          ans = 78;\n          break;\n}\n\nIf ans is 1, what is it after the switch case?";
				this.choiceA = "1";
				this.choiceB = "11";
				this.choiceC = "78";
				this.choiceD = "67";
				this.choiceE = "89";
				this.answerKey = this.charB;
				this.answer = "11";
				break;
			
			// second question - code analysis, randomization
			case 5:
				text = "double x = 10 * Math.random() + 3;\nSystem.out.println(x);\n\nWhat is the range of possible outputs?";
				this.choiceA = "(0,1)";
				this.choiceB = "[0,1)";
				this.choiceC = "[3,10)";
				this.choiceD = "(3,13)";
				this.choiceE = "[3,13)";
				this.answerKey = this.charE;
				this.answer = "[3,13)";
				break;
			
			// third question - matrices
			case 6:
				text = "int[][]  A  =  {{1,0,3},{7,-3,6},{2,-9,-1}};\nWhat int is in the 2nd row, 3rd column?";
				this.choiceA = "6";
				this.choiceB = "-9";
				this.choiceC = "-3";
				this.choiceD = "7";
				this.choiceE = "325";
				this.answerKey = this.charA;
				this.answer = "6";
				break;
				
			// fourth question - matrices
			case 7:
				text = "int[][]  A  =  {{1,0,3}, {7,-3,6}, {2,-9,-1}};\nWhat int is in the 3rd row, 1st column?";
				this.choiceA = "-9";
				this.choiceB = "2";
				this.choiceC = "3";
				this.choiceD = "6";
				this.choiceE = "0";
				this.answerKey = this.charB;
				this.answer = "2";
				break;
				
			// fifth question - matrices (2D arrays)
			case 8:
				text = "What is the code to write a matrix of the form: \n3    4    8    9 \n6  -1    4  10 ?";
				this.choiceA = "int[][]  A  =  {{3,4,8,9},{6,-1,4,10}};";
				this.choiceB = "int[][]  B  =  {{3,-1},{4,-1},{8,4},{9,10}};";
				this.choiceC = "int[][]  C  =  {{6,-1,4,10},{3,4,8,9}};";
				this.choiceD = "int[][]  D  =  {{3,4,8,9\\n6,-1,4,10}};";
				this.choiceE = "None of the above";
				this.answerKey = this.charA;
				this.answer = "int[][]  A  =  {{3,4,8,9},{6,-1,4,10}};";
				break;
				
			// sixth question - code analysis, typecasting
			case 9:
				text = "double x = 3.87;\nint y = (int)(x - 0.5);\nSystem.out.println(y);\n\nWhat will be printed?";
				this.choiceA = "3.87";
				this.choiceB = "3";
				this.choiceC = "4";
				this.choiceD = "The code will result in an error";
				this.choiceE = "None of the above";
				this.answerKey = this.charD;
				this.answer = "The code will result in an error";
				break;
				
			// seventh question - code analysis, typecasting
			case 10:
				text = "double x = -11.96;\nint y = (int)(x - 0.5);\nSystem.out.println(y);\n\nWhat will be printed?";
				this.choiceA = "-11";
				this.choiceB = "-12";
				this.choiceC = "-11.9";
				this.choiceD = "-11.96";
				this.choiceE = "-12.0";
				this.answerKey = this.charB;
				this.answer = "-12";
				break;
				
			// eighth question - analyzing code snippet, methods and calling/passing, return values
			case 11:
				text = 	"public static void main(String[] args)\n" +
						"    {\n" +
						"        int num = 4;\n" +
						"        System.out.println(abc(4));\n" +
						"    }\n" +
						"static int abc(int n)\n" +
						"    {\n" +
						"        if (n == 0)\n" +
						"          return 1;\n" +
						"        return n*abc(n-1);\n" +
						"    }\n\nWhat is printed?";
				this.choiceA = "60";
				this.choiceB = "0";
				this.choiceC = "24";
				this.choiceD = "12";
				this.choiceE = "120";
				this.answerKey = this.charC;
				this.answer = "24";
				break;
				
			// ninth question - analyzing code snippet, for loops, matrices
			case 12:
				text = "int[][]  A  =  {{1,0,12},{ 7, -3, 2}};\n" +
						"int x, y;\n" +
						"for (x = 0; x <= 2; x++)\n" +
						"{\n" +
						"     for (y = 0; y <= 1; y++)\n" +
						"     {\n" +
						"            System.out.print(\" \"+A[y][x]);\n" +
						"     }\n" +
						"System.out.println(\"\");\n\nWhat will be printed?";
				this.choiceA = "1 7\n    0 3\n    12 2";
				this.choiceB = "1 0 12 7 -3 2";
				this.choiceC = "1 0 12\n    7 -3 2";
				this.choiceD = "0 2 11 8 6 7";
				this.choiceE = "None of the above";
				this.answerKey = this.charA;
				this.answer = "1 7\n    0 3\n    12 2";
				break;	
		}
		return text;
	}
}
