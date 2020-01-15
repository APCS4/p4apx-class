import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TestModeUI extends MenuControl {
	public TestModeUI()
	{
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 1280, 720);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AP Computer Science Exam");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 1268, 16);
		getContentPane().add(lblNewLabel);
		
		
	}
}
