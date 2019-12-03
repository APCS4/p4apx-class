
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
import javax.swing.AbstractAction;
import javax.swing.Action;

public class AP_UI extends MenuControl {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
    private final Action action = new SwingAction();
	
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

		JLabel lblExamSections = new JLabel("Exam Sections");
		lblExamSections.setBounds(41, 6, 91, 16);
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
		btnMath.setBounds(18, 21, 91, 29);
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
		btnDataTypes.setBounds(264, 21, 101, 29);
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
		
		
		
		btnBinaryMath.setBounds(91, 34, 61, 29);

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

		JButton btnPower = new JButton("Power");
		btnPower.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnPower.setBounds(457, 236, 109, 51);
		contentPane.add(btnPower);

		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		testQuestion.setBounds(16, 62, 418, 204);
		contentPane.add(testQuestion);
	    
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);
		testChoices.setBounds(16, 278, 418, 86);
		contentPane.add(testChoices);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(18, 376, 61, 16);
		contentPane.add(lblAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		testQuestionAnswer.setBounds(74, 376, 357, 39);
		contentPane.add(testQuestionAnswer);
		
		JButton btnLucyandcynthia = new JButton("Code Analysis");
		btnLucyandcynthia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.CA();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
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
		btnMVC.setBounds(446, 101, 138, 29);
		contentPane.add(btnMVC);
		


		JButton btnNewButton = new JButton("DanielAndFox");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.OperatorQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});

		btnNewButton.setBounds(456, 184, 120, 39);
		contentPane.add(btnNewButton);

		JButton btnArraylist = new JButton("ArrayList");
		btnArraylist.setBounds(446, 130, 138, 29);
		contentPane.add(btnArraylist);
		
		JButton btnTeamboba = new JButton("✧･ﾟ: *✧･ﾟ:* Team Boba *:･ﾟ✧*:･ﾟ✧");
		btnTeamboba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnTeamboba.setAction(action);
		btnTeamboba.setForeground(Color.RED);
		btnTeamboba.setBackground(Color.RED);
		btnTeamboba.setFont(new Font("Papyrus", Font.BOLD, 16));
		btnTeamboba.setBounds(457, 299, 279, 39);
		contentPane.add(btnTeamboba);


		//JButton btnArraylist = new JButton("ArrayList");
		//btnArraylist.setBounds(461, 101, 138, 29);
		//contentPane.add(btnArraylist);
		

	
		JButton Power = new JButton("Power");
		Power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.Power();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		Power.setBounds(446, 158, 138, 29);
		contentPane.add(Power);
	
		//alex and mithil code
	
	

	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
