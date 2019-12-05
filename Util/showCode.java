package Util;
import javax.swing.JOptionPane;

import Util.*;

public class showCode {
    public static void codeShow() {
        String code = getCode.codeGet();
        JOptionPane.showMessageDialog(null, code, "Code", JOptionPane.INFORMATION_MESSAGE);       
    }
}