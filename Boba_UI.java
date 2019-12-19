
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.prism.Image;

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

public class Boba_UI extends MenuControl 
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
	public Boba_UI() {
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
		
		
		JButton btnTeamboba = new JButton("\u2727\uFF65\uFF9F: *\u2727\uFF65\uFF9F:* Team Boba *:\uFF65\uFF9F\u2727*:\uFF65\uFF9F\u2727");
		btnTeamboba.setForeground(Color.RED);
		btnTeamboba.setBackground(new Color(255, 255, 0));
		btnTeamboba.setFont(new Font("Papyrus", Font.BOLD, 16));
		btnTeamboba.setBounds(446, 78, 279, 39);
		contentPane.add(btnTeamboba);
		btnTeamboba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Exam.Question q = new AP_Exam.BobaQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		
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
		

		
		JButton MAIN = new JButton("Review Questions");
		MAIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int question = rand.nextInt(14); 
				
				switch(question)
				{
				case 0: 
				AP_Exam.Question a = new AP_Exam.MathQuestions();
				testQuestion.setText(a.getQuestion());
				testChoices.setText(a.getChoices()); 
				testQuestionAnswer.setText(a.getAnswer());
				break; 
				
				case 1: 
					AP_Exam.encapsulationQuestions b = new AP_Exam.encapsulationQuestions();
					testQuestion.setText(b.getQuestion());
					testChoices.setText(b.getChoices());
					testQuestionAnswer.setText(b.getAnswer());
					break;
					
				case 2: 
					AP_Exam.Question c = new AP_Exam.DataTypeQuestions();
					testQuestion.setText(c.getQuestion());
					testChoices.setText(c.getChoices());
					testQuestionAnswer.setText(c.getAnswer());
					break; 
					
			 
				case 3: 
					AP_Exam.Question d = new AP_Exam.BinaryMathQuestions();
					testQuestion.setText(d.getQuestion());
					testChoices.setText(d.getChoices());
					testQuestionAnswer.setText(d.getAnswer());
					break;
					
				case 4: 
					AP_Exam.Question x = new AP_Exam.CA();
					testQuestion.setText(x.getQuestion());
					testChoices.setText(x.getChoices());
					testQuestionAnswer.setText(x.getAnswer());
					break; 
					
				case 5: 
					AP_Exam.Question f = new AP_Exam.MVCQuestion();
					testQuestion.setText(f.getQuestion());
					testChoices.setText(f.getChoices());
					testQuestionAnswer.setText(f.getAnswer());
					break; 
					
				case 6: 
					AP_Exam.Question g = new AP_Exam.OperatorQuestions();
					testQuestion.setText(g.getQuestion());
					testChoices.setText(g.getChoices());
					testQuestionAnswer.setText(g.getAnswer());
					break;
				
					
				case 7:
					AP_Exam.Question k = new AP_Exam.ArrayListQuestions();
					testQuestion.setText(k.getQuestion());
					testChoices.setText(k.getChoices());
					testQuestionAnswer.setText(k.getAnswer());
					break; 
				
			
				
				case 8: 
					AP_Exam.Question m = new AP_Exam.BackgroundInfoQuestions();
					testQuestion.setText(m.getQuestion());
					testChoices.setText(m.getChoices());
					testQuestionAnswer.setText(m.getAnswer());
					break; 
				
				case 9: 
					AP_Exam.Question n = new AP_Exam.PowSqrt();
					testQuestion.setText(n.getQuestion());
					testChoices.setText(n.getChoices());
					testQuestionAnswer.setText(n.getAnswer());
					break; 
				
				case 10: 
					AP_Exam.Question o = new AP_Exam.Recursion();
					testQuestion.setText(o.getQuestion());
					testChoices.setText(o.getChoices());
					testQuestionAnswer.setText(o.getAnswer());
					break; 
				
				case 11: 
					AP_Exam.Question p = new AP_Exam.ListQuestions2();
					testQuestion.setText(p.getQuestion());
					testChoices.setText(p.getChoices());
					testQuestionAnswer.setText(p.getAnswer());
					break; 
				
				case 12: 
					AP_Exam.Question q = new AP_Exam.PolymorphismQuestions();
					testQuestion.setText(q.getQuestion());
					testChoices.setText(q.getChoices());
					testQuestionAnswer.setText(q.getAnswer());
					break; 
					
				case 13: 
					AP_Exam.Question r = new AP_Exam.Polymorph();
					testQuestion.setText(r.getQuestion());
					testChoices.setText(r.getChoices());
					testQuestionAnswer.setText(r.getAnswer());
					break; 
			}
				
				
			}
			
		});
		MAIN.setBounds(640, 371, 138, 29);
		contentPane.add(MAIN);

	}
}
