import java.util.Random;

import model_questions.Question;
import model_questions.QuestionMC;

public class TestModeLogic /*extends MenuControl */{
	
	int trackQCalls[] = {0,0,0,0,0,0,0,0,0}; //tracks # of times each class was called, starts at 0 (array has 13 spots, ranges from 0-12)
	public int testQs = 4;
	public int testQsFields = 24;				// number of fields in question
	public String [][] test = new String[testQs][testQsFields]; //creating a new 2-D String array that will hold in each column: a question type object, and its corresponding 


	
	public TestModeLogic()
	{
		makeQuestions();
	}
	
	
	public void makeQuestions()
	{

		// array of exam questions
		Question [] questionList = {
				/*new AP_Exam.FinalMath(),
				new AP_Exam.FinalCodeAnalysis(), */
				new AP_Exam.FinalBooleanQuestions(),
				new AP_Exam.FinalInfoQuestions(),
				new AP_Exam.FinalLoopQuestion(), 
				new AP_Exam.FinalPolymorphQuestions(), 
				//new AP_Exam.FinalRecursion(), //has error 
				new AP_Exam.FinalArrayList(), //perfect */
				new AP_Exam.finalStrings() 
		};
		
		// 2D array management values
		// 1st dimension of 2D array defining number of questions
		// 2nd dimension of 2D array, defining constants to reference data parts (fields) of Question
		int QUEST=0, 						// question
				A=1, B=2, C=3, D=4, E=5, 	// choices
				ANS=6, 						// answer
				ANSKEY=7; 				// correct choice
											  //actual question text, answer options A-E, and the answer text, see below:
		
		// this variable instantiation declares that question will always be in the 0 position of the column, choice A will be in the 1 position, etc.	
		int randNum; //defining variable, random integer
		int randMax = questionList.length;
		for (int testQsIndex = 0; testQsIndex < testQs; testQsIndex++) //for each increasing index of the test array
		{
			randNum= getRandNum(randMax); //assignments of Strings to each object of the array
			Question q = questionList[randNum];		// simplify object reference for assignment
			QuestionMC mcq = (QuestionMC)q;			// same object cast to MC to access -- Choices	
			
			test[testQsIndex][QUEST] = q.getQuestion();
			test[testQsIndex][A] = mcq.getChoiceA();
			test[testQsIndex][B] = mcq.getChoiceB();
			test[testQsIndex][C] = mcq.getChoiceC();
			test[testQsIndex][D] = mcq.getChoiceD();
			test[testQsIndex][E] = mcq.getChoiceE();
			test[testQsIndex][ANS] = q.getAnswer();
			test[testQsIndex][ANSKEY] = q.getAnswerKey(); 
		}
	}
	

		
		
		public String [][] getTest()
		{
		
		return (test); //returns entire test array

	}
	
public String getTestElement(int x, int y)
	{
		return test[x][y]; 
	}

public String printAll()
	{
		
		String fullTest = ""; 
		for (int x=0; x< testQs; x++)
		{
			for(int y = 0; y< testQsFields-2; y++)
			
				
				fullTest += getTestElement(x, y) + "\n\n";
				
		} 
		
		return fullTest;
	}
	
	
	/**
	 * generate the random numbers
	 * @return random number
	 */
	public int getRandNum(int randMax) //logic for when calling a random number 
	{
		Random rand = new Random();
		int num;
		
		boolean full=false;
		do 
		{
			num = rand.nextInt(randMax); //call random number from 0-12
			
			if (trackQCalls[num]==4)
			{
				full=true;	//if that same number has already been
			}
			else
				trackQCalls[num]+=1; //if number 3 is called 3 times, the integer at index 3 on this array will become 1, then 2, then 3
		}
		while(full==true);
		
		return(num);
	}

}
/*
 * 
 */
