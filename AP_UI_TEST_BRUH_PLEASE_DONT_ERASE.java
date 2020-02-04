import java.awt.*;
import javax.swing.*;

import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;

public class AP_UI_TEST_BRUH_PLEASE_DONT_ERASE extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
	private ImageIcon image2;
    private Timer timer;
    private int pausedOnFrame = 0;
    private JPanel quest_panel = new JPanel();
    private JTextField txtQuest;
    private JTextField txtAns;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					AP_UI_TEST_BRUH_PLEASE_DONT_ERASE frame = new AP_UI_TEST_BRUH_PLEASE_DONT_ERASE();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AP_UI_TEST_BRUH_PLEASE_DONT_ERASE() 
	{
		//playsong("review UI/sweden.mp3");
		setResizable(false);
		menu();
		setBounds(100, 100, 1280, 720);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//background picture
		background = new JLabel("");
		background.setBorder(null);
		background.setIcon(image2);
		background.setBounds(0, 0, 1280, 700);
		getContentPane().add(background);
	    
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void menu() 
	{
        image2 = new ImageIcon(getClass().getResource("review UI/background.png"));
		
        quest_panel.setOpaque(false);
        quest_panel.setBounds(0, 0, 1280, 720);//f
		getContentPane().add(quest_panel);
		quest_panel.setLayout(null);
		
		JScrollPane quest_scroll = new JScrollPane();
		quest_scroll.setBorder(null);
		quest_scroll.setBounds(10, 60, 610, 300);
		quest_panel.add(quest_scroll);
		quest_scroll.getViewport().setOpaque(false);
		quest_scroll.setOpaque(false);
		quest_scroll.setBackground(new Color(0, 0, 0, 80));
		
		JTextArea question = new JTextArea();
		question.setBorder(null);
		question.setEditable(false);
		quest_scroll.setViewportView(question);
		question.setBackground(new Color(0, 0, 0, 80));
		
		JScrollPane ans_scroll = new JScrollPane();
		ans_scroll.setBorder(null);
		ans_scroll.setBounds(650, 60, 610, 300);
		quest_panel.add(ans_scroll);
		ans_scroll.getViewport().setOpaque(false);
		ans_scroll.setOpaque(false);
		ans_scroll.setBackground(new Color(0, 0, 0, 80));
		
		JTextArea answers = new JTextArea();
		answers.setBorder(null);
		answers.setEditable(false);
		ans_scroll.setViewportView(answers);
		answers.setBackground(new Color(0, 0, 0, 80));
		
		JRadioButton rdbtnA = new JRadioButton("");
		rdbtnA.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnA.setForeground(Color.WHITE);
		rdbtnA.setIcon(new ImageIcon("review UI\\orb nona.png"));
		rdbtnA.setBounds(450, 350, 100, 100);
		rdbtnA.setBackground(new Color(0, 0, 0, 0));
		quest_panel.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnB.setForeground(Color.WHITE);
		rdbtnB.setIcon(new ImageIcon("review UI\\orb nonb.png"));
		rdbtnB.setBounds(550, 350, 100, 100);
		rdbtnB.setBackground(new Color(0, 0, 0));
		quest_panel.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnC.setForeground(Color.WHITE);
		rdbtnC.setIcon(new ImageIcon("review UI\\orb nonc.png"));
		rdbtnC.setBounds(650, 350, 100, 100);
		rdbtnC.setBackground(new Color(0, 0, 0));
		quest_panel.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setFont(new Font("Tahoma", Font.BOLD, 25));
		rdbtnD.setForeground(Color.WHITE);
		rdbtnD.setIcon(new ImageIcon("review UI\\orb nond.png"));
		rdbtnD.setBounds(750, 350, 100, 100);
		rdbtnD.setBackground(new Color(0, 0, 0));
		quest_panel.add(rdbtnD);
		
		ButtonGroup abcd = new ButtonGroup();
		abcd.add(rdbtnA);
		abcd.add(rdbtnB);
		abcd.add(rdbtnC);
		abcd.add(rdbtnD);
		
		txtQuest = new JTextField();
		txtQuest.setEditable(false);
		txtQuest.setForeground(Color.WHITE);
		txtQuest.setBorder(null);
		txtQuest.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtQuest.setText("Question:");
		txtQuest.setBounds(10, 23, 175, 37);
		txtQuest.setBackground(new Color(0, 0, 0, 0));
		quest_panel.add(txtQuest);
		txtQuest.setColumns(10);
		
		txtAns = new JTextField();
		txtAns.setEditable(false);
		txtAns.setForeground(Color.WHITE);
		txtAns.setBorder(null);
		txtAns.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtAns.setText("Answers:");
		txtAns.setBounds(650, 23, 175, 37);
		txtAns.setBackground(new Color(0, 0, 0, 0));
		quest_panel.add(txtAns);
		txtAns.setColumns(10);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}