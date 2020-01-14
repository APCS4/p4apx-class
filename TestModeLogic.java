import java.util.Random;

public class TestModeLogic /*extends MenuControl */{
	
	
	public TestModeLogic()
	{
	}
	
	
	
	public void makeQuestions()
	
	{
		Random rand; 

		AP_Exam.Question type1 = new AP_Exam.MathQuestions(); 
		AP_Exam.Question type2 = new AP_Exam.encapsulationQuestions(); 
		AP_Exam.Question type3 = new AP_Exam.DataTypeQuestions();
		AP_Exam.Question type4 = new AP_Exam.BinaryMathQuestions();
		AP_Exam.Question type5 = new AP_Exam.CA();
		AP_Exam.Question type6 = new AP_Exam.MVCQuestion();
		AP_Exam.Question type7 = new AP_Exam.OperatorQuestions();
		AP_Exam.Question type8 = new AP_Exam.ArrayListQuestions();
		AP_Exam.Question type9 = new AP_Exam.BackgroundInfoQuestions();
		AP_Exam.Question type10 = new  AP_Exam.PowSqrt();
		AP_Exam.Question type11 = new AP_Exam.Recursion();
		AP_Exam.Question type12= new AP_Exam.PolymorphismQuestions();
		AP_Exam.Question type13= new AP_Exam.Polymorph();

		AP_Exam.Question [] questionList = {type1, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13};
	
		String [] questionText = new String[36];
		String [] answerText = new String [36];
		rand = new Random(); 
		for (int p = 0; p < 36; p++)
		   { 
		int i = rand.nextInt(13);
		 		
		questionText[p] = questionList[i].getQuestion(); 

		answerText[p] = questionList[i].getAnswer();

		    }
//missing logic for stopping at three of each question, and for combining the question types that had more than one class (like ArrayList)
	}

}
