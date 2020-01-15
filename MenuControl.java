import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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
					MenuControl frame = new MenuControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuControl() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// JLabel with image 
		JLabel pic = new JLabel("");        
        java.awt.Image image = new ImageIcon("Untitled drawing-3.png").getImage();
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(300, 100, 10, 10);
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(new Color(181, 224, 255));
        content.add(pic);
        
        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
        
		JMenu mnHone = new JMenu("Home");
		menuBar.add(mnHone);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnHone.add(mntmPreferences);
		
		JMenu mnApTest = new JMenu("AP Test");
		menuBar.add(mnApTest);
		
		JMenuItem mntmApReview = new JMenuItem("Review");
		mntmApReview.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AP_UI frame = new AP_UI();
				frame.setVisible(true);//o
			}
		});
		mnApTest.add(mntmApReview);
		JMenuItem mntmApRev2 = new JMenuItem("Review v2");
		mntmApRev2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AP_UIv2 frame = new AP_UIv2();
				frame.setVisible(true);
			}
		});
		mnApTest.add(mntmApRev2);
		
		JMenu mnTestMode = new JMenu("Test Mode");
		mnApTest.add(mnTestMode);
		
		JMenuItem mntmTakeTest = new JMenuItem("Take Test ");
		mntmTakeTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				testModeCaller frame = new testModeCaller();
				frame.setVisible(true);
			}
		});
		mnTestMode.add(mntmTakeTest);
		
		JMenuItem mntmTakeTestVersion = new JMenuItem("Take Test Version 2");
		mntmTakeTestVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestModeUI frame = new TestModeUI();
				frame.setVisible(true);
				
			}
		});
		mnTestMode.add(mntmTakeTestVersion);
		
		JMenu mnIntro = new JMenu("Intro");
		menuBar.add(mnIntro);
		
		JMenuItem mntmOriginal = new JMenuItem("Jumpers");
		mnIntro.add(mntmOriginal);
		
		JMenuItem mntmInputs = new JMenuItem("Pythagorean");
		mnIntro.add(mntmInputs);
		
		JMenu mnLabs = new JMenu("Labs");
		menuBar.add(mnLabs);
		
		JMenuItem mntmShorthand = new JMenuItem("Shorthand");
		mnLabs.add(mntmShorthand);
		
		JMenuItem mntmPalindrom = new JMenuItem("Palindrom 3");
		mntmPalindrom.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				PalindromeUI frame = new PalindromeUI();
				frame.setVisible(true);			
			}
		});
		mnLabs.add(mntmPalindrom);
		
		JMenu mnJig = new JMenu("Jigsaw");
		menuBar.add(mnJig);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Calculator frame = new Calculator();
				frame.setVisible(true);		
			}
		});
		mnJig.add(mntmCalculator);
		
		JMenuItem mntmMethodSearch = new JMenuItem("Method Search");
		mntmMethodSearch.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MethodSearchUI frame = new MethodSearchUI();
				frame.setVisible(true);
			}
		});
		mnJig.add(mntmMethodSearch);
		
		
	}
	
}
