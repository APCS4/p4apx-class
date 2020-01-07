
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AP_Exam.AP_Console;


import AP_Exam.encapsulationQuestions;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import java.util.Random;
public class testModeCaller extends MenuControl{
	private static final long serialVersionUID = 1L;
	private JPanel testQuestion;
    private JTextArea testQuestionAnswer = new JTextArea();
    private JTextField textField;
    private JTextField textField_1;
    private JLabel TestQ;
	
    public testModeCaller() {
			
		/**
		 * Create the frame.
		 */			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 792, 521);
			testQuestion = new JPanel();
			testQuestion.setBackground(new Color(220, 220, 220));
			testQuestion.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(testQuestion);
			testQuestion.setLayout(null);

			JLabel lblExamSections = new JLabel("AP Exam Test Mode");
			lblExamSections.setBounds(18, 6, 264, 16);
			testQuestion.add(lblExamSections);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(74, 407, 651, 59);
			testQuestion.add(scrollPane_2);
			scrollPane_2.setViewportView(testQuestionAnswer);
			
			testQuestionAnswer.setEditable(false);
			testQuestionAnswer.setLineWrap(true);
			
			JLabel lblAnswer = new JLabel("Answer");
			lblAnswer.setBounds(6, 441, 61, 16);
			testQuestion.add(lblAnswer);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(18, 62, 454, 161);
			testQuestion.add(scrollPane);
			
			TestQ = new JLabel("");
			scrollPane.setViewportView(TestQ);
			
			JLabel lblQuestion = new JLabel("Question");
			lblQuestion.setBounds(18, 34, 61, 16);
			testQuestion.add(lblQuestion);
			
			JRadioButton chA = new JRadioButton("New radio button");
			chA.setBounds(18, 235, 720, 23);
			testQuestion.add(chA);
			chA.setText("");
			
			JRadioButton chB = new JRadioButton("");
			chB.setBounds(18, 270, 720, 23);
			testQuestion.add(chB);
			
			JRadioButton chC = new JRadioButton("");
			chC.setBounds(18, 305, 720, 23);
			testQuestion.add(chC);
			
			JRadioButton chD = new JRadioButton("");
			chD.setBounds(18, 340, 720, 23);
			testQuestion.add(chD);
			
			JRadioButton chE = new JRadioButton("");
			chE.setBounds(18, 372, 720, 23);
			testQuestion.add(chE);
			
			JLabel lblYourScore = new JLabel("Your Score: ");
			lblYourScore.setBounds(484, 34, 96, 16);
			testQuestion.add(lblYourScore);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(562, 29, 130, 26);
			testQuestion.add(textField);
			textField.setColumns(10);
			
			JLabel lblPercentage = new JLabel("Percentage: ");
			lblPercentage.setBounds(484, 92, 82, 16);
			testQuestion.add(lblPercentage);
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(562, 87, 130, 26);
			testQuestion.add(textField_1);
			textField_1.setColumns(10);

			
			JButton btnNewButton = new JButton("Submit Answer");
			btnNewButton.setBounds(449, 436, 160, 29);
			
			//Calls array
			int calls[]= new int[13];
			
			//Fills array with 0, represents 0 calls to each type of question
			for (int i= 0; i<13; i++)
			{
				calls[i]=0;
			}
			
			
						JButton btnNextQuestion = new JButton("Next Question");
			btnNextQuestion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Random rand = new Random();
					
					int numberFull=0;
					
					//check how many indexes are full (at 3)
					for (int i= 0; i<13; i++)
					{
						if (calls[i]==3)
							numberFull ++;
								
					}
					int question; 
					
					if (numberFull!=13)
					{
						question = rand.nextInt(13); 
						
						while(calls[question]==3)
						{
							question = rand.nextInt(13); 
						}

						
						//increment value in calls and call methods
						switch(question)
						{
						case 0: 
							calls[0]+=1;
							AP_Exam.Question a = new AP_Exam.MathQuestions();
						    TestQ.setText(a.getQuestion());
							testQuestionAnswer.setText(a.getAnswer());
							chA.setText(a.getChoiceA());
							chB.setText(a.getChoiceB());
							chC.setText(a.getChoiceC());
							chD.setText(a.getChoiceD());
							chE.setText(a.getChoiceE());
							
							break; 
						
						case 1: 
							calls[1]+=1;
							AP_Exam.encapsulationQuestions b = new AP_Exam.encapsulationQuestions();
						   TestQ.setText(b.getQuestion());
							testQuestionAnswer.setText(b.getAnswer());
							chA.setText(b.getChoiceA());
							chB.setText(b.getChoiceB());
							chC.setText(b.getChoiceC());
							chD.setText(b.getChoiceD());
							chE.setText(b.getChoiceE());
							break;
							
						case 2:
							calls[2]+=1;
							AP_Exam.Question c = new AP_Exam.DataTypeQuestions();
						    TestQ.setText(c.getQuestion());
							testQuestionAnswer.setText(c.getAnswer());
							chA.setText(c.getChoiceA());
							chB.setText(c.getChoiceB());
							chC.setText(c.getChoiceC());
							chD.setText(c.getChoiceD());
							chE.setText(c.getChoiceE());
							break; 
							
					 
						case 3: 
							calls[3]+=1;
							AP_Exam.Question d = new AP_Exam.BinaryMathQuestions();
						    TestQ.setText(d.getQuestion());
							testQuestionAnswer.setText(d.getAnswer());
							chA.setText(d.getChoiceA());
							chB.setText(d.getChoiceB());
							chC.setText(d.getChoiceC());
							chD.setText(d.getChoiceD());
							chE.setText(d.getChoiceE());
							break;
							
						case 4: 
							calls[question]+=1;
							AP_Exam.Question x = new AP_Exam.CA();
							TestQ.setText(x.getQuestion());
							testQuestionAnswer.setText(x.getAnswer());
							chA.setText(x.getChoiceA());
							chB.setText(x.getChoiceB());
							chC.setText(x.getChoiceC());
							chD.setText(x.getChoiceD());
							chE.setText(x.getChoiceE());
							break; 
							
						case 5: 
							calls[question]+=1;
							AP_Exam.Question f = new AP_Exam.MVCQuestion();
							TestQ.setText(f.getQuestion());
							testQuestionAnswer.setText(f.getAnswer());
							chA.setText(f.getChoiceA());
							chB.setText(f.getChoiceB());
							chC.setText(f.getChoiceC());
							chD.setText(f.getChoiceD());
							chE.setText(f.getChoiceE());
							break; 
							
						case 6: 
							calls[question]+=1;
							AP_Exam.Question g = new AP_Exam.OperatorQuestions();
						TestQ.setText(g.getQuestion());
							testQuestionAnswer.setText(g.getAnswer());
							chA.setText(g.getChoiceA());
							chB.setText(g.getChoiceB());
							chC.setText(g.getChoiceC());
							chD.setText(g.getChoiceD());
							chE.setText(g.getChoiceE());
							break;
						
							
						case 7:
							calls[question]+=1;
							int listPicker = rand.nextInt(2);
							
							if(listPicker==0)
							{
								AP_Exam.Question k = new AP_Exam.ArrayListQuestions();
							    TestQ.setText(k.getQuestion());
								testQuestionAnswer.setText(k.getAnswer());
								chA.setText(k.getChoiceA());
								chB.setText(k.getChoiceB());
								chC.setText(k.getChoiceC());
								chD.setText(k.getChoiceD());
								chE.setText(k.getChoiceE());
							}
							
							else
							{

								AP_Exam.Question p = new AP_Exam.ListQuestions2();
								TestQ.setText(p.getQuestion());
								testQuestionAnswer.setText(p.getAnswer());
								chA.setText(p.getChoiceA());
								chB.setText(p.getChoiceB());
								chC.setText(p.getChoiceC());
								chD.setText(p.getChoiceD());
								chE.setText(p.getChoiceE());
							}						
							break; 
						case 8: 
							calls[question]+=1;
							AP_Exam.Question m = new AP_Exam.BackgroundInfoQuestions();
							TestQ.setText(m.getQuestion());
							testQuestionAnswer.setText(m.getAnswer());
							chA.setText(m.getChoiceA());
							chB.setText(m.getChoiceB());
							chC.setText(m.getChoiceC());
							chD.setText(m.getChoiceD());
							chE.setText(m.getChoiceE());
							break; 
						
						case 9: 
							calls[question]+=1;
							AP_Exam.Question n = new AP_Exam.PowSqrt();
						TestQ.setText(n.getQuestion());
							testQuestionAnswer.setText(n.getAnswer());
							chA.setText(n.getChoiceA());
							chB.setText(n.getChoiceB());
							chC.setText(n.getChoiceC());
							chD.setText(n.getChoiceD());
							chE.setText(n.getChoiceE());
							break; 
						
						case 10: 
							calls[question]+= 1;
							AP_Exam.Question o = new AP_Exam.Recursion();
						TestQ.setText(o.getQuestion());
							testQuestionAnswer.setText(o.getAnswer());
							chA.setText(o.getChoiceA());
							chB.setText(o.getChoiceB());
							chC.setText(o.getChoiceC());
							chD.setText(o.getChoiceD());
							chE.setText(o.getChoiceE());
							break; 
						
						case 11: 
							calls[question]+= 1;
							AP_Exam.Question q = new AP_Exam.PolymorphismQuestions();
							TestQ.setText(q.getQuestion());
							testQuestionAnswer.setText(q.getAnswer());
							chA.setText(q.getChoiceA());
							chB.setText(q.getChoiceB());
							chC.setText(q.getChoiceC());
							chD.setText(q.getChoiceD());
							chE.setText(q.getChoiceE());
							break; 
							
						case 12: 
							calls[question]+= 1;
							AP_Exam.Question r = new AP_Exam.Polymorph();
							TestQ.setText(r.getQuestion());
							testQuestionAnswer.setText(r.getAnswer());
							chA.setText(r.getChoiceA());
							chB.setText(r.getChoiceB());
							chC.setText(r.getChoiceC());
							chD.setText(r.getChoiceD());
							chE.setText(r.getChoiceE());
							break; 
							
							
						
						
					
						}
						
						
					}
					
					//add else option later to display message that says "test finished"
					
				}
			});
			
			
			btnNextQuestion.setBounds(265, 21, 175, 29);
			testQuestion.add(btnNextQuestion);
			
			JButton btnNewButton_2 = new JButton("Polymorph");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AP_Exam.Question q = new AP_Exam.Polymorph();
					//testQuestion.setText(q.getQuestion());
					testQuestionAnswer.setText(q.getAnswer());
				}});
			
				
				
    //reverted all changes, Mateo, your  commit caused the errors, please make sure to debug before committing
			
			
	}
}
