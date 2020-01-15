import java.util.Random;

public class TestModeLogic /*extends MenuControl */{
	
	int trackQCalls[] = {0,0,0,0,0,0,0,0,0,0,0,0,0}; //tracks # of times each class was called, starts at 0 (array has 13 spots, ranges from 0-12)
	
	public TestModeLogic()
	{
		
	}
	
	
	public String [][] makeQuestions()
	{

		AP_Exam.Question math = new AP_Exam.MathQuestions(); 
		AP_Exam.Question encaps = new AP_Exam.encapsulationQuestions(); 
		AP_Exam.Question dataType = new AP_Exam.DataTypeQuestions();
		AP_Exam.Question binaryMath = new AP_Exam.BinaryMathQuestions();
		AP_Exam.Question CA = new AP_Exam.CA();
		AP_Exam.Question MVC = new AP_Exam.MVCQuestion();
		AP_Exam.Question operators = new AP_Exam.OperatorQuestions();
		AP_Exam.Question aList = new AP_Exam.ArrayListQuestions();
		AP_Exam.Question backgroundInfo = new AP_Exam.BackgroundInfoQuestions();
		AP_Exam.Question powSqrt = new  AP_Exam.PowSqrt();
		AP_Exam.Question recur = new AP_Exam.Recursion();
		AP_Exam.Question polymorph1= new AP_Exam.PolymorphismQuestions();
		AP_Exam.Question polymorph2= new AP_Exam.Polymorph(); //making an object of each type of question

		AP_Exam.Question [] questionList = {math, encaps, dataType, binaryMath, CA, MVC, operators, aList, backgroundInfo, powSqrt, recur, polymorph1, polymorph2};
		//populating an array of type Question with each of the different types of question objects
		
		String [][] test = new String[36][8]; //creating a new 2-D String array that will hold in each column: a question type object, and its corresponding 
											  //actual question text, answer options A-E, and the answer text, see below:

		int randNum; //defining variable, random integer
		
		int QUEST=0, A=1, B=2, C=3, D=4, E=5, ANS=6, ANSLETTER=7; //defining integers for the INDEX on the test Array 
		
		//this variable instantiation declares that question will always be in the 0 position of the column, choice A will be in the 1 position, etc.
		
		for (int questNum = 0; questNum < 36; questNum++) //for each increasing index of the test array
		{
			randNum= getRandNum(); //assignments of Strings to each object of the array 
			test[questNum][QUEST]=questionList[randNum].getQuestion();
			test[questNum][A]=questionList[randNum].getChoiceA();
			test[questNum][B]=questionList[randNum].getChoiceB();
			test[questNum][C]=questionList[randNum].getChoiceC();
			test[questNum][D]=questionList[randNum].getChoiceD();
			test[questNum][E]=questionList[randNum].getChoiceE();
			test[questNum][ANS]=questionList[randNum].getAnswer();
			test[questNum][ANSLETTER] = questionList[randNum].getAnswerLetter(); 
			
		}
		
		return(test); //returns entire test array

	}
	
	/**
	 * generate the random numbers
	 * @return random number
	 */
	public int getRandNum() //logic for when calling a random number 
	{
		Random rand = new Random();
		int num;
		
		boolean full=false;
		do 
		{
			num = rand.nextInt(13); //call random number from 0-12
			
			if (trackQCalls[num]==3)
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
