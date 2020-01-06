
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
import javax.swing.JList;
import java.awt.List;
import java.awt.Component;
import javax.swing.Box;
public class testModeCaller extends MenuControl{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
    private JTextField dispScore;
    private JTextField dispPercent;

    //used in this class
   public static int selected=0;
    public static int correct=9;
    public static int score=0;


    public testModeCaller() 
    {
			
		/**
		 * Create the frame.
		 */			
    		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 784, 566);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(220, 220, 220));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(18, 424, 750, 23);
			contentPane.add(scrollPane_2);
			scrollPane_2.setViewportView(testQuestionAnswer);
			
			testQuestionAnswer.setEditable(false);
			testQuestionAnswer.setLineWrap(true);

			JLabel lblExamSections = new JLabel("AP EXAM: Test Mode");
			lblExamSections.setBounds(6, 6, 161, 16);
			contentPane.add(lblExamSections);
			
			JLabel lblAnswer = new JLabel("Correct Answer:");
			lblAnswer.setBounds(18, 406, 760, 16);
			contentPane.add(lblAnswer);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(18, 55, 750, 192);
			contentPane.add(scrollPane);
			scrollPane.setViewportView(testQuestion);
			
			testQuestion.setEditable(false);
			testQuestion.setLineWrap(true);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(76, 278, 355, 86);
			contentPane.add(scrollPane_1);
			scrollPane_1.setRowHeaderView(testChoices);
			
			testChoices.setEditable(false);
			testChoices.setLineWrap(true);
			
			JLabel lblQuestion = new JLabel("Question");
			lblQuestion.setBounds(18, 34, 129, 16);
			contentPane.add(lblQuestion);
			

			
			JRadioButton choiceA = new JRadioButton("");
			choiceA.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					selected=1;	//the user selected choice "A"
				}
			});
			
			choiceA.setBounds(18, 255, 750, 23);
			contentPane.add(choiceA);
			
			JRadioButton choiceC = new JRadioButton("");
			choiceC.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					selected=3;	//the user selected choice "C"
				}
			});
			
			choiceC.setBounds(18, 279, 750, 23);
			contentPane.add(choiceC);
			
			
			JRadioButton choiceB = new JRadioButton("");
			choiceB.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					selected=2;	//the user selected choice "B"
				}
			});
			
			choiceB.setBounds(18, 302, 750, 23);
			contentPane.add(choiceB);
			
			JRadioButton choiceD = new JRadioButton("");
			choiceD.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					selected=4;	//the user selected choice "D"
				}
			});
			
			choiceD.setBounds(18, 325, 750, 23);
			contentPane.add(choiceD);
			
			JRadioButton choiceE = new JRadioButton("");
			choiceE.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					selected=5;	//the user selected choice "e"
				}
			});
			
			choiceE.setBounds(18, 349, 750, 23);
			contentPane.add(choiceE);
			
			JButton Submit = new JButton("Submit Answer ");
			
			
			
			//Calls array
			int calls[]= new int[13];
			
			//Fills array with 0, represents 0 calls to each type of question
			for (int i= 0; i<13; i++)
			{
				calls[i]=0;
			}
			

			
			JButton btnNextQuestion = new JButton("Next Question");
			btnNextQuestion.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					testQuestionAnswer.setText("");
					choiceA.setSelected(false);
					choiceB.setSelected(false);
					choiceC.setSelected(false);
					choiceD.setSelected(false);
					choiceE.setSelected(false);
					
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
									
							case 1: 
								calls[1]+=1;
								AP_Exam.encapsulationQuestions b = new AP_Exam.encapsulationQuestions();
								testQuestion.setText(b.getQuestion());
								choiceA.setText(b.getChoiceA()); 
								choiceC.setText(b.getChoiceB());
								choiceB.setText(b.getChoiceC());
								choiceD.setText(b.getChoiceD());
								choiceE.setText(b.getChoiceE());
					
								Submit.addActionListener(new ActionListener() 
								{
									public void actionPerformed(ActionEvent e) 
									{
										testQuestionAnswer.setText(b.getAnswer());
									}
								});
					break;
					
				case 2:
					calls[2]+=1;
					AP_Exam.Question c = new AP_Exam.DataTypeQuestions();
					testQuestion.setText(c.getQuestion());
					choiceA.setText(c.getChoiceA()); 
					choiceC.setText(c.getChoiceB());
					choiceB.setText(c.getChoiceC());
					choiceD.setText(c.getChoiceD());
					choiceE.setText(c.getChoiceE());
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(c.getAnswer());
						}
					});
					break; 
					
			 
				case 3: 
					calls[3]+=1;
					AP_Exam.Question d = new AP_Exam.BinaryMathQuestions();
					testQuestion.setText(d.getQuestion());
					choiceA.setText(d.getChoiceA()); 
					choiceC.setText(d.getChoiceB());
					choiceB.setText(d.getChoiceC());
					choiceD.setText(d.getChoiceD());
					choiceE.setText(d.getChoiceE());
	
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							
					 
						
							testQuestionAnswer.setText(d.getAnswer());
						}
					});
					break;
					
				case 4: 
					calls[question]+=1;
					AP_Exam.Question x = new AP_Exam.CA();
					testQuestion.setText(x.getQuestion());
					choiceA.setText(x.getChoiceA()); 
					choiceC.setText(x.getChoiceB());
					choiceB.setText(x.getChoiceC());
					choiceD.setText(x.getChoiceD());
					choiceE.setText(x.getChoiceE());
				
					
					Submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							testChoices.setText(x.getChoices());
							testQuestionAnswer.setText(x.getAnswer());
						}
					});

					
					break; 
					
				case 5: 
					calls[question]+=1;
					AP_Exam.Question f = new AP_Exam.MVCQuestion();
					testQuestion.setText(f.getQuestion());
					choiceA.setText(f.getChoiceA()); 
					choiceC.setText(f.getChoiceB());
					choiceB.setText(f.getChoiceC());
					choiceD.setText(f.getChoiceD());
					choiceE.setText(f.getChoiceE());							
			
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(f.getAnswer());
						}
					});

					
					break; 
					
				case 6: 
					calls[question]+=1;
					AP_Exam.Question g = new AP_Exam.OperatorQuestions();
					testQuestion.setText(g.getQuestion());
					choiceA.setText(g.getChoiceA()); 
					choiceC.setText(g.getChoiceB());
					choiceB.setText(g.getChoiceC());
					choiceD.setText(g.getChoiceD());
					choiceE.setText(g.getChoiceE());
			
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(g.getAnswer());
						}
					});


					
					break;
				
					
				case 7:
					calls[question]+=1;
					int listPicker = rand.nextInt(2);
					
					if(listPicker==0)
					{
						AP_Exam.Question k = new AP_Exam.ArrayListQuestions();
						testQuestion.setText(k.getQuestion());
						choiceA.setText(k.getChoiceA()); 
						choiceC.setText(k.getChoiceB());
						choiceB.setText(k.getChoiceC());
						choiceD.setText(k.getChoiceD());
						choiceE.setText(k.getChoiceE());
				
						Submit.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e) 
							{
								testQuestionAnswer.setText(k.getAnswer());
							}
						
						});
					}
					else
					{
						AP_Exam.Question p = new AP_Exam.ListQuestions2();
						testQuestion.setText(p.getQuestion());
						choiceA.setText(p.getChoiceA()); 
						choiceC.setText(p.getChoiceB());
						choiceB.setText(p.getChoiceC());
						choiceD.setText(p.getChoiceD());
						choiceE.setText(p.getChoiceE());
							
						Submit.addActionListener(new ActionListener() 
						{
							public void actionPerformed(ActionEvent e) 
							{
								testQuestionAnswer.setText(k.getAnswer());
							}	
						});
					}			

				break; 
						
				
					
				case 8: 
					calls[question]+=1;
					AP_Exam.Question m = new AP_Exam.BackgroundInfoQuestions();
					testQuestion.setText(m.getQuestion());
					choiceA.setText(m.getChoiceA()); 
					choiceC.setText(m.getChoiceB());
					choiceB.setText(m.getChoiceC());
					choiceD.setText(m.getChoiceD());
					choiceE.setText(m.getChoiceE());
					
					Submit.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							testQuestionAnswer.setText(m.getAnswer());
						}
					});

					break; 
				
				case 9: 
					calls[question]+=1;
					AP_Exam.Question n = new AP_Exam.PowSqrt();
					testQuestion.setText(n.getQuestion());
					choiceA.setText(n.getChoiceA()); 
					choiceC.setText(n.getChoiceB());
					choiceB.setText(n.getChoiceC());
					choiceD.setText(n.getChoiceD());
					choiceE.setText(n.getChoiceE());
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(n.getAnswer());
						}
					});
				break; 
				
				case 10: 
					calls[question]+= 1;
					AP_Exam.Question o = new AP_Exam.Recursion();
					testQuestion.setText(o.getQuestion());
					choiceA.setText(o.getChoiceA()); 
					choiceC.setText(o.getChoiceB());
					choiceB.setText(o.getChoiceC());
					choiceD.setText(o.getChoiceD());
					choiceE.setText(o.getChoiceE());
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(o.getAnswer());
						}
					});

				break; 
				
				case 11: 
					calls[question]+= 1;
					AP_Exam.Question q = new AP_Exam.PolymorphismQuestions();
					testQuestion.setText(q.getQuestion());
					choiceA.setText(q.getChoiceA()); 
					choiceC.setText(q.getChoiceB());
					choiceB.setText(q.getChoiceC());
					choiceD.setText(q.getChoiceD());
					choiceE.setText(q.getChoiceE());
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							testQuestionAnswer.setText(q.getAnswer());
						}
					});

				break; 
					
				case 12: 
					calls[question]+= 1;
					AP_Exam.Question r = new AP_Exam.Polymorph();
					testQuestion.setText(r.getQuestion());
					choiceA.setText(r.getChoiceA()); 
					choiceC.setText(r.getChoiceB());
					choiceB.setText(r.getChoiceC());
					choiceD.setText(r.getChoiceD());
					choiceE.setText(r.getChoiceE());
					
					Submit.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) 
						{
							
							testQuestionAnswer.setText(r.getAnswer());
						}
					});
				break; 

				Submit.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{

						if (correct==selected)
						{
							score+=1;
						}
					}
				});
				
				
				if (numberFull==13)
				{
					ScoreReport score = new ScoreReport(); 
					score.setVisible(true);
				}
			
					
				score+=1;
				dispScore.setText(String.valueOf(score));
					
		
					
					}
					
				
					});
				
				btnNextQuestion.setBounds(6, 475, 780, 29);
				contentPane.add(btnNextQuestion);
				
				JLabel lblYourScore = new JLabel("Your Score: ");
				lblYourScore.setBounds(613, 6, 96, 16);
				contentPane.add(lblYourScore);
				
				dispScore = new JTextField();
				dispScore.setEditable(false);
				dispScore.setBounds(698, 1, 69, 26);
				contentPane.add(dispScore);
				dispScore.setColumns(10);
				
				JLabel lblPercentage = new JLabel("Percentage: ");
				lblPercentage.setBounds(440, 6, 81, 16);
				contentPane.add(lblPercentage);
				
				dispPercent = new JTextField();
				dispPercent.setBounds(533, 1, 70, 26);
				contentPane.add(dispPercent);
				dispPercent.setColumns(10);
				
				JRadioButton chA = new JRadioButton("New radio button");
				chA.setBounds(6, 278, 141, 23);
				contentPane.add(chA);
				chA.setText("hello");
				
				JButton btnNewButton_2 = new JButton("Polymorph");
				
				
				Submit.setBounds(514, 383, 264, 29);
				contentPane.add(Submit);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBackground(Color.WHITE);
				lblNewLabel.setOpaque(true);
				lblNewLabel.setBounds(18, 255, 750, 117);
				contentPane.add(lblNewLabel);
				
				JLabel label = new JLabel("");
				label.setOpaque(true);
				label.setBackground(Color.LIGHT_GRAY);
				label.setBounds(0, 29, 794, 432);
				contentPane.add(label);
			
				}
			}
    });
			
			
			

