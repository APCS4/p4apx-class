import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

public class TestModeUI extends MenuControl {
	private JTable table;
	public TestModeUI()
	{
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 1280, 720);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AP Computer Science Exam");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 1268, 16);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 34, 992, 636);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel questLabel = new JLabel("Questions");
		questLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		questLabel.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(questLabel);
		
		table = new JTable();
		table.setBounds(1038, 253, 165, -197);
		getContentPane().add(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(1010, 68, 253, 34);
		getContentPane().add(panel);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		panel.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		panel.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		panel.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		panel.add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		panel.add(rdbtnE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1010, 114, 253, 34);
		getContentPane().add(panel_1);
		
		JRadioButton radioButton = new JRadioButton("A");
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("B");
		panel_1.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("C");
		panel_1.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("D");
		panel_1.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("E");
		panel_1.add(radioButton_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(1038, 174, 206, 172);
		getContentPane().add(scrollPane_1);
		
		
	}
}
