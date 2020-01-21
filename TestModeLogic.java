import java.util.Random;

import model_questions.QuestionMC;

public class TestModeLogic /*extends MenuControl */{
	
	int trackQCalls[] = {0,0,0,0,0,0,0,0,0}; //tracks # of times each class was called, starts at 0 (array has 13 spots, ranges from 0-12)
	
	public TestModeLogic()
	{
		
	}
	
	
	public String [][] makeQuestions()
	{

		// array of exam questions
		QuestionMC [] questionList = {
				new AP_Exam.FinalMath(),
				new AP_Exam.FinalCodeAnalysis(),
				new AP_Exam.FinalBooleanQuestions(),
				new AP_Exam.finalInfoQuestions(),
				new AP_Exam.FinalLoopQuestion(),
				new AP_Exam.FinalPolymorphQuestions(),
				new AP_Exam.FinalRecursion(),
				new AP_Exam.FinalArrayList(),
				new AP_Exam.finalStrings()
		};
		
		// 2D array management values
		// 1st dimension of 2D array defining number of questions
		int testQs = 36;
		// 2nd dimension of 2D array, defining constants to reference data parts (fields) of Question
		int QUEST=0, 						// question
				A=1, B=2, C=3, D=4, E=5, 	// choices
				ANS=6, 						// answer
				ANSLETTER=7; 				// correct choice
		int testQsFields = 8;				// number of fields in question
		String [][] test = new String[testQs][testQsFields]; //creating a new 2-D String array that will hold in each column: a question type object, and its corresponding 
											  //actual question text, answer options A-E, and the answer text, see below:
		
		// this variable instantiation declares that question will always be in the 0 position of the column, choice A will be in the 1 position, etc.	
		int randNum; //defining variable, random integer
		int randMax = questionList.length;
		for (int testQsIndex = 0; testQsIndex < testQs; testQsIndex++) //for each increasing index of the test array
		{
			randNum= getRandNum(randMax); //assignments of Strings to each object of the array 
			test[testQsIndex][QUEST]=questionList[randNum].getQuestion();
			test[testQsIndex][A]=questionList[randNum].getChoiceA();
			test[testQsIndex][B]=questionList[randNum].getChoiceB();
			test[testQsIndex][C]=questionList[randNum].getChoiceC();
			test[testQsIndex][D]=questionList[randNum].getChoiceD();
			test[testQsIndex][E]=questionList[randNum].getChoiceE();
			test[testQsIndex][ANS]=questionList[randNum].getAnswer();
			test[testQsIndex][ANSLETTER] = questionList[randNum].getAnswerKey(); 
			
		}
		
		return(test); //returns entire test array

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
