import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class AP_UIv2_2 extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JLabel background;
	private ImageIcon image2;
    
	public static void main() 
	{
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					AP_UIv2_2 frame = new AP_UIv2_2();
					frame.setVisible(true);//o
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
	public AP_UIv2_2() 
	{
		setResizable(false);
		menu();
		setBounds(100, 100, 1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		
		JTextArea question = new JTextArea();
		question.setOpaque(true);
		question.setBounds(75, 75, 550, 425);
		
		JTextArea answers = new JTextArea();
		answers.setOpaque(true);
		answers.setBounds(650, 75, 550, 425);
		
		JButton back = new JButton("");
		back.setBounds(500, 500, 400, 50);
		back.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				back.setIcon(new ImageIcon("review UI/button2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				back.setIcon(new ImageIcon("review UI/button1.jpg"));
			}
		});
		back.setBorder(null);
		back.setIcon(new ImageIcon("review UI/button1.jpg"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
