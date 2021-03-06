package model_questions;

import java.util.Random;
import java.util.ArrayList;
import Util.ConsoleMethods;

public class QuestionMC extends Question {

	// question id or number
	private int ID;
	
	//whether setupQuestionData returns random questions(negative one) or questions in order for database purposes(zero to any other number)
	protected int qNumber = -1;

	// question setup values
	protected String choiceA, choiceB, choiceC, choiceD, choiceE;
    
    // internal control values, these are never change
    protected final char charA = 'A', charB = 'B', charC = 'C', charD = 'D', charE = 'E'; 	// Multiple choice default letters
	protected final char[] answers = {charA, charB, charC, charD, charE};					// Multiple choice default order
   	protected int aOffset = 0, bOffset = 1, cOffset = 2, dOffset = 3, eOffset = 4;			// Multiple choice index value
    
    // defaults for choice
   	protected int choiceOffset = 0;						// choiceOffset is used when scrambled to move answers around
   	protected boolean choiceDfixed = false, choiceEfixed = true;				// used to keep choice E fixed versus randomization
	protected String[] choices = {"", "", "", "", ""};
	protected ArrayList<String> choiceArray = new ArrayList<>();
	protected Random rand = new Random();
 
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
    public QuestionMC()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Question MC class constructor");
        
        // set a random offset
        Random rand = new Random();
    	choiceOffset = rand.nextInt(answers.length);
        // fix choice E by default
        choiceEfixed = true;  
        
        setupQuestion();
    }
    
      
    /**
     * setup question choices and answer
     * 
     * @param  void
     */
    @Override
    protected void setupQuestion() {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class setupQuestion method");
    	setupQuestionData(qNumber);
    	
    	// number of fixed answers
     	int modBase = choiceEfixed ? answers.length - 1 : answers.length;
	
    	// scramble logic using modulo math
    	aOffset = choiceOffset % modBase;
    	bOffset = (choiceOffset+1) % modBase;
    	cOffset = (choiceOffset+2) % modBase;
    	dOffset = (choiceOffset+3) % modBase;
    	eOffset = choiceEfixed ? answers.length-1 : (choiceOffset+4) % modBase;
    	
    	// call super for standardized assignment
    	// choice assignment
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;
    	
    	// answer key set to match choice offset
		ConsoleMethods.println("answerKey original: " +answerKey);
    	switch (answerKey) {
		case charA:
			answerKey = answers[aOffset];
			break;
		case charB:
			answerKey = answers[bOffset];
			break;
		case charC:
			answerKey = answers[cOffset];
			break;
		case charD:
			answerKey = answers[dOffset];
			break;
		case charE:
			answerKey = answers[eOffset];
			break;
    	}
		ConsoleMethods.println("answerKey scrambled: " +answerKey);

    }
    
    //@Override
    protected void setupQuestion(int qNumber) {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class setupQuestion method");
    	setupQuestionData(qNumber);
    	
    	// number of fixed answers
     	int modBase = choiceEfixed ? answers.length - 1 : answers.length;
	
    	// scramble logic using modulo math
    	aOffset = choiceOffset % modBase;
    	bOffset = (choiceOffset+1) % modBase;
    	cOffset = (choiceOffset+2) % modBase;
    	dOffset = (choiceOffset+3) % modBase;
    	eOffset = choiceEfixed ? answers.length-1 : (choiceOffset+4) % modBase;
    	
    	// call super for standardized assignment
    	// choice assignment
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;
    	
    	// answer key set to match choice offset
		ConsoleMethods.println("answerKey original: " +answerKey);
    	switch (answerKey) {
		case charA:
			answerKey = answers[aOffset];
			break;
		case charB:
			answerKey = answers[bOffset];
			break;
		case charC:
			answerKey = answers[cOffset];
			break;
		case charD:
			answerKey = answers[dOffset];
			break;
		case charE:
			answerKey = answers[eOffset];
			break;
    	}
		ConsoleMethods.println("answerKey scrambled: " +answerKey);

    }


     /**
      * Sets up a  question according to instance variables in class
      *
      * @return void
      */
    @Override
    protected void setupQuestionData() {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class setupQuestionData method");

    	question = "What type of programming language is Java?";
		choiceA = "Data-oriented";
		choiceB = "Iterative";
		choiceC = "Object-oriented";
		choiceD = "Imperative";
		answer = choiceC;
		answerKey = charC;
    }    
    
    
    protected void setupQuestionData(int qNumber) {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class setupQuestionData method");

    	question = "What type of programming language is Java?";
		choiceA = "Data-oriented";
		choiceB = "Iterative";
		choiceC = "Object-oriented";
		choiceD = "Imperative";
		answer = choiceC;
		answerKey = charC;
    }    
    
	
	/**
     * Choices getter for Multiple Choice
     *
     * @param  void
     * @return String 	content of choices with ABCDEF formatting
     */
    @Override
	public String getChoices() {
		return String.format(
            charA + ": " + choices[0] + "\n"  + 
    	    charB + ": " + choices[1] + "\n"  + 
    	    charC + ": " + choices[2] + "\n"  + 
    	    charD + ": " + choices[3] + "\n"  + 
    	    charE + ": " + choices[4]
            );    
	}
    
    public String getChoices(String group) {
		return String.format(
				charA + ": %s%n" +
				charB + ": %s%n" +
				charC + ": %s%n" +
				charD + ": %s%n" +
				charE + ": %s%n", choices[0], choices[1], choices[2], choices[3], choices[4]);
				
	}
	
    /**
     * Sensible output
     *
     * @param  void
     */
    @Override
    public String toString()
    {
    	String s = getID() + ". " + getQuestion() + "\n" + getChoices() + "\nAnswer: " + getAnswer() + "\n\n";
    	return s;
    }
    
    protected void randomizeChoiceArray(ArrayList<String> choiceArray) {
    	String hold = "";
		int rand;
		int arrayLimit = choiceEfixed ? choiceDfixed ? 3: 4: 5;
		arrayLimit = choiceDfixed ? arrayLimit - 1: arrayLimit;
		for( int i = 0; i < arrayLimit; i++)
		{
			rand = (int)Math.floor(Math.random()*arrayLimit);
			hold = choiceArray.get(i);
			choiceArray.set(i, choiceArray.get(rand));
			choiceArray.set(rand, hold);
		}
    }
    
    protected void loadChoices() {
    	choiceA = choiceArray.get(0);
    	choiceB = choiceArray.get(1);
    	choiceC = choiceArray.get(2);
    	choiceD = choiceArray.get(3);
    	choiceE = choiceArray.get(4);
    }
    
    protected void loadChoices(String[] choices) {
    	choiceA = choices[0];
    	choiceB = choices[1];
    	choiceC = choices[2];
    	choiceD = choices[3];
    	choiceE = choices[4];
    }
    
    protected char getAns(ArrayList<String> choiceArray, String ans) {
    	char retCh = 'X';
    	for(int i = 0; i < choiceArray.size(); i++) {
    		if( choiceArray.get(i).contentEquals(ans)) {
    			retCh = (char)(i + 65);
    			break;
    		}
    	}
    	return retCh;
    }
    
    protected char getAns(String[] choices, String ans) {
    	char retCh = 'X';
    	for(int i = 0; i < choices.length; i++) {
    		if( choices[i].contentEquals(ans)) {
    			retCh = (char)(i + 65);
    			break;
    		}
    	}
    	return retCh;
    }
    
    public String getChoiceA() {
    	return choiceA;
    }
    public String getChoiceB() {
    	return choiceB;
    }
    public String getChoiceC() {
    	return choiceC;
    }
    public String getChoiceD() {
    	return choiceD;
    }
    public String getChoiceE() {
    	return choiceE;
    }
    
	/**
     * Console support wrapper for asking question, getting result, and calculating results
     *
     * @param  void
     * @return void
     */
    public void  askQuestionConsole()
    {
        // getAnswer return true if question is correct
        updateCounters ( getAnswerConsole() );
    }
    
    /**
     * Console support for asking question and getting result
     *
     * @param  void
     * @return void
     */
    private boolean getAnswerConsole()
    {
        char choice;
        
        // Implement this to randomize order
        ConsoleMethods.println(getQuestion());
        ConsoleMethods.println(getChoices());
        
        // IO logic of getting answer from console
        do {
            choice = ConsoleMethods.inputChar("Enter selection (A-E) --> ");
            choice = Character.toUpperCase(choice); // Convert to upper case
            if (choice >= charA && choice <= charE) break;
            ConsoleMethods.println(" (invalid) ");
        } while ( true );                                               // until valid input
        
        if (choice == answerKey) ConsoleMethods.print("(correct) ");
        else ConsoleMethods.print("(missed it!) ");
        ConsoleMethods.println(answer);
        ConsoleMethods.println();
        
        /*Boolean ansStatus = (choice == answerKey);
        calcResult(ansStatus)
        return ansStatus;*/
        return (choice == answerKey);
    }

    
    /**
     * MainTest supports console execution and receiving write or wrong return message
     * 
     * @param  void
     * @return score / right or wrong
     */
    public static String mainTest()
    {
    	Question q = new QuestionMC();
        q.askQuestionConsole();
        return q.getCounterMsg();
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
  
}
