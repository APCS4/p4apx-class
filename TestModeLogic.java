import java.util.Random;

public class TestModeLogic /*extends MenuControl */{
	
	int trackQCalls[] = {0,0,0,0,0,0,0,0,0,0,0,0,0}; //tracks # of times each class was called, starts at 0 (array has 13 spots, ranges from 0-12)
	
	public TestModeLogic()
	{
	}
	
	
	
	public void makeQuestions()
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
	
		String [] questionText = new String[36];
		String [] answerText = new String [36];

		int randNum;
		
		for (int p = 0; p < 36; p++)
		{
			randNum= getRandNum();
			questionText[p] = questionList[randNum].getQuestion(); 
			answerText[p] = questionList[randNum].getAnswer();
		}
		  

	}
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
