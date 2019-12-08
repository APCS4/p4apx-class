package AP_Exam;

import java.util.Random;

import Util.ConsoleMethods;	// Console support

/**
 * Question class is intended to support asking question on test
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class Question extends Scoring
{
	// question setup values
	protected String question, choiceA, choiceB, choiceC, choiceD, choiceE, answer;
    protected char answerA, answerB, answerC, answerD, answerE, answerKey;

    // question internal control values
	private char[] answers = {'A', 'B', 'C', 'D', 'E'};
    
    // defaults for randomization 
   	int randOffset = 0;
    private boolean scrambled;
	private String[] choices = {"", "", "", "", ""};
    char offsetAnswerKey;

    
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
    public Question()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Question Constructor, Randomizing choices");
        answerA=answers[0];
        answerB=answers[1];
        answerC=answers[2]; 
        answerD=answers[3];
        answerE=answers[4];
        
        scrambled = false;
    }
    
    public void scramble()
    {
    	// This outputs constructor being run
        ConsoleMethods.println("Scramble method");
        
    	Random rand = new Random();
    	
    	randOffset = rand.nextInt(answers.length);
    	int aOffset = randOffset;
    	int bOffset = (randOffset+1) % answers.length;
    	int cOffset = (randOffset+2) % answers.length;
    	int dOffset = (randOffset+3) % answers.length;
    	int eOffset = (randOffset+4) % answers.length;

    	answerA = answers[aOffset];
    	answerB = answers[bOffset];
    	answerC = answers[cOffset];
    	answerD = answers[dOffset];
    	answerE = answers[eOffset];
    	
    	choices[aOffset] = choiceA;
    	choices[bOffset] = choiceB;
    	choices[cOffset] = choiceC;
    	choices[dOffset] = choiceD;
    	choices[eOffset] = choiceE;
    	    	
		switch (answerKey) {
		case 'A':
			offsetAnswerKey = answerA;
			break;
		case 'B':
			offsetAnswerKey = answerB;
			break;
		case 'C':
			offsetAnswerKey = answerC;
			break;
		case 'D':
			offsetAnswerKey = answerD;
			break;
		case 'E':
			offsetAnswerKey = answerE;
			break;

		}
		ConsoleMethods.println("AnswerKey:" +answerKey);
		ConsoleMethods.println("offsetAnswerKey:" +offsetAnswerKey);

		answerKey = offsetAnswerKey;
		scrambled = true;
		
    	// This outputs randomization of letters
    	ConsoleMethods.printChar(answers[0]);
    	ConsoleMethods.printChar(answerA);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[1]);
    	ConsoleMethods.printChar(answerB);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[2]);
    	ConsoleMethods.printChar(answerC);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[3]);
    	ConsoleMethods.printChar(answerD);
    	ConsoleMethods.printChar('-');
    	ConsoleMethods.printChar(answers[4]);
    	ConsoleMethods.printChar(answerE);
    	ConsoleMethods.println();
    }
    
    
    /**
     * Intended for two args and an operator
     *
     * @param  arg1      1st argument in math expression
     * @param  operator  operator in math expression (/ or % only)
     * @param  arg2      2st argument in math expression
     * @return void
     */
    public void setupQuestion(int arg1, char operator, int arg2) {
		// TODO Auto-generated method stub	
	}
    
    /**
     * Intended for String and Double question setup
     *
     * @param  string     datatype of reference
     * @param  number       number in conversion
     * @return void
     */
	public void setupQuestion(String string, double number) {
		// TODO Auto-generated method stub
		
	}
	
	/**
     * Question getter
     *
     * @param  void
     * @return String	contents of question
     */
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
		if (scrambled)
		{
			return String.format(
	            answers[0] + ": " + choices[0] + "\n"  + 
	    	    answers[1] + ": " + choices[1] + "\n"  + 
	    	    answers[2] + ": " + choices[2] + "\n"  + 
	    	    answers[3] + ": " + choices[3] + "\n"  + 
	    	    answers[4] + ": " + choices[4] + "\n"
	            );    
		} else {
			return String.format(
	            answers[0] + ": " + choiceA + "\n"  + 
	    	    answers[1] + ": " + choiceB + "\n"  + 
	    	    answers[2] + ": " + choiceC + "\n"  + 
	    	    answers[3] + ": " + choiceD + "\n"  + 
	    	    answers[4] + ": " + choiceE + "\n"
	    	    );
		}
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
            if (choice >= 'A' && choice <= 'E') break;
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
