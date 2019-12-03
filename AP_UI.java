
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AP_Exam.AP_Console;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AP_UI extends MenuControl {

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Exam Sections");
		lblExamSections.setBounds(41, -7, 91, 16);
		contentPane.add(lblExamSections);
		
		JButton btnMath = new JButton("Math");
		btnMath.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.MathQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnMath.setBounds(41, 21, 91, 29);
		contentPane.add(btnMath);
		
		JButton btnDataTypes = new JButton("Data Types");
		btnDataTypes.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnDataTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.DataTypeQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnDataTypes.setBounds(257, 21, 101, 29);
		contentPane.add(btnDataTypes);
		
		JButton btnBinaryMath = new JButton("Binary Math");
		btnBinaryMath.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnBinaryMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.BinaryMathQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		
		
		
		btnBinaryMath.setBounds(107, 21, 61, 29);

		btnBinaryMath.setBounds(144, 21, 101, 29);

		contentPane.add(btnBinaryMath);
		
		JButton btnConsole = new JButton("C");
		btnConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Console.main();
			}
		});
		btnConsole.setForeground(Color.RED);
		btnConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		btnConsole.setBackground(Color.LIGHT_GRAY);
		btnConsole.setBounds(406, 21, 21, 18);
		contentPane.add(btnConsole);
		
		
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		testQuestion.setBounds(16, 62, 418, 39);
		contentPane.add(testQuestion);
	    
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);
		testChoices.setBounds(16, 113, 418, 86);
		contentPane.add(testChoices);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(16, 211, 61, 16);
		contentPane.add(lblAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		testQuestionAnswer.setBounds(74, 211, 357, 39);
		contentPane.add(testQuestionAnswer);
		
		JButton btnLucyandcynthia = new JButton("LucyandCynthia");
		btnLucyandcynthia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLucyandcynthia.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnLucyandcynthia.setBounds(451, 50, 188, 39);
		contentPane.add(btnLucyandcynthia);
		
		JButton btnMVC = new JButton("MVC");
		btnMVC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.MVCQuestion();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnMVC.setBounds(471, 131, 138, 29);
		contentPane.add(btnMVC);
		
		
		JButton btnArraylist = new JButton("ArrayList");
		btnArraylist.setBounds(461, 101, 138, 29);
		contentPane.add(btnArraylist);
	
		JButton Power = new JButton("Power");
		Power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.Power();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		Power.setBounds(471, 172, 138, 29);
		contentPane.add(Power);
	
	
	
	
	
	}
}
