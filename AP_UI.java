
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AP_Exam.AP_Console;
<<<<<<< HEAD
import Util.showCode;
=======
import AP_Exam.encapsulationQuestions;
>>>>>>> branch 'master' of https://github.com/APCS4/p4apx-class.git

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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

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
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Exam Sections");
		lblExamSections.setBounds(18, 6, 91, 16);
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
		
		JButton btnEncapsulation = new JButton("Encapsulation");
		btnEncapsulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.encapsulationQuestions q = new AP_Exam.encapsulationQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			} 
		}); 
		
		btnEncapsulation.setBounds(609, 320, 110, 20);
		contentPane.add(btnEncapsulation);
		
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
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(18, 376, 61, 16);
		contentPane.add(lblAnswer);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(74, 376, 363, 39);
		contentPane.add(scrollPane_2);
		scrollPane_2.setViewportView(testQuestionAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		
		JButton btnLucyandcynthia = new JButton("Code Analysis");
		btnLucyandcynthia.setForeground(new Color(0, 255, 0));
		btnLucyandcynthia.setBackground(new Color(255, 20, 147));
		btnLucyandcynthia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.CA();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnLucyandcynthia.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
		btnLucyandcynthia.setBounds(453, 21, 188, 39);
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
		btnMVC.setBounds(453, 73, 138, 29);
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
		btnNewButton.setBounds(453, 157, 120, 39);
		contentPane.add(btnNewButton);
	
		JButton btnAnthonyjude = new JButton("BooleanQuestions");
		btnAnthonyjude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.BooleanQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnAnthonyjude.setBounds(604, 226, 117, 29);
		contentPane.add(btnAnthonyjude);

		JButton Power = new JButton("Power");
		Power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.Power();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		Power.setBounds(453, 209, 138, 29);
		contentPane.add(Power);
	
		JButton btnArraylist = new JButton("ArrayList");
		btnArraylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question a = new AP_Exam.ArrayListQuestions();
				testQuestion.setText(a.getQuestion());
				testChoices.setText(a.getChoices());
				testQuestionAnswer.setText(a.getAnswer());
			}
		});
		btnArraylist.setBounds(453, 115, 138, 29);
		contentPane.add(btnArraylist);
		
		JButton btnTeamboba = new JButton("\u2727\uFF65\uFF9F: *\u2727\uFF65\uFF9F:* Team Boba *:\uFF65\uFF9F\u2727*:\uFF65\uFF9F\u2727");
		btnTeamboba.setForeground(Color.RED);
		btnTeamboba.setBackground(new Color(255, 255, 0));
		btnTeamboba.setFont(new Font("Papyrus", Font.BOLD, 16));
		btnTeamboba.setBounds(453, 264, 279, 39);
		contentPane.add(btnTeamboba);
		btnTeamboba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.BobaQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		
		
		JButton btnBackground = new JButton("Background Info");
		btnBackground.setFont(new Font("Lucida Grande", Font.BOLD, 12));
		btnBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.BackgroundInfoQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnBackground.setBounds(603, 73, 138, 29);
		contentPane.add(btnBackground);
		
		JButton btnPowandsqrt = new JButton("PowAndSqrt");
		btnPowandsqrt.setBounds(603, 191, 138, 29);
		contentPane.add(btnPowandsqrt);
		btnPowandsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.PowSqrt();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});


		JButton btnNewButton_1 = new JButton("Declarations");
		btnNewButton_1.setBounds(604, 116, 137, 28);
		contentPane.add(btnNewButton_1);
		
		//Anika and Aashi's arraylist questions
		JButton btnArraylist_2 = new JButton(" ArrayList 2");
		btnArraylist_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AP_Exam.Question q = new AP_Exam.ListQuestions2();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnArraylist_2.setBounds(453, 316, 138, 29);
		contentPane.add(btnArraylist_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 62, 418, 204);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(testQuestion);
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(16, 278, 418, 86);
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(testChoices);
		
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);
		
		JButton btnPolymorphism = new JButton("Polymorphism");
		btnPolymorphism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AP_Exam.Question q = new AP_Exam.PolymorphismQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnPolymorphism.setBounds(604, 157, 137, 28);
		contentPane.add(btnPolymorphism);

	}
}
