
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreReport extends testModeCaller {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
    private JTextField textField;
    private JTextField textField_1;
    
    
    public ScoreReport()
    {
    	
    	JLabel lblYourScore = new JLabel("Your Score: ");
    	lblYourScore.setBounds(464, 22, 93, 27);
    	getContentPane().add(lblYourScore);
    	
    	textField = new JTextField();
    	textField.setBounds(287, 17, 130, 32);
    	getContentPane().add(textField);
    	textField.setColumns(10);
    	
    	JLabel lblPercentage = new JLabel("Percentage: ");
    	lblPercentage.setBounds(464, 93, 76, 16);
    	getContentPane().add(lblPercentage);
    	
    	textField_1 = new JTextField();
    	textField_1.setBounds(542, 82, 130, 32);
    	getContentPane().add(textField_1);
    	textField_1.setColumns(10);
    	
    	
    }
}
