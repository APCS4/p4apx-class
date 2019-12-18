
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

public class testModeCaller extends MenuControl{
	public testModeCaller() {
		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
	    private JTextArea testQuestion = new JTextArea();
	    private JTextArea testChoices = new JTextArea();
	    private JTextArea testQuestionAnswer = new JTextArea();
		
		/**
		 * Create the frame.
		 */			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 784, 488);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(220, 220, 220));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			JLabel lblExamSections = new JLabel("AP Exam Test Mode");
			lblExamSections.setBounds(18, 6, 264, 16);
			contentPane.add(lblExamSections);
			
			JLabel lblAnswer = new JLabel("Answer");
			lblAnswer.setBounds(18, 376, 61, 16);
			contentPane.add(lblAnswer);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(74, 376, 363, 39);
			contentPane.add(scrollPane_2);
			scrollPane_2.setViewportView(testQuestionAnswer);
			
			testQuestionAnswer.setEditable(false);
			testQuestionAnswer.setLineWrap(true);


			JButton btnNewButton_1 = new JButton(""); //the button
			btnNewButton_1.setBorder(null);
			btnNewButton_1.setIcon(new ImageIcon("recursion-button.jpg"));
			btnNewButton_1.setBounds(453, 351, 175, 61);
			btnNewButton_1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					AP_Exam.Question q = new AP_Exam.Recursion();
					testQuestion.setText(q.getQuestion());
					testChoices.setText(q.getChoices());
					testQuestionAnswer.setText(q.getAnswer());
				}
			});
			contentPane.add(btnNewButton_1);
			
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
			
			JButton btnNewButton_2 = new JButton("Polymorph");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AP_Exam.Question q = new AP_Exam.Polymorph();
					testQuestion.setText(q.getQuestion());
					testChoices.setText(q.getChoices());
					testQuestionAnswer.setText(q.getAnswer());
				}
			});
	}
	
	
	
	

}
