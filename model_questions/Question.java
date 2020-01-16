package model_questions;

import java.util.Random;
import java.util.ArrayList;
import Util.ConsoleMethods;	// Console support

/**
 * Question class is intended to support asking question on test
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class Question extends Scoring
{
	private int ID; //question number
	protected boolean TextBased;
	protected boolean RandomBased;
	
	// question setup values
	protected String question, choiceA, choiceB, choiceC, choiceD, choiceE, answer;
	protected char answerKey;
    
    // internal control values, these are never change
    protected final char charA = 'A', charB = 'B', charC = 'C', charD = 'D', charE = 'E'; 	// Multiple choice default letters
	protected final char[] answers = {charA, charB, charC, charD, charE};					// Multiple choice default order
   	protected int aOffset = 0, bOffset = 1, cOffset = 2, dOffset = 3, eOffset = 4;			// Multiple choice index value
    
    // defaults for choice
   	protected int choiceOffset = 0;						// choiceOffset is used when scrambled to move answers around
    protected static boolean choiceEfixed = true, choiceDfixed = false;				// used to keep choice E fixed versus randomization
	protected String[] choices = {"", "", "", "", ""};
	protected ArrayList<String> choiceArray = new ArrayList<>();

	//misc.
	protected Random rand = new Random();
    
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
    public Question()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class constructor");
        
        // turn scrambled off for backward compatibility
        choiceOffset = 0;
        choiceEfixed = true;  
    }
    
      
    /**
     * setup question choices and answer
     * 
     * @param  void
     */
     protected void setupQuestion() {
    	// This outputs constructor being run
        ConsoleMethods.println("Question class setupQuestion method");
    	setupQuestionData();
        
    	// choice assignment
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;   	
    }
 
     /**
      * setup question data default, expectation is this will changed through polymorphism
      *
      * @param  void
      * @Override
      */
     
    protected void setupQuestionData() {
    	// This outputs constructor being run
        ConsoleMethods.println("BobaQuestions class setupQuestionData method");
        
    	question = "What type of programming language is Java?";
		choiceA = "Data-oriented";
		choiceB = "Iterative";
		choiceC = "Object-oriented";
		choiceD = "Imperative";
		answer = choiceC;
		answerKey = charC;
    }
    /**
     * Question ID setter
     *
     * @param  id
     * @return void
     */
	public void setID(int id) {
		this.ID = id;
	}
	
	/**
     * Question ID getter
     *
     * @param  void
     * @return ID
     */
	public int getID() {
		return ID;
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
    
	/**
     * Question getter
     *
     * @param  void
     * @return String	contents of question
     */
    protected void loadChoices() {
    	choiceA = choiceArray.get(0);
    	choiceB = choiceArray.get(1);
    	choiceC = choiceArray.get(2);
    	choiceD = choiceArray.get(3);
    	choiceE = choiceArray.get(4);
    }
    
    protected char getAns(ArrayList<String> choiceArray, String ans) {
    	char retCh = 'X';
    	for(int i = 0; i < choiceArray.size(); i++) {
    		if( choiceArray.get(i).contentEquals(ans)) {
    			retCh = (char)(i + 65);
    			System.out.println(retCh);
    			break;
    		}
    	}
    	return retCh;
    }
	public String getQuestion() {
		return question;
	}
	
	/**
     * Choices getter for Multiple Choice
     *
     * @param  void
     * @return String 	content of choices with ABCDEF formatting
     */
	public String getChoices() {
		return String.format(
            charA + ": " + choices[0] + "\n"  + 
    	    charB + ": " + choices[1] + "\n"  + 
    	    charC + ": " + choices[2] + "\n"  + 
    	    charD + ": " + choices[3] + "\n"  + 
    	    charE + ": " + choices[4] + ""
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
     * Answer getter with formatting to correspond to getChoices
     *
     * @param  void
     * @return String 	correct answer with letter prefex of right answer (A or B or C...)
     */
	public String getAnswer() {	
		
		// This outputs randomization of letters
    	ConsoleMethods.println("Answer:" + answerKey);
		
		return answerKey + ": " + answer;
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
  
}
