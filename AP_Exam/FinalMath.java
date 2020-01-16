package AP_Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import Util.ConsoleMethods;
import model_questions.Question;

/**
 * Math Classes: BinaryMathQuestions, DataTypeMathQuestion,
 * DataTypeQuestions, Powsqrt
 * 
 * ree
 * @author 
 * @version Modeling P4
 */

public class FinalMath extends Question {
	
	private char[] operators = {'&', '|', '+', '-'};
	private char[] operators1 = {'1', '2'};
	private String[] datatype = {"float", "double"};
	private String[] operation = {"/", "*"};
	private int[] multiplier = {10, 100, 1000};
	float ans;

	/**
     * Constructor for objects of class BinaryMathQuestions
     * 
     * @param  void
     */
    public FinalMath()
    {   	  	
    	setupQuestionData();
    	
    	super.setupQuestion();
    }
    
    /**
     * Main test method to support console execution
     * 
     * @param  void
     * @return void 
     */
    public static String mainTest ()
    {
    	Question a = new BinaryMathQuestions();
        a.askQuestionConsole();
        return a.getCounterMsg();
        
        
    }
    
    public static String mainTest1 ()
    {
    	Question a = new DataTypeQuestions(); 
        a.askQuestionConsole();
        return a.getCounterMsg();
        
        
    }
    
    public static String mainTest2 ()
    {
    	Question a = new DataTypeMathQuestion();
        a.askQuestionConsole();
        return a.getCounterMsg();
        
        
    }
    
    public static String mainTest3 ()
    {
    	Question a = new PowSqrt();
        a.askQuestionConsole();
        return a.getCounterMsg();
        
        
    }
    
    public static String mainTest4 ()
    {
    	Question q = new MathQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * Sets up a Binary Math questions according to instance variables (this...) in Question class
     *
     * @return    void
     */
    //@Override
    
    private String zeroPadInt2BinaryString(int arg, int binaryLength)
    {
        return Integer.toBinaryString( (1 << binaryLength) | arg ).substring(1);
    }
    
	
	private static void thresholdBasedFloatComparison(float answer, int operAns)
	{
		final double THRESHOLD = .00000001;
		//method 1
		for (int i = 1; i <= 11; i++)
		{
			answer += 0.1;
		}	
		//method 2
		System.out.println("num1 = " + answer);
		System.out.println("num2 = " + operAns);	
		if (Math.abs(answer - operAns) < THRESHOLD)
			System.out.println("f1 and f2 equal");
		else
			System.out.println("f1 and f2 are not equal");	
	}
	
    protected void setupQuestionData()
    {
    	Random rand = new Random();
		int random = rand.nextInt(3);
		
		switch(random) {
		
		//BinaryMathQuestions
		case 0:
			// Logic to setup data for Binary Math questions
	    	Random rand1 = new Random();
	    	Integer arg1 = rand1.nextInt(16)+1;
	    	Integer arg2 = rand1.nextInt(8)+1;
	    	Integer opIndex = rand1.nextInt(operators.length);
	    	char operator = operators[opIndex];
	    	
	        // maximum binary number for testing is 15, we need to be reasonable
	        int binaryLength = 7;       
	        //if (arg1 > 15 || arg2 > 15) return;       // exit if number above 15
	        
	        // Turn math arguments (numbers) to binary strings
	        String carg1 = zeroPadInt2BinaryString(arg1,binaryLength);
	        String carg2 = zeroPadInt2BinaryString(arg2,binaryLength);
	        
	        // format question
	        this.question = String.format("Calculate binary result of: " + carg1 + " " + "%s" + " " + carg2, operator );
	        
	        // format question choices
	        this.choiceA = zeroPadInt2BinaryString(arg1 & arg2,binaryLength);
	        this.choiceB = zeroPadInt2BinaryString(arg1 | arg2,binaryLength);
	        this.choiceC = zeroPadInt2BinaryString(arg1 + arg2,binaryLength);
	        this.choiceD = zeroPadInt2BinaryString(arg1 - arg2,binaryLength);
	        this.choiceE = "Null";
	        
	        // real time calc answer based off args AND operator
	        int answerCalc;
	        switch(operator)
	        {
	            case '&':
	                answerCalc = arg1 & arg2;
	                this.answerKey = this.charA;
	                break;
	            case '|':
	                answerCalc = arg1 | arg2;
	                this.answerKey = this.charB;
	                break;
	             case '+':
	                answerCalc = arg1 + arg2;
	                if (answerCalc > 15) binaryLength++;
	                this.answerKey = this.charC;
	                break; 
	             case '-':
	                answerCalc = arg1 - arg2;
	                this.answerKey = this.charD;
	                break;
	            default:
	                return;
	        }
	        
	        // format question answer based off of operation calculation
	        String answerString = zeroPadInt2BinaryString(answerCalc,binaryLength);
	        this.answer =  String.format(
	            carg1 +         // arg1
	            " " +
	            "%s" +          // operator
	            " " +
	            carg2 +         // arg2
	            " = " + 
	            answerString    // answer
	            ,operator);     // operator parameter, % requires it (may be hidden feature :)
	        break;
	        
	    //DataTypeMathQuestion
		case 1:
			/**
			 * Randomize variables needed in question
			 */
			
	    	//randomize string[] and put it into string datatypename
			String dataTypeName;
	    	
	    	//randomize string[] and put it into string operation
	    	String operationName;

	    	//randomize first number
			Random rand2 = new Random();
	    	float number1 = rand2.nextFloat() * multiplier[rand2.nextInt(multiplier.length)];
	    	Integer index1 = rand2.nextInt(datatype.length);
	    	//setupQuestion(datatype[index1], value1);

	    	//randomize second number
	    	int number2 = rand2.nextInt() * multiplier[rand.nextInt(multiplier.length)];
	    	Integer index2 = rand2.nextInt(datatype.length);

	    	/**
	    	 * Set up question and pass variables
	    	 */
	    	
	    	//setupQuestion(datatype[index2], value2);

	    	//pass to setQuestion
	    	dataTypeName = datatype[index1];  
	    	operationName = operation[index1];
			//declare and initialize variables
	        float test1 = (float)number1;
	        int test2 =  (int)number1;
	        double test4 = (double)number1;
	        float ans = 0;
	        float pluschoice, multichoice, divchoice;

	        //use the right operation to compute
	        if (operationName == "/")
	        {
	        	ans = number1/number2;
	        } else if (operationName == "*"){
	        	ans = number1*number2;
	        }    
	        
	        //create comparison results
	        pluschoice = number1+number2;
	        multichoice = number1*number2;
	        divchoice = number1/number2;

	        // format question
	        this.question = String.format(
	            "What does " + dataTypeName + String.format("%.8f", number1) +
	            operationName + " int "  + number2 + "?");

	        /**
	    	 * Set up answer choices and find the correct answer
	    	 */
	        
	        // format question choices and calc answer
	        this.choiceA = String.format
	            ("(" + dataTypeName + ")" + number1/number2);
	        this.choiceB = String.format
	            ("(int)" + number1+number2);
	        this.choiceC = String.format
	            ("char" + number1/number2);
	        this.choiceD = String.format
	        		("(" + dataTypeName + ")" + number1*number2);
	        this.choiceE = "None of the above";

	        //finding the correct answer
	        if (dataTypeName == "float" && ans == divchoice){
	            answer = this.choiceA;
	            this.answerKey = this.charA;
	        } else if ( dataTypeName == "int" && ans == pluschoice) {
	            answer = this.choiceB;
	            this.answerKey = this.charB;
	        } else if ( dataTypeName == "float" && ans == divchoice) {
	            answer = this.choiceC;
	            this.answerKey = this.charC;
	        } else if ( dataTypeName == "double" && ans == multichoice) {
	            answer = this.choiceD;
	            this.answerKey = this.charD;
	        } else {
	            answer = this.choiceE;
	            this.answerKey = this.charE;
	        }
	        break;
	        
	    //DataTypeQuestions
		case 2:
			// Logic to setup data for Data Conversion questions
	    	Random rand3 = new Random();
	    	double number = rand3.nextDouble() * multiplier[rand3.nextInt(multiplier.length)];
	    	Integer index = rand3.nextInt(datatype.length);
	    	String dataTypeName1 = datatype[index];
	    	
	        // format question base off of dataTypeName and number from arguments
	        this.question = String.format(
	            "Which represents double " +
	            String.format
	             ("%.8f",
	              number) +
	            " conversion to a " +
	            dataTypeName1 +
	            "?");
	                    
	        // format question choices with calculated answer
	        this.choiceA = String.format
	            ("(float)%.8f equals %f",
	            number, (float)number);
	        this.choiceB = String.format
	            ("(int)%.8f equals %d",
	            number, (int)number);
	        this.choiceC = String.format
	            ("Double.toString(%f).charAt(0) equals %c",
	            number, Double.toString(number).charAt(0));
	        this.choiceD = String.format
	            ("(double)%.8f equals %.8f",
	            number, number);
	        this.choiceE = "All of the above";
	        
	        // find answer key by dataTypeName in question
	        if (dataTypeName1 == "float")
	        {
	            this.answer = this.choiceA;
	            this.answerKey = this.charA;
	        } else if (dataTypeName1.contentEquals("int")) {
	            this.answer = this.choiceB;
	            this.answerKey = this.charB;
	        } else if (dataTypeName1.contentEquals("char")) {
	            this.answer = this.choiceC;
	            this.answerKey = this.charC;
	        } else if (dataTypeName1.contentEquals("double")) {
	            this.answer = this.choiceD;
	            this.answerKey = this.charD;
	        } else {
	            this.answer = this.choiceE;
	            this.answerKey = this.charE;
	        }
	        break;
	        
	    //PowSqrt    
		case 3:
			Random rand4 = new Random();
	    	
	    	Integer square = rand4.nextInt(30) + 1;
	    	Integer root = rand4.nextInt(25) + 1;

	    	//Integer choose = rand.nextInt(2);   	
	    	Integer opIndex1 = rand.nextInt(operators1.length);
	    	char which = operators1[opIndex1];
			
	    	Float[] array = new Float[4]; // allows for randomization of questions
	    	List<Float> randArr = Arrays.asList(array); // randomization of questions
	    	
	    	
			//question option for pow or sqrt (formats the question)
			if(which == '1')
			{
				this.question = String.format("What is pow(" + square + ", 2)?");
			}
			else
			{
				this.question = String.format("What is sqrt(" + root + ")?");
			}
			
			array[0] = (float)square * (float)root;
			array[1] = (float)Math.pow((float)square, 2);
			array[2] = (float)square / (float)root;
			array[3] = (float)Math.sqrt((float)root);
			
			//Collections.shuffle(randArr);
			
	        // format question choices (randomized)
			System.out.println("PowSqrt class setupQuestionData method");
	        this.choiceA = String.format("%f",array[0]);
	        this.choiceB = String.format("%f",array[1]);
	        this.choiceC = String.format("%f",array[2]);
	        this.choiceD = String.format("%f",array[3]);
	        this.choiceE = "None of the above";
	        
	        
	        // real time calc answer based off args AND operator
	        double answerCalc1;
	        switch(which)
	        {
	            case '1': // exponents
	            	answerCalc1 = Math.pow(square, 2);
	                this.answerKey = this.charB;
	                break;
	            case '2': //square roots
	            	answerCalc1 = Math.sqrt((float)root);
	                this.answerKey = this.charD;
	                break;
	            default: // not supported
	            
	                return;
	        }
	        
	        //formats answer into string from above switch case
	        if(which == '1')
	        {
	        	this.answer = String.format("pow(" + square + ", 2) = " + answerCalc1);
	        }
	        else
	        {
	        	this.answer = String.format("sqrt(" + root + ") = " + answerCalc1);
	        }
	        break;
    
	}
		
}
}
