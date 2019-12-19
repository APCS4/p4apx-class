import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class AP_UIv2 extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
	private ImageIcon image1;
	private ImageIcon image2;
    private Timer timer;

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
					AP_UIv2 frame = new AP_UIv2();
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
	public AP_UIv2() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		timer = new Timer(20, this);
        timer.start();
        
        image1 = new ImageIcon(getClass().getResource("review UI/mojang.jpg"));
        image2 = new ImageIcon(getClass().getResource("review UI/background.png"));
        
		setBounds(100, 100, 1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//background picture
		background = new JLabel("");
		background.setIcon(image2);
		background.setBounds(0, 0, 1264, 681);
		getContentPane().add(background);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				File audios = new File("review UI/click.wav");
				PlaySound(audios);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnNewButton.setIcon(new ImageIcon("review UI/buttonhover.png"));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnNewButton.setIcon(new ImageIcon("review UI/button.png"));
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("review UI/button.png"));
		btnNewButton.setBounds(116, 89, 400, 50);
		getContentPane().add(btnNewButton);
	}

	static void PlaySound(File audio) 
	{
		try
		{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(audio));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/10000);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

