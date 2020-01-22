

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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;

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
		setBounds(100, 100, 884, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Review Sections");
		lblExamSections.setBounds(737, 6, 104, 16);
		contentPane.add(lblExamSections);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(6, 419, 61, 16);
		contentPane.add(lblAnswer);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 437, 676, 101);
		contentPane.add(scrollPane_2);
		scrollPane_2.setViewportView(testQuestionAnswer);
		testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
		testQuestionAnswer.setHighlighter(null);
		
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 23, 676, 237);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(testQuestion);
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 278, 676, 140);
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(testChoices);
		
		testChoices.setEditable(false);
		testChoices.setLineWrap(false); 
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(6, 6, 91, 16);
		contentPane.add(lblQuestion);
		
		JLabel lblChoices = new JLabel("Choices"); 
		lblChoices.setBounds(6, 261, 61, 16);
		contentPane.add(lblChoices);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(685, 281, 41, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(725, 281, 41, 23);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(765, 281, 41, 23);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(805, 281, 42, 23);
		contentPane.add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		rdbtnE.setBounds(845, 281, 41, 23);
		contentPane.add(rdbtnE);
		
		ButtonGroup abcd = new ButtonGroup();
		abcd.add(rdbtnA);
		abcd.add(rdbtnB);
		abcd.add(rdbtnC);
		abcd.add(rdbtnD);
		abcd.add(rdbtnE);
		

		JLabel lblAnswerChoices = new JLabel("Answer Choices");
		lblAnswerChoices.setBounds(737, 261, 130, 16);
		contentPane.add(lblAnswerChoices);
		
		JButton btnArrayListQuestions = new JButton("Array List Questions");
		btnArrayListQuestions.setBounds(694, 22, 184, 29);
		contentPane.add(btnArrayListQuestions);
		btnArrayListQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalArrayList q = new AP_Exam.FinalArrayList();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		}); 
		JButton btnGeneralJavaInfo = new JButton("General Java Info");
		btnGeneralJavaInfo.setBounds(694, 47, 184, 29);
		contentPane.add(btnGeneralJavaInfo);
		btnGeneralJavaInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.finalInfoQuestions q = new AP_Exam.finalInfoQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		}); 
		
		JButton btnBooleanMathQuestions = new JButton("Boolean Math Questions");
		btnBooleanMathQuestions.setBounds(694, 72, 184, 29);
		contentPane.add(btnBooleanMathQuestions);
		btnBooleanMathQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalBooleanQuestions q = new AP_Exam.FinalBooleanQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		});
		
		JButton btnCodeAnalysisQuestions = new JButton("Code Analysis Questions");
		btnCodeAnalysisQuestions.setBounds(694, 97, 184, 29);
		contentPane.add(btnCodeAnalysisQuestions);
		btnCodeAnalysisQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.FinalCodeAnalysis q = new AP_Exam.FinalCodeAnalysis();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
				testQuestionAnswer.setText(q.getAnswer());
				abcd.clearSelection();
			}
		});
		
	
		JButton btnLoopQuestions = new JButton("Loop Questions");
		btnLoopQuestions.setBounds(694, 122, 184, 29);
		contentPane.add(btnLoopQuestions);
		btnLoopQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalLoopQuestion q = new AP_Exam.FinalLoopQuestion();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		});
		
		JButton btnMathQuestions = new JButton("Math Questions");
		btnMathQuestions.setBounds(694, 147, 184, 29);
		contentPane.add(btnMathQuestions);
		btnMathQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalMath q = new AP_Exam.FinalMath();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		});
		
		JButton btnPolymorphismQuestions = new JButton("Polymorphism Questions");
		btnPolymorphismQuestions.setBounds(694, 172, 184, 29);
		contentPane.add(btnPolymorphismQuestions);
		btnPolymorphismQuestions.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalPolymorphQuestions q = new AP_Exam.FinalPolymorphQuestions();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		});
		
		JButton btnRecursiveCodeAnalysis = new JButton("Recursive Code Analysis");
		btnRecursiveCodeAnalysis.setBounds(694, 197, 184, 29);
		contentPane.add(btnRecursiveCodeAnalysis);
		btnRecursiveCodeAnalysis.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AP_Exam.FinalRecursion q = new AP_Exam.FinalRecursion();
			testQuestion.setText(q.getQuestion());
			testChoices.setText(q.getChoices());
			testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
			testQuestionAnswer.setText(q.getAnswer());
			abcd.clearSelection();
			} 
		});
		
		JButton btnStringQuestions = new JButton("String Questions");
		btnStringQuestions.setBounds(694, 222, 184, 29);
		contentPane.add(btnStringQuestions);
		btnStringQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.finalStrings q = new AP_Exam.finalStrings();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setForeground(testQuestionAnswer.getBackground());
				testQuestionAnswer.setText(q.getAnswer());
				abcd.clearSelection();
				} 
			});
		
		JButton btnSubmitAnswer = new JButton("Submit Answer");
		btnSubmitAnswer.setBounds(694, 303, 184, 29);
		contentPane.add(btnSubmitAnswer);

		btnSubmitAnswer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				boolean chA, chB, chC, chD, chE; 
				chA = rdbtnA.isSelected();
				chB = rdbtnB.isSelected();
				chC = rdbtnC.isSelected();
				chD = rdbtnD.isSelected();
				chE = rdbtnE.isSelected();
				
				if(chA || chB || chC || chD || chE)
				{
					testQuestionAnswer.setForeground(new Color(0, 0, 0));
					//abcd.clearSelection();
				}
			} 
		});

	}
}
