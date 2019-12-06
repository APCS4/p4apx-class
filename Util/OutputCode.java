package Util;

import javax.swing.JOptionPane;
import javax.swing.*;

public class OutputCode {
    public static void codeOutput() {
    	JFrame frame = new JFrame();//new JFrame to show all the code we need to
        String code = GetCodeV2.codeGetV2();
        //JOptionPane.showMessageDialog(null, code, "Code", JOptionPane.INFORMATION_MESSAGE);    
        JTextArea textArea = new JTextArea(100, 100); //textarea to put code into
        textArea.setText(code);
        textArea.setEditable(false);
        
        // wrap a scrollpane around it
        JScrollPane scrollPane = new JScrollPane(textArea);//making the text area scrollable cause there's a lot of code
        
        // display them in a message dialog
        JOptionPane.showMessageDialog(frame, scrollPane); //now use the JOptionPane to show it all together
    }
}