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
	private void initialize() 
	{
		timer = new Timer(20, this);
        timer.start();
        
        image2 = new ImageIcon(getClass().getResource("review UI/background.png"));
		
		JPanel main_panel = new JPanel();
		main_panel.setOpaque(false);
		main_panel.setBounds(150, 76, 950, 530);
		getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JButton recursion = new JButton("");
		recursion.setBounds(0, 0, 400, 50);
		main_panel.add(recursion);
		//recursion.setAction(action);
		recursion.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton math = new JButton("");
		math.setBounds(0, 60, 400, 50);
		main_panel.add(math);
		//math.setAction(action_1);
		math.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton binary = new JButton("");
		binary.setBounds(0, 120, 400, 50);
		main_panel.add(binary);
		binary.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton d_type = new JButton("");
		d_type.setBounds(0, 180, 400, 50);
		main_panel.add(d_type);
		d_type.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton code_anal = new JButton("");
		code_anal.setBounds(0, 240, 400, 50);
		main_panel.add(code_anal);
		code_anal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton polymorph = new JButton("");
		polymorph.setBounds(0, 300, 400, 50);
		main_panel.add(polymorph);
		polymorph.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton mvc = new JButton("");
		mvc.setBounds(0, 360, 400, 50);
		main_panel.add(mvc);
		mvc.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton array1 = new JButton("");
		array1.setBounds(0, 420, 400, 50);
		main_panel.add(array1);
		array1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton backgroun = new JButton("");
		backgroun.setBounds(0, 480, 400, 50);
		main_panel.add(backgroun);
		backgroun.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
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
		
		JButton daniel = new JButton("");
		daniel.setBounds(550, 0, 400, 50);
		main_panel.add(daniel);
		daniel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		daniel.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				daniel.setIcon(new ImageIcon("review UI/dan2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				daniel.setIcon(new ImageIcon("review UI/dan1.jpg"));
			}
		});
		daniel.setBorder(null);
		daniel.setIcon(new ImageIcon("review UI/dan1.jpg"));
		
		JButton polymorphism = new JButton("");
		polymorphism.setBounds(550, 60, 400, 50);
		main_panel.add(polymorphism);
		polymorphism.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		polymorphism.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				polymorphism.setIcon(new ImageIcon("review UI/polym2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				polymorphism.setIcon(new ImageIcon("review UI/polym1.jpg"));
			}
		});
		polymorphism.setBorder(null);
		polymorphism.setIcon(new ImageIcon("review UI/polym1.jpg"));
		
		JButton powandsqrt = new JButton("");
		powandsqrt.setBounds(550, 120, 400, 50);
		main_panel.add(powandsqrt);
		powandsqrt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		powandsqrt.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				powandsqrt.setIcon(new ImageIcon("review UI/powsq2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				powandsqrt.setIcon(new ImageIcon("review UI/powsq1.jpg"));
			}
		});
		powandsqrt.setBorder(null);
		powandsqrt.setIcon(new ImageIcon("review UI/powsq1.jpg"));
		
		JButton power = new JButton("");
		power.setBounds(550, 180, 400, 50);
		main_panel.add(power);
		power.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		power.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				power.setIcon(new ImageIcon("review UI/pow2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				power.setIcon(new ImageIcon("review UI/pow1.jpg"));
			}
		});
		power.setBorder(null);
		power.setIcon(new ImageIcon("review UI/pow1.jpg"));
		
		JButton forquest = new JButton("");
		forquest.setBounds(550, 240, 400, 50);
		main_panel.add(forquest);
		forquest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		forquest.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				forquest.setIcon(new ImageIcon("review UI/forl2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				forquest.setIcon(new ImageIcon("review UI/forl1.jpg"));
			}
		});
		forquest.setBorder(null);
		forquest.setIcon(new ImageIcon("review UI/forl1.jpg"));
		
		JButton boolquest = new JButton("");
		boolquest.setBounds(550, 300, 400, 50);
		main_panel.add(boolquest);
		boolquest.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		boolquest.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				boolquest.setIcon(new ImageIcon("review UI/boolq2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				boolquest.setIcon(new ImageIcon("review UI/boolq1.jpg"));
			}
		});
		boolquest.setBorder(null);
		boolquest.setIcon(new ImageIcon("review UI/boolq1.jpg"));
		
		JButton arrayl2 = new JButton("");
		arrayl2.setBounds(550, 360, 400, 50);
		main_panel.add(arrayl2);
		arrayl2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		arrayl2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				arrayl2.setIcon(new ImageIcon("review UI/arrayl2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				arrayl2.setIcon(new ImageIcon("review UI/arrayl1.jpg"));
			}
		});
		arrayl2.setBorder(null);
		arrayl2.setIcon(new ImageIcon("review UI/arrayl1.jpg"));
		
		JButton encapsu = new JButton("");
		encapsu.setBounds(550, 420, 400, 50);
		main_panel.add(encapsu);
		encapsu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		encapsu.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				encapsu.setIcon(new ImageIcon("review UI/encap2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				encapsu.setIcon(new ImageIcon("review UI/encap1.jpg"));
			}
		});
		encapsu.setBorder(null);
		encapsu.setIcon(new ImageIcon("review UI/encap1.jpg"));
		
		JButton review = new JButton("");
		review.setBounds(550, 480, 400, 50);
		main_panel.add(review);
		review.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				main_panel.setVisible(false);
			}
		});
		review.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				review.setIcon(new ImageIcon("review UI/revqu2.jpg"));
			}
			public void mouseExited(MouseEvent e) 
			{
				review.setIcon(new ImageIcon("review UI/revqu1.jpg"));
			}
		});
		review.setBorder(null);
		review.setIcon(new ImageIcon("review UI/revqu1.jpg"));
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}