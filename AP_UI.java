
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
import javax.swing.JScrollBar;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

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
		setBounds(100, 100, 784, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Exam Sections");
		lblExamSections.setForeground(new Color(102, 0, 204));
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
		btnMath.setBounds(18, 24, 91, 29);
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
		JButton Power = new JButton("Power");
		Power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.Power();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});

		Power.setBounds(446, 281, 138, 29);
		contentPane.add(Power);
		
		
		
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
		
		
		
		
		JButton btnConsole = new JButton("C");
		btnConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Console.main();
			}
		});
		btnConsole.setForeground(new Color(102, 0, 204));
		btnConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		btnConsole.setBackground(Color.LIGHT_GRAY);
		btnConsole.setBounds(406, 21, 21, 18);
		contentPane.add(btnConsole);
		testQuestion.setForeground(new Color(0, 102, 255));
		testQuestion.setBackground(new Color(204, 255, 255));

		
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		testQuestion.setBounds(18, 55, 418, 177);
		contentPane.add(testQuestion);
		testChoices.setForeground(new Color(0, 102, 255));
		testChoices.setBackground(new Color(204, 255, 255));
	    
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);
		testChoices.setBounds(18, 244, 418, 98);
		contentPane.add(testChoices);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setForeground(new Color(102, 0, 204));
		lblAnswer.setBounds(18, 354, 61, 16);
		contentPane.add(lblAnswer);
		testQuestionAnswer.setForeground(new Color(0, 102, 255));
		testQuestionAnswer.setBackground(new Color(204, 255, 255));
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		testQuestionAnswer.setBounds(79, 354, 357, 72);
		contentPane.add(testQuestionAnswer);
		
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
		btnLucyandcynthia.setBounds(451, 50, 198, 39);
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

		btnMVC.setBounds(446, 102, 138, 29);
		contentPane.add(btnMVC);
		

		JButton btnNewButton = new JButton("DanielAndFox");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(448, 171, 120, 39);
		contentPane.add(btnNewButton);

		
		JButton btnAnthonyjude = new JButton("BooleanQuestions");
		btnAnthonyjude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnthonyjude.setBounds(596, 101, 117, 29);
		contentPane.add(btnAnthonyjude);


		//JButton btnArraylist = new JButton("ArrayList");
		//btnArraylist.setBounds(461, 101, 138, 29);
		//contentPane.add(btnArraylist);
		
		////JButton btnTeamboba = new JButton("TeamBoba");
		//btnTeamboba.setBounds(461, 223, 117, 29);
		//contentPane.add(btnTeamboba);

	
		

		JButton btnArraylist = new JButton("ArrayList");
		btnArraylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AP_Exam.Question q = new AP_Exam.ArrayListQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnArraylist.setBounds(446, 130, 138, 29);
		contentPane.add(btnArraylist);
	
		JButton btnTeamboba = new JButton("✧･ﾟ: *✧･ﾟ:* Team Boba *:･ﾟ✧*:･ﾟ✧");
		btnTeamboba.setForeground(Color.RED);
		btnTeamboba.setBackground(Color.CYAN);
		btnTeamboba.setFont(new Font("Snell Roundhand", Font.BOLD, 16));
		btnTeamboba.setBounds(448, 230, 279, 39);
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
		btnBackground.setBounds(596, 130, 138, 29);
		contentPane.add(btnBackground);
		
		JButton btnNewButton_1 = new JButton("declarations");
		btnNewButton_1.setBounds(596, 165, 117, 51);
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
		btnArraylist_2.setBounds(446, 313, 138, 29);
		contentPane.add(btnArraylist_2);


		
		
		
		//abcdefghij
		//JButton btnArraylist = new JButton("ArrayList");
		//btnArraylist.setBounds(461, 101, 138, 29);
		//contentPane.add(btnArraylist);
	}
}
