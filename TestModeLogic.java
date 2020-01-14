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
		AP_Exam.Question polymorph2= new AP_Exam.Polymorph();

		AP_Exam.Question [] questionList = {math, encaps, dataType, binaryMath, CA, MVC, operators, aList, backgroundInfo, powSqrt, recur, polymorph1, polymorph2};

		String [][] test = new String[36][8]; 

		int randNum;
		int QUESTION=0, CHOICEA=1, CHOICEB=2, CHOICEC=3, CHOICED=4, CHOICEE=5, ANS=6, ANSLETTER=7;
		
		for (int questNum = 0; questNum < 36; questNum++)
		{
			randNum= getRandNum();
			test[questNum][QUESTION]=questionList[randNum].getQuestion();
			test[questNum][CHOICEA]=questionList[randNum].getChoiceA();
			test[questNum][CHOICEB]=questionList[randNum].getChoiceB();
			test[questNum][CHOICEC]=questionList[randNum].getChoiceC();
			test[questNum][CHOICED]=questionList[randNum].getChoiceD();
			test[questNum][CHOICEE]=questionList[randNum].getChoiceE();
			test[questNum][ANS]=questionList[randNum].getAnswer();
			
		}
		
		return(test);

	}
	
	/**
	 * generate the random numbers
	 * @return random number
	 */
	public int getRandNum()
	{
		Random rand = new Random();
		int num;
		
		boolean full=false;
		do 
		{
			num = rand.nextInt(13);
			
			if (trackQCalls[num]==3)
			{
				full=true;
			}
			else
				trackQCalls[num]+=1;
		}
		while(full==true);
		
		return(num);
	}

}
/*
 * 
 */
