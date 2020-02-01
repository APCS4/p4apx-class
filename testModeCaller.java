
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AP_Exam.AP_Console;
import model_questions.QuestionMC;

//import AP_Exam.encapsulationQuestions;

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
	 JTextArea TestQ = new JTextArea();
	 JTextArea testQuestionAnswer = new JTextArea();
	private JTextField dispScore;
	private JTextField dispPercent;
	
	//used in this class
	public static int selected=0;
	public static int correct=9;
	public static int score=0;
	
	JScrollPane scrollPane_2; 
	JLabel lblExamSections;
	JLabel lblAnswer;
	JScrollPane scrollPane;
	JLabel lblQuestion;
	JRadioButton chA;
	JRadioButton chB;
	JRadioButton chC;
	JRadioButton chD;
	JRadioButton chE;
	JButton Submit;
	int calls[];
	JButton btnNextQuestion;
	Random rand;
	int numberFull; 
	

    
    public testModeCaller() 
    {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 784, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(18, 424, 750, 23);
		contentPane.add(scrollPane_2);
		scrollPane_2.setViewportView(testQuestionAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
	
		lblExamSections = new JLabel("AP EXAM: Test Mode");
		lblExamSections.setBounds(6, 6, 161, 16);
		contentPane.add(lblExamSections);
		
		lblAnswer = new JLabel("Correct Answer:");
		lblAnswer.setBounds(18, 406, 760, 16);
		contentPane.add(lblAnswer);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 55, 750, 192);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(TestQ);
		
		TestQ.setEditable(false);
		TestQ.setLineWrap(true);
		
		lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(18, 34, 129, 16);
		contentPane.add(lblQuestion);
		
		
		chA = new JRadioButton("");
		chA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=1;	//the user selected choice "A"
			}
		});
		chA.setBounds(18, 255, 750, 23);
		contentPane.add(chA);
		
		chC = new JRadioButton("");
		chC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=3;	//the user selected choice "C"
			}
		});
		chC.setBounds(18, 303, 750, 23);
		contentPane.add(chC);
		
		
		chB = new JRadioButton("");
		chB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=2;	//the user selected choice "B"
			}
		});
		chB.setBounds(18, 278, 750, 23);
		contentPane.add(chB);
		
		chD = new JRadioButton("");
		chD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=4;	//the user selected choice "D"
			}
		});
		chD.setBounds(18, 325, 750, 23);
		contentPane.add(chD);
		
		chE = new JRadioButton("");
		chE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=5;	//the user selected choice "e"
			}
		});
		chE.setBounds(18, 349, 750, 23);
		contentPane.add(chE);
		
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
		dispPercent.setEditable(false);
	
		dispPercent.setBounds(533, 1, 70, 26);
		contentPane.add(dispPercent);
		dispPercent.setColumns(10);
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(18, 255, 750, 117);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(0, 29, 794, 432);
		contentPane.add(label);
		
		
		Submit = new JButton("Submit Answer ");
		Submit.setBounds(514, 383, 264, 29);
		contentPane.add(Submit);
		
		//testModeSwitch doStuff = new testModeSwitch(); 
		
		
		//Calls array
		calls = new int[9];
		//Fills array with 0, represents 0 calls to each type of question
		for (int i= 0; i<9; i++)
		{
		calls[i]=0;
		}
		btnNextQuestion = new JButton("Next Question");
		btnNextQuestion.setBounds(6, 475, 780, 29);
		contentPane.add(btnNextQuestion);
		
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
					QuestionMC a = new AP_Exam.FinalArrayList();
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
					QuestionMC b = new AP_Exam.FinalBooleanQuestions();
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
					QuestionMC c = new AP_Exam.FinalCodeAnalysis();
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
					QuestionMC d = new AP_Exam.FinalInfoQuestions();
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
					QuestionMC x = new AP_Exam.FinalLoopQuestion();
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
					QuestionMC f = new AP_Exam.FinalMath();
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
					QuestionMC g = new AP_Exam.FinalPolymorphQuestions();
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
					
						QuestionMC k = new AP_Exam.FinalRecursion();
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
						};
						});
					
				
					
					 
					break; 
				case 8: 
					calls[question]+=1;
					QuestionMC m = new AP_Exam.FinalStrings();
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
		});
    }
}
    
