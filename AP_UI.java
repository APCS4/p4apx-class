

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class AP_UI extends MenuControl 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
	
	/**
	 * Create the frame.
	 */
	public AP_UI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 784, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Review Sections");
		lblExamSections.setBounds(637, 6, 104, 16);
		contentPane.add(lblExamSections);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(6, 369, 61, 16);
		contentPane.add(lblAnswer);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 387, 576, 39);
		contentPane.add(scrollPane_2);
		scrollPane_2.setRowHeaderView(testQuestionAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 23, 576, 237);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(testQuestion);
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 278, 576, 86);
		contentPane.add(scrollPane_1);
		scrollPane_1.setRowHeaderView(testChoices);
		
		testChoices.setEditable(false);
		testChoices.setLineWrap(false);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(6, 6, 91, 16);
		contentPane.add(lblQuestion);
		
		JLabel lblChoices = new JLabel("Choices");
		lblChoices.setBounds(6, 261, 61, 16);
		contentPane.add(lblChoices);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(606, 278, 41, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(646, 278, 41, 23);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(686, 278, 41, 23);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(726, 278, 52, 23);
		contentPane.add(rdbtnD);
		
		JLabel lblAnswerChoices = new JLabel("Answer Choices");
		lblAnswerChoices.setBounds(637, 261, 130, 16);
		contentPane.add(lblAnswerChoices);
		
		JButton btnArrayListQuestions = new JButton("Array List Questions");
		btnArrayListQuestions.setBounds(594, 22, 184, 29);
		contentPane.add(btnArrayListQuestions);
		btnArrayListQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalArrayList q = new AP_Exam.FinalArrayList();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		}); 
		JButton btnGeneralJavaInfo = new JButton("General Java Info");
		btnGeneralJavaInfo.setBounds(594, 47, 184, 29);
		contentPane.add(btnGeneralJavaInfo);
		btnGeneralJavaInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.finalInfoQuestions q = new AP_Exam.finalInfoQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		}); 
		
		JButton btnBooleanMathQuestions = new JButton("Boolean Math Questions");
		btnBooleanMathQuestions.setBounds(594, 72, 184, 29);
		contentPane.add(btnBooleanMathQuestions);
		btnBooleanMathQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalBooleanQuestions q = new AP_Exam.FinalBooleanQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});
		
		JButton btnCodeAnalysisQuestions = new JButton("Code Analysis Questions");
		btnCodeAnalysisQuestions.setBounds(594, 97, 184, 29);
		contentPane.add(btnCodeAnalysisQuestions);
		btnCodeAnalysisQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.FinalCodeAnalysis q = new AP_Exam.FinalCodeAnalysis();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		
	
		JButton btnLoopQuestions = new JButton("Loop Questions");
		btnLoopQuestions.setBounds(594, 122, 184, 29);
		contentPane.add(btnLoopQuestions);
		btnLoopQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalLoopQuestion q = new AP_Exam.FinalLoopQuestion();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});
		
		JButton btnMathQuestions = new JButton("Math Questions");
		btnMathQuestions.setBounds(594, 147, 184, 29);
		contentPane.add(btnMathQuestions);
		btnMathQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalMath q = new AP_Exam.FinalMath();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});
		
		JButton btnPolymorphismQuestions = new JButton("Polymorphism Questions");
		btnPolymorphismQuestions.setBounds(594, 172, 184, 29);
		contentPane.add(btnPolymorphismQuestions);
		btnPolymorphismQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalPolymorphQuestions q = new AP_Exam.FinalPolymorphQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});
		
		JButton btnRecursiveCodeAnalysis = new JButton("Recursive Code Analysis");
		btnRecursiveCodeAnalysis.setBounds(594, 197, 184, 29);
		contentPane.add(btnRecursiveCodeAnalysis);
		btnRecursiveCodeAnalysis.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalRecursion q = new AP_Exam.FinalRecursion();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});
		
		JButton btnStringQuestions = new JButton("String Questions");
		btnStringQuestions.setBounds(594, 222, 184, 29);
		contentPane.add(btnStringQuestions);
		btnStringQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.finalStrings q = new AP_Exam.finalStrings();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setText(q.getAnswer());
			} 
		});

	}
}
