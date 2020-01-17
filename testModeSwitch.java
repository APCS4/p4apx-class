import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

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
		btnNextQuestion.addActionListener(new ActionListener() {
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
				switch(question)
				{
				case 0: 
					calls[0]+=1;
					AP_Exam.Question a = new AP_Exam.FinalArrayList();
					   TestQ.setText(a.getQuestion());
					chA.setText(a.getChoiceA());
					chB.setText(a.getChoiceB());
					chC.setText(a.getChoiceC());
					chD.setText(a.getChoiceD());
					chE.setText(a.getChoiceE());
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e)
					{
						testQuestionAnswer.setText(a.getAnswer());
					}
					});
				
					break; 
				case 1: 
					calls[1]+=1;
					AP_Exam.Question b = new AP_Exam.FinalBooleanQuestions();
					  TestQ.setText(b.getQuestion());
					chA.setText(b.getChoiceA());
					chB.setText(b.getChoiceB());
					chC.setText(b.getChoiceC());
					chD.setText(b.getChoiceD());
					chE.setText(b.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(b.getAnswer());
				
					}
					});
				
					break;
				case 2:
					calls[2]+=1;
					AP_Exam.Question c = new AP_Exam.FinalCodeAnalysis();
					   TestQ.setText(c.getQuestion());
					chA.setText(c.getChoiceA());
					chB.setText(c.getChoiceB());
					chC.setText(c.getChoiceC());
					chD.setText(c.getChoiceD());
					chE.setText(c.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(c.getAnswer());
					}
					});
				
					break; 
					 
				case 3: 
					calls[3]+=1;
					AP_Exam.Question d = new AP_Exam.finalInfoQuestions();
					   TestQ.setText(d.getQuestion());
					chA.setText(d.getChoiceA());
					chB.setText(d.getChoiceB());
					chC.setText(d.getChoiceC());
					chD.setText(d.getChoiceD());
					chE.setText(d.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(d.getAnswer());
					}
					});
				
					break;
				case 4: 
					calls[question]+=1;
					AP_Exam.Question x = new AP_Exam.FinalLoopQuestion();
					TestQ.setText(x.getQuestion());
					chA.setText(x.getChoiceA());
					chB.setText(x.getChoiceB());
					chC.setText(x.getChoiceC());
					chD.setText(x.getChoiceD());
					chE.setText(x.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(x.getAnswer());
					}
					});
				
					break; 
				case 5: 
					calls[question]+=1;
					AP_Exam.Question f = new AP_Exam.FinalMath();
					TestQ.setText(f.getQuestion());
					chA.setText(f.getChoiceA());
					chB.setText(f.getChoiceB());
					chC.setText(f.getChoiceC());
					chD.setText(f.getChoiceD());
					chE.setText(f.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(f.getAnswer());
					}
					});
					
					break; 
				case 6: 
					calls[question]+=1;
					AP_Exam.Question g = new AP_Exam.FinalPolymorphQuestions();
					TestQ.setText(g.getQuestion());
					chA.setText(g.getChoiceA());
					chB.setText(g.getChoiceB());
					chC.setText(g.getChoiceC());
					chD.setText(g.getChoiceD());
					chE.setText(g.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(g.getAnswer());
					}
					});
					
					break;
				case 7:
					calls[question]+=1;
					
						AP_Exam.Question k = new AP_Exam.FinalRecursion();
						   TestQ.setText(k.getQuestion());
						chA.setText(k.getChoiceA());
						chB.setText(k.getChoiceB());
						chC.setText(k.getChoiceC());
						chD.setText(k.getChoiceD());
						chE.setText(k.getChoiceE());
				
						Submit.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e) {
								testQuestionAnswer.setText(k.getAnswer());
							}
						});
					
						break; 
				case 8: 
					calls[question]+=1;
					AP_Exam.Question m = new AP_Exam.finalStrings();
					TestQ.setText(m.getQuestion());
					chA.setText(m.getChoiceA());
					chB.setText(m.getChoiceB());
					chC.setText(m.getChoiceC());
					chD.setText(m.getChoiceD());
					chE.setText(m.getChoiceE());
				
					Submit.addActionListener(new ActionListener() {
				
					public void actionPerformed(ActionEvent e) {
				
					testQuestionAnswer.setText(m.getAnswer());
					}
					});
				}
			}
			
		}
	}
				
			
		//add else option later to display message that says "test finished"
		



