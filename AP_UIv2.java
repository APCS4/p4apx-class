
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AP_UIv2 extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel background;
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
	public AP_UIv2() 
	{
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		timer = new Timer(20, this);
        timer.start();
        
        image2 = new ImageIcon(getClass().getResource("review UI/background.png"));
        
		setBounds(100, 100, 1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton recursion = new JButton("");
		//recursion.setAction(action);
		recursion.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		recursion.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				recursion.setIcon(new ImageIcon("review UI/recursion2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				recursion.setIcon(new ImageIcon("review UI/recursion1.jpg"));
			}
		});
		recursion.setBorder(null);
		recursion.setIcon(new ImageIcon("review UI/recursion1.jpg"));
		recursion.setBounds(70, 40, 400, 50);
		getContentPane().add(recursion);
		
		JButton math = new JButton("");
		//math.setAction(action_1);
		math.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		math.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				math.setIcon(new ImageIcon("review UI/math2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				math.setIcon(new ImageIcon("review UI/math1.jpg"));
			}
		});
		math.setBorder(null);
		math.setIcon(new ImageIcon("review UI/math1.jpg"));
		math.setBounds(70, 100, 400, 50);
		getContentPane().add(math);
		
		JButton binary = new JButton("");
		binary.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		binary.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				binary.setIcon(new ImageIcon("review UI/binary2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				binary.setIcon(new ImageIcon("review UI/binary1.jpg"));
			}
		});
		binary.setBorder(null);
		binary.setIcon(new ImageIcon("review UI/binary1.jpg"));
		binary.setBounds(70, 160, 400, 50);
		getContentPane().add(binary);
		
		JButton d_type = new JButton("");
		d_type.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		d_type.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				d_type.setIcon(new ImageIcon("review UI/data2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				d_type.setIcon(new ImageIcon("review UI/data1.jpg"));
			}
		});
		d_type.setBorder(null);
		d_type.setIcon(new ImageIcon("review UI/data1.jpg"));
		d_type.setBounds(70, 220, 400, 50);
		getContentPane().add(d_type);
		
		JButton code_anal = new JButton("");
		code_anal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		code_anal.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				code_anal.setIcon(new ImageIcon("review UI/code2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				code_anal.setIcon(new ImageIcon("review UI/code1.jpg"));
			}
		});
		code_anal.setBorder(null);
		code_anal.setIcon(new ImageIcon("review UI/code1.jpg"));
		code_anal.setBounds(70, 280, 400, 50);
		getContentPane().add(code_anal);
		
		JButton polymorph = new JButton("");
		polymorph.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		polymorph.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				polymorph.setIcon(new ImageIcon("review UI/poly2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				polymorph.setIcon(new ImageIcon("review UI/poly1.jpg"));
			}
		});
		polymorph.setBorder(null);
		polymorph.setIcon(new ImageIcon("review UI/poly1.jpg"));
		polymorph.setBounds(70, 340, 400, 50);
		getContentPane().add(polymorph);
		
		JButton mvc = new JButton("");
		mvc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		mvc.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				mvc.setIcon(new ImageIcon("review UI/mvc2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				mvc.setIcon(new ImageIcon("review UI/mvc1.jpg"));
			}
		});
		mvc.setBorder(null);
		mvc.setIcon(new ImageIcon("review UI/mvc1.jpg"));
		mvc.setBounds(70, 400, 400, 50);
		getContentPane().add(mvc);
		
		JButton array1 = new JButton("");
		array1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		array1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				array1.setIcon(new ImageIcon("review UI/arra2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				array1.setIcon(new ImageIcon("review UI/arra1.jpg"));
			}
		});
		array1.setBorder(null);
		array1.setIcon(new ImageIcon("review UI/arra1.jpg"));
		array1.setBounds(70, 460, 400, 50);
		getContentPane().add(array1);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		JButton backgroun = new JButton("");
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

			}
		});
		backgroun.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
			}
		});
		backgroun.setBorder(null);
		backgroun.setIcon(new ImageIcon("review UI/back1.jpg"));
		backgroun.setBounds(70, 520, 400, 50);
		getContentPane().add(backgroun);
		
		//background picture
		background = new JLabel("");
		background.setIcon(image2);
		background.setBounds(0, 0, 1280, 700);
		getContentPane().add(background);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


