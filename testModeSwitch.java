import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

import model_questions.Question;
import model_questions.QuestionMC;


public class testModeSwitch extends testModeCaller
{

	//int calls[];

	public testModeSwitch()
	{

		calls = new int[9];
		//Fills array with 0, represents 0 calls to each type of question
		for (int i= 0; i<9; i++)
		{
			calls[i]=0;
		}
		

		btnNextQuestion = new JButton("Next Question");
		btnNextQuestion.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				rand = new Random();
				numberFull=0;
				
				//check how many indexes are full (at 3)
				for (int i= 0; i<9; i++)	
				{
					if (calls[i]==3)
						numberFull ++;
				}
			
				int question; 
				
				if (numberFull!=9)
				{
					testQuestionAnswer.setText("");
						
				    chA.setSelected(false);
					chB.setSelected(false);
					chC.setSelected(false); 
					chD.setSelected(false);
					chE.setSelected(false); 
					
					question = rand.nextInt(9); 
					while(calls[question]==4)
					{
						question = rand.nextInt(9); 
					}
					//increment value in calls and call methods
					
					Question q;
					switch(question)
					{
					case 0: 	
						q = new AP_Exam.FinalArrayList();
						break;
					case 1: 
						q = new AP_Exam.FinalBooleanQuestions();
						break;
					case 2:
						q = new AP_Exam.FinalCodeAnalysis();
						break; 						 
					case 3: 
						q = new AP_Exam.FinalInfoQuestions();
						break;
					case 4: 
						q = new AP_Exam.FinalLoopQuestion();					
						break; 
					case 5: 
						q = new AP_Exam.FinalMath();
						break; 
					case 6: 
						q = new AP_Exam.FinalPolymorphQuestions();
						break;
					case 7:
						q = new AP_Exam.FinalRecursion();
						break; 
					case 8:
					default:
						q = new AP_Exam.FinalStrings();	
						break;
					}
					
					// set text for questions
					QuestionMC mcq = (QuestionMC)q;
					calls[question]+=1;
					TestQ.setText(q.getQuestion());
					chA.setText(mcq.getChoiceA());
					chB.setText(mcq.getChoiceB());
					chC.setText(mcq.getChoiceC());
					chD.setText(mcq.getChoiceD());
					chE.setText(mcq.getChoiceE());
					Submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							testQuestionAnswer.setText(q.getAnswer());
						}
					});
					
				}
			}
		});
	}
}


		

				
			
		//add else option later to display message that says "test finished"
		



