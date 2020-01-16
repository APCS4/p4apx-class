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
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.SystemColor;
import javax.swing.UIManager;

public class TestModeUI extends MenuControl {
	private JTable table;
	public TestModeUI()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setBounds(0, 0, 1440, 825);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AP EXAM: Test Mode");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 1428, 16);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 34, 878, 747);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setAutoscrolls(true);
		panel_2.setBounds(896, 57, 263, 724);
		getContentPane().add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1);
		
		JLabel label = new JLabel("1.");
		panel_1.add(label);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		JLabel label_2 = new JLabel("2.");
		panel_3.add(label_2);
		
		JRadioButton radioButton_5 = new JRadioButton("A");
		panel_3.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("B");
		panel_3.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("C");
		panel_3.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("D");
		panel_3.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("E");
		panel_3.add(radioButton_9);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		JLabel label_3 = new JLabel("3.");
		panel_4.add(label_3);
		
		JRadioButton radioButton_10 = new JRadioButton("A");
		panel_4.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("B");
		panel_4.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("C");
		panel_4.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("D");
		panel_4.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("E");
		panel_4.add(radioButton_14);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		JLabel label_4 = new JLabel("4.");
		panel_5.add(label_4);
		
		JRadioButton radioButton_15 = new JRadioButton("A");
		panel_5.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("B");
		panel_5.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("C");
		panel_5.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("D");
		panel_5.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("E");
		panel_5.add(radioButton_19);
		
		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		
		JLabel label_8 = new JLabel("5.");
		panel_9.add(label_8);
		
		JRadioButton radioButton_35 = new JRadioButton("A");
		panel_9.add(radioButton_35);
		
		JRadioButton radioButton_36 = new JRadioButton("B");
		panel_9.add(radioButton_36);
		
		JRadioButton radioButton_37 = new JRadioButton("C");
		panel_9.add(radioButton_37);
		
		JRadioButton radioButton_38 = new JRadioButton("D");
		panel_9.add(radioButton_38);
		
		JRadioButton radioButton_39 = new JRadioButton("E");
		panel_9.add(radioButton_39);
		
		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10);
		
		JLabel label_9 = new JLabel("6.");
		panel_10.add(label_9);
		
		JRadioButton radioButton_40 = new JRadioButton("A");
		panel_10.add(radioButton_40);
		
		JRadioButton radioButton_41 = new JRadioButton("B");
		panel_10.add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton("C");
		panel_10.add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton("D");
		panel_10.add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton("E");
		panel_10.add(radioButton_44);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		
		JLabel label_7 = new JLabel("7.");
		panel_8.add(label_7);
		
		JRadioButton radioButton_30 = new JRadioButton("A");
		panel_8.add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton("B");
		panel_8.add(radioButton_31);
		
		JRadioButton radioButton_32 = new JRadioButton("C");
		panel_8.add(radioButton_32);
		
		JRadioButton radioButton_33 = new JRadioButton("D");
		panel_8.add(radioButton_33);
		
		JRadioButton radioButton_34 = new JRadioButton("E");
		panel_8.add(radioButton_34);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);
		
		JLabel label_6 = new JLabel("8.");
		panel_7.add(label_6);
		
		JRadioButton radioButton_25 = new JRadioButton("A");
		panel_7.add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton("B");
		panel_7.add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton("C");
		panel_7.add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton("D");
		panel_7.add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton("E");
		panel_7.add(radioButton_29);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		JLabel label_5 = new JLabel("9.");
		panel_6.add(label_5);
		
		JRadioButton radioButton_20 = new JRadioButton("A");
		panel_6.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("B");
		panel_6.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("C");
		panel_6.add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton("D");
		panel_6.add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton("E");
		panel_6.add(radioButton_24);
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		
		JLabel label_10 = new JLabel("10.");
		panel_11.add(label_10);
		
		JRadioButton radioButton_45 = new JRadioButton("A");
		panel_11.add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton("B");
		panel_11.add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton("C");
		panel_11.add(radioButton_47);
		
		JRadioButton radioButton_48 = new JRadioButton("D");
		panel_11.add(radioButton_48);
		
		JRadioButton radioButton_49 = new JRadioButton("E");
		panel_11.add(radioButton_49);
		
		JPanel panel_18 = new JPanel();
		panel_2.add(panel_18);
		
		JLabel label_17 = new JLabel("11.");
		panel_18.add(label_17);
		
		JRadioButton radioButton_80 = new JRadioButton("A");
		panel_18.add(radioButton_80);
		
		JRadioButton radioButton_81 = new JRadioButton("B");
		panel_18.add(radioButton_81);
		
		JRadioButton radioButton_82 = new JRadioButton("C");
		panel_18.add(radioButton_82);
		
		JRadioButton radioButton_83 = new JRadioButton("D");
		panel_18.add(radioButton_83);
		
		JRadioButton radioButton_84 = new JRadioButton("E");
		panel_18.add(radioButton_84);
		
		JPanel panel_12 = new JPanel();
		panel_2.add(panel_12);
		
		JLabel label_11 = new JLabel("12.");
		panel_12.add(label_11);
		
		JRadioButton radioButton_50 = new JRadioButton("A");
		panel_12.add(radioButton_50);
		
		JRadioButton radioButton_51 = new JRadioButton("B");
		panel_12.add(radioButton_51);
		
		JRadioButton radioButton_52 = new JRadioButton("C");
		panel_12.add(radioButton_52);
		
		JRadioButton radioButton_53 = new JRadioButton("D");
		panel_12.add(radioButton_53);
		
		JRadioButton radioButton_54 = new JRadioButton("E");
		panel_12.add(radioButton_54);
		
		JPanel panel_13 = new JPanel();
		panel_2.add(panel_13);
		
		JLabel label_12 = new JLabel("13.");
		panel_13.add(label_12);
		
		JRadioButton radioButton_55 = new JRadioButton("A");
		panel_13.add(radioButton_55);
		
		JRadioButton radioButton_56 = new JRadioButton("B");
		panel_13.add(radioButton_56);
		
		JRadioButton radioButton_57 = new JRadioButton("C");
		panel_13.add(radioButton_57);
		
		JRadioButton radioButton_58 = new JRadioButton("D");
		panel_13.add(radioButton_58);
		
		JRadioButton radioButton_59 = new JRadioButton("E");
		panel_13.add(radioButton_59);
		
		JPanel panel_14 = new JPanel();
		panel_2.add(panel_14);
		
		JLabel label_13 = new JLabel("14.");
		panel_14.add(label_13);
		
		JRadioButton radioButton_60 = new JRadioButton("A");
		panel_14.add(radioButton_60);
		
		JRadioButton radioButton_61 = new JRadioButton("B");
		panel_14.add(radioButton_61);
		
		JRadioButton radioButton_62 = new JRadioButton("C");
		panel_14.add(radioButton_62);
		
		JRadioButton radioButton_63 = new JRadioButton("D");
		panel_14.add(radioButton_63);
		
		JRadioButton radioButton_64 = new JRadioButton("E");
		panel_14.add(radioButton_64);
		
		JPanel panel_15 = new JPanel();
		panel_2.add(panel_15);
		
		JLabel label_14 = new JLabel("15.");
		panel_15.add(label_14);
		
		JRadioButton radioButton_65 = new JRadioButton("A");
		panel_15.add(radioButton_65);
		
		JRadioButton radioButton_66 = new JRadioButton("B");
		panel_15.add(radioButton_66);
		
		JRadioButton radioButton_67 = new JRadioButton("C");
		panel_15.add(radioButton_67);
		
		JRadioButton radioButton_68 = new JRadioButton("D");
		panel_15.add(radioButton_68);
		
		JRadioButton radioButton_69 = new JRadioButton("E");
		panel_15.add(radioButton_69);
		
		JPanel panel_34 = new JPanel();
		panel_2.add(panel_34);
		
		JLabel label_32 = new JLabel("16.");
		panel_34.add(label_32);
		
		JRadioButton radioButton_160 = new JRadioButton("A");
		panel_34.add(radioButton_160);
		
		JRadioButton radioButton_161 = new JRadioButton("B");
		panel_34.add(radioButton_161);
		
		JRadioButton radioButton_162 = new JRadioButton("C");
		panel_34.add(radioButton_162);
		
		JRadioButton radioButton_163 = new JRadioButton("D");
		panel_34.add(radioButton_163);
		
		JRadioButton radioButton_164 = new JRadioButton("E");
		panel_34.add(radioButton_164);
		
		JPanel panel_35 = new JPanel();
		panel_2.add(panel_35);
		
		JLabel label_33 = new JLabel("17.");
		panel_35.add(label_33);
		
		JRadioButton radioButton_165 = new JRadioButton("A");
		panel_35.add(radioButton_165);
		
		JRadioButton radioButton_166 = new JRadioButton("B");
		panel_35.add(radioButton_166);
		
		JRadioButton radioButton_167 = new JRadioButton("C");
		panel_35.add(radioButton_167);
		
		JRadioButton radioButton_168 = new JRadioButton("D");
		panel_35.add(radioButton_168);
		
		JRadioButton radioButton_169 = new JRadioButton("E");
		panel_35.add(radioButton_169);
		
		JPanel panel_36 = new JPanel();
		panel_2.add(panel_36);
		
		JLabel label_34 = new JLabel("18.");
		panel_36.add(label_34);
		
		JRadioButton radioButton_170 = new JRadioButton("A");
		panel_36.add(radioButton_170);
		
		JRadioButton radioButton_171 = new JRadioButton("B");
		panel_36.add(radioButton_171);
		
		JRadioButton radioButton_172 = new JRadioButton("C");
		panel_36.add(radioButton_172);
		
		JRadioButton radioButton_173 = new JRadioButton("D");
		panel_36.add(radioButton_173);
		
		JRadioButton radioButton_174 = new JRadioButton("E");
		panel_36.add(radioButton_174);
		
		JPanel panel_16 = new JPanel();
		panel_2.add(panel_16);
		
		JLabel label_15 = new JLabel("19.");
		panel_16.add(label_15);
		
		JRadioButton radioButton_70 = new JRadioButton("A");
		panel_16.add(radioButton_70);
		
		JRadioButton radioButton_71 = new JRadioButton("B");
		panel_16.add(radioButton_71);
		
		JRadioButton radioButton_72 = new JRadioButton("C");
		panel_16.add(radioButton_72);
		
		JRadioButton radioButton_73 = new JRadioButton("D");
		panel_16.add(radioButton_73);
		
		JRadioButton radioButton_74 = new JRadioButton("E");
		panel_16.add(radioButton_74);
		
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		panel.setBounds(1171, 57, 263, 650);
		getContentPane().add(panel);
		
		JPanel panel_17 = new JPanel();
		panel.add(panel_17);
		
		JLabel label_1 = new JLabel("20.");
		panel_17.add(label_1);
		
		JRadioButton radioButton_75 = new JRadioButton("A");
		panel_17.add(radioButton_75);
		
		JRadioButton radioButton_76 = new JRadioButton("B");
		panel_17.add(radioButton_76);
		
		JRadioButton radioButton_77 = new JRadioButton("C");
		panel_17.add(radioButton_77);
		
		JRadioButton radioButton_78 = new JRadioButton("D");
		panel_17.add(radioButton_78);
		
		JRadioButton radioButton_79 = new JRadioButton("E");
		panel_17.add(radioButton_79);
		
		JPanel panel_19 = new JPanel();
		panel.add(panel_19);
		
		JLabel label_16 = new JLabel("21.");
		panel_19.add(label_16);
		
		JRadioButton radioButton_85 = new JRadioButton("A");
		panel_19.add(radioButton_85);
		
		JRadioButton radioButton_86 = new JRadioButton("B");
		panel_19.add(radioButton_86);
		
		JRadioButton radioButton_87 = new JRadioButton("C");
		panel_19.add(radioButton_87);
		
		JRadioButton radioButton_88 = new JRadioButton("D");
		panel_19.add(radioButton_88);
		
		JRadioButton radioButton_89 = new JRadioButton("E");
		panel_19.add(radioButton_89);
		
		JPanel panel_20 = new JPanel();
		panel.add(panel_20);
		
		JLabel label_18 = new JLabel("22.");
		panel_20.add(label_18);
		
		JRadioButton radioButton_90 = new JRadioButton("A");
		panel_20.add(radioButton_90);
		
		JRadioButton radioButton_91 = new JRadioButton("B");
		panel_20.add(radioButton_91);
		
		JRadioButton radioButton_92 = new JRadioButton("C");
		panel_20.add(radioButton_92);
		
		JRadioButton radioButton_93 = new JRadioButton("D");
		panel_20.add(radioButton_93);
		
		JRadioButton radioButton_94 = new JRadioButton("E");
		panel_20.add(radioButton_94);
		
		JPanel panel_21 = new JPanel();
		panel.add(panel_21);
		
		JLabel label_19 = new JLabel("23.");
		panel_21.add(label_19);
		
		JRadioButton radioButton_95 = new JRadioButton("A");
		panel_21.add(radioButton_95);
		
		JRadioButton radioButton_96 = new JRadioButton("B");
		panel_21.add(radioButton_96);
		
		JRadioButton radioButton_97 = new JRadioButton("C");
		panel_21.add(radioButton_97);
		
		JRadioButton radioButton_98 = new JRadioButton("D");
		panel_21.add(radioButton_98);
		
		JRadioButton radioButton_99 = new JRadioButton("E");
		panel_21.add(radioButton_99);
		
		JPanel panel_22 = new JPanel();
		panel.add(panel_22);
		
		JLabel label_20 = new JLabel("24.");
		panel_22.add(label_20);
		
		JRadioButton radioButton_100 = new JRadioButton("A");
		panel_22.add(radioButton_100);
		
		JRadioButton radioButton_101 = new JRadioButton("B");
		panel_22.add(radioButton_101);
		
		JRadioButton radioButton_102 = new JRadioButton("C");
		panel_22.add(radioButton_102);
		
		JRadioButton radioButton_103 = new JRadioButton("D");
		panel_22.add(radioButton_103);
		
		JRadioButton radioButton_104 = new JRadioButton("E");
		panel_22.add(radioButton_104);
		
		JPanel panel_23 = new JPanel();
		panel.add(panel_23);
		
		JLabel label_21 = new JLabel("25.");
		panel_23.add(label_21);
		
		JRadioButton radioButton_105 = new JRadioButton("A");
		panel_23.add(radioButton_105);
		
		JRadioButton radioButton_106 = new JRadioButton("B");
		panel_23.add(radioButton_106);
		
		JRadioButton radioButton_107 = new JRadioButton("C");
		panel_23.add(radioButton_107);
		
		JRadioButton radioButton_108 = new JRadioButton("D");
		panel_23.add(radioButton_108);
		
		JRadioButton radioButton_109 = new JRadioButton("E");
		panel_23.add(radioButton_109);
		
		JPanel panel_24 = new JPanel();
		panel.add(panel_24);
		
		JLabel label_22 = new JLabel("26.");
		panel_24.add(label_22);
		
		JRadioButton radioButton_110 = new JRadioButton("A");
		panel_24.add(radioButton_110);
		
		JRadioButton radioButton_111 = new JRadioButton("B");
		panel_24.add(radioButton_111);
		
		JRadioButton radioButton_112 = new JRadioButton("C");
		panel_24.add(radioButton_112);
		
		JRadioButton radioButton_113 = new JRadioButton("D");
		panel_24.add(radioButton_113);
		
		JRadioButton radioButton_114 = new JRadioButton("E");
		panel_24.add(radioButton_114);
		
		JPanel panel_25 = new JPanel();
		panel.add(panel_25);
		
		JLabel label_23 = new JLabel("27.");
		panel_25.add(label_23);
		
		JRadioButton radioButton_115 = new JRadioButton("A");
		panel_25.add(radioButton_115);
		
		JRadioButton radioButton_116 = new JRadioButton("B");
		panel_25.add(radioButton_116);
		
		JRadioButton radioButton_117 = new JRadioButton("C");
		panel_25.add(radioButton_117);
		
		JRadioButton radioButton_118 = new JRadioButton("D");
		panel_25.add(radioButton_118);
		
		JRadioButton radioButton_119 = new JRadioButton("E");
		panel_25.add(radioButton_119);
		
		JPanel panel_26 = new JPanel();
		panel.add(panel_26);
		
		JLabel label_24 = new JLabel("28.");
		panel_26.add(label_24);
		
		JRadioButton radioButton_120 = new JRadioButton("A");
		panel_26.add(radioButton_120);
		
		JRadioButton radioButton_121 = new JRadioButton("B");
		panel_26.add(radioButton_121);
		
		JRadioButton radioButton_122 = new JRadioButton("C");
		panel_26.add(radioButton_122);
		
		JRadioButton radioButton_123 = new JRadioButton("D");
		panel_26.add(radioButton_123);
		
		JRadioButton radioButton_124 = new JRadioButton("E");
		panel_26.add(radioButton_124);
		
		JPanel panel_27 = new JPanel();
		panel.add(panel_27);
		
		JLabel label_25 = new JLabel("29.");
		panel_27.add(label_25);
		
		JRadioButton radioButton_125 = new JRadioButton("A");
		panel_27.add(radioButton_125);
		
		JRadioButton radioButton_126 = new JRadioButton("B");
		panel_27.add(radioButton_126);
		
		JRadioButton radioButton_127 = new JRadioButton("C");
		panel_27.add(radioButton_127);
		
		JRadioButton radioButton_128 = new JRadioButton("D");
		panel_27.add(radioButton_128);
		
		JRadioButton radioButton_129 = new JRadioButton("E");
		panel_27.add(radioButton_129);
		
		JPanel panel_28 = new JPanel();
		panel.add(panel_28);
		
		JLabel label_26 = new JLabel("30.");
		panel_28.add(label_26);
		
		JRadioButton radioButton_130 = new JRadioButton("A");
		panel_28.add(radioButton_130);
		
		JRadioButton radioButton_131 = new JRadioButton("B");
		panel_28.add(radioButton_131);
		
		JRadioButton radioButton_132 = new JRadioButton("C");
		panel_28.add(radioButton_132);
		
		JRadioButton radioButton_133 = new JRadioButton("D");
		panel_28.add(radioButton_133);
		
		JRadioButton radioButton_134 = new JRadioButton("E");
		panel_28.add(radioButton_134);
		
		JPanel panel_29 = new JPanel();
		panel.add(panel_29);
		
		JLabel label_27 = new JLabel("31.");
		panel_29.add(label_27);
		
		JRadioButton radioButton_135 = new JRadioButton("A");
		panel_29.add(radioButton_135);
		
		JRadioButton radioButton_136 = new JRadioButton("B");
		panel_29.add(radioButton_136);
		
		JRadioButton radioButton_137 = new JRadioButton("C");
		panel_29.add(radioButton_137);
		
		JRadioButton radioButton_138 = new JRadioButton("D");
		panel_29.add(radioButton_138);
		
		JRadioButton radioButton_139 = new JRadioButton("E");
		panel_29.add(radioButton_139);
		
		JPanel panel_30 = new JPanel();
		panel.add(panel_30);
		
		JLabel label_28 = new JLabel("32.");
		panel_30.add(label_28);
		
		JRadioButton radioButton_140 = new JRadioButton("A");
		panel_30.add(radioButton_140);
		
		JRadioButton radioButton_141 = new JRadioButton("B");
		panel_30.add(radioButton_141);
		
		JRadioButton radioButton_142 = new JRadioButton("C");
		panel_30.add(radioButton_142);
		
		JRadioButton radioButton_143 = new JRadioButton("D");
		panel_30.add(radioButton_143);
		
		JRadioButton radioButton_144 = new JRadioButton("E");
		panel_30.add(radioButton_144);
		
		JPanel panel_31 = new JPanel();
		panel.add(panel_31);
		
		JLabel label_29 = new JLabel("33.");
		panel_31.add(label_29);
		
		JRadioButton radioButton_145 = new JRadioButton("A");
		panel_31.add(radioButton_145);
		
		JRadioButton radioButton_146 = new JRadioButton("B");
		panel_31.add(radioButton_146);
		
		JRadioButton radioButton_147 = new JRadioButton("C");
		panel_31.add(radioButton_147);
		
		JRadioButton radioButton_148 = new JRadioButton("D");
		panel_31.add(radioButton_148);
		
		JRadioButton radioButton_149 = new JRadioButton("E");
		panel_31.add(radioButton_149);
		
		JPanel panel_32 = new JPanel();
		panel.add(panel_32);
		
		JLabel label_30 = new JLabel("34.");
		panel_32.add(label_30);
		
		JRadioButton radioButton_150 = new JRadioButton("A");
		panel_32.add(radioButton_150);
		
		JRadioButton radioButton_151 = new JRadioButton("B");
		panel_32.add(radioButton_151);
		
		JRadioButton radioButton_152 = new JRadioButton("C");
		panel_32.add(radioButton_152);
		
		JRadioButton radioButton_153 = new JRadioButton("D");
		panel_32.add(radioButton_153);
		
		JRadioButton radioButton_154 = new JRadioButton("E");
		panel_32.add(radioButton_154);
		
		JPanel panel_33 = new JPanel();
		panel.add(panel_33);
		
		JLabel label_31 = new JLabel("35.");
		panel_33.add(label_31);
		
		JRadioButton radioButton_155 = new JRadioButton("A");
		panel_33.add(radioButton_155);
		
		JRadioButton radioButton_156 = new JRadioButton("B");
		panel_33.add(radioButton_156);
		
		JRadioButton radioButton_157 = new JRadioButton("C");
		panel_33.add(radioButton_157);
		
		JRadioButton radioButton_158 = new JRadioButton("D");
		panel_33.add(radioButton_158);
		
		JRadioButton radioButton_159 = new JRadioButton("E");
		panel_33.add(radioButton_159);
		
		JPanel panel_37 = new JPanel();
		panel.add(panel_37);
		
		JLabel label_35 = new JLabel("36.");
		panel_37.add(label_35);
		
		JRadioButton radioButton_175 = new JRadioButton("A");
		panel_37.add(radioButton_175);
		
		JRadioButton radioButton_176 = new JRadioButton("B");
		panel_37.add(radioButton_176);
		
		JRadioButton radioButton_177 = new JRadioButton("C");
		panel_37.add(radioButton_177);
		
		JRadioButton radioButton_178 = new JRadioButton("D");
		panel_37.add(radioButton_178);
		
		JRadioButton radioButton_179 = new JRadioButton("E");
		panel_37.add(radioButton_179);
		
		JButton btnSubmitAnswers = new JButton("Submit Answers");
		btnSubmitAnswers.setBounds(1171, 734, 263, 29);
		getContentPane().add(btnSubmitAnswers);
		
		JLabel lblAnswers = new JLabel("Answers");
		lblAnswers.setOpaque(true);
		lblAnswers.setBackground(UIManager.getColor("Button.background"));
		lblAnswers.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswers.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAnswers.setBounds(896, 34, 538, 19);
		getContentPane().add(lblAnswers);
		
		JLabel label_37 = new JLabel(" ");
		label_37.setOpaque(true);
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_37.setBackground(SystemColor.window);
		label_37.setBounds(1171, 715, 263, 60);
		getContentPane().add(label_37);
		
		
		
		
	}
}
