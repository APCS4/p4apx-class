

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
		scrollPane_2.setBounds(6, 387, 363, 39);
		contentPane.add(scrollPane_2);
		scrollPane_2.setRowHeaderView(testQuestionAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 22, 418, 237);
		contentPane.add(scrollPane);
		scrollPane.setColumnHeaderView(testQuestion);
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 278, 418, 86);
		contentPane.add(scrollPane_1);
		scrollPane_1.setRowHeaderView(testChoices);
		
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(6, 6, 91, 16);
		contentPane.add(lblQuestion);
		
		JLabel lblChoices = new JLabel("Choices");
		lblChoices.setBounds(6, 261, 61, 16);
		contentPane.add(lblChoices);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(436, 278, 141, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(436, 302, 141, 23);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(436, 327, 141, 23);
		contentPane.add(rdbtnC);
		
		JRadioButton radioButton = new JRadioButton("B");
		radioButton.setBounds(436, 351, 141, 23);
		contentPane.add(radioButton);
		
		JLabel lblAnswerChoices = new JLabel("Answer Choices");
		lblAnswerChoices.setBounds(436, 261, 130, 16);
		contentPane.add(lblAnswerChoices);
		
		JButton btnArrayListQuestions = new JButton("Array List Questions");
		btnArrayListQuestions.setBounds(594, 34, 184, 29);
		contentPane.add(btnArrayListQuestions);
		
		JButton btnGeneralJavaInfo = new JButton("General Java Info");
		btnGeneralJavaInfo.setBounds(594, 64, 184, 29);
		contentPane.add(btnGeneralJavaInfo);
		
		JButton btnBooleanMathQuestions = new JButton("Boolean Math Questions");
		btnBooleanMathQuestions.setBounds(594, 94, 184, 29);
		contentPane.add(btnBooleanMathQuestions);
		
		JButton btnCodeAnalysisQuestions = new JButton("Code Analysis Questions");
		btnCodeAnalysisQuestions.setBounds(594, 124, 184, 29);
		contentPane.add(btnCodeAnalysisQuestions);
		btnCodeAnalysisQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model_questions.Question q = new AP_Exam.FinalCodeAnalysis();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		
	
		JButton btnLoopQuestions = new JButton("Loop Questions");
		btnLoopQuestions.setBounds(594, 154, 184, 29);
		contentPane.add(btnLoopQuestions);
		
		JButton btnMathQuestions = new JButton("Math Questions");
		btnMathQuestions.setBounds(594, 184, 184, 29);
		contentPane.add(btnMathQuestions);
		
		JButton btnPolymorphismQuestions = new JButton("Polymorphism Questions");
		btnPolymorphismQuestions.setBounds(594, 214, 184, 29);
		contentPane.add(btnPolymorphismQuestions);
		
		JButton btnRecursiveCodeAnalysis = new JButton("Recursive Code Analysis");
		btnRecursiveCodeAnalysis.setBounds(594, 244, 184, 29);
		contentPane.add(btnRecursiveCodeAnalysis);
		
		JButton btnStringQuestions = new JButton("String Questions");
		btnStringQuestions.setBounds(594, 274, 184, 29);
		contentPane.add(btnStringQuestions);

	}
}
