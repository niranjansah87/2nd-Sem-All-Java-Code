package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JToggleButton;

public class SD extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JPasswordField passwordFiDRG;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_;
     private 	JLabel lblNewLabel_6 ;
     private JPanel content;
     private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SD frame = new SD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SD() {
		setFont(null);
		setBackground(Color.PINK);
		setTitle("                                      JAVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		content = new JPanel();
		content.setBackground(Color.YELLOW);
		content.setToolTipText("S");
		content.setBorder(new EmptyBorder(6, 7, 7, 7));
		setContentPane(content);
		content.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(5, 5, 426, 13);
		content.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(5, 237, 426, 21);
		content.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("FATHER NAME");
		lblNewLabel_1.setBounds(0, 24, 45, 13);
		content.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(52, 2, 96, 19);
		content.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(52, 21, 96, 19);
		content.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOTHER NAME");
		lblNewLabel_2.setBounds(0, 47, 45, 13);
		content.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(52, 44, 96, 19);
		content.add(textField_2);
		textField_2.setColumns(10);
		
		table = new JTable();
		table.setBounds(52, 132, 53, -21);
		content.add(table);
		
		passwordFiDRG = new JPasswordField();
		passwordFiDRG.setBounds(53, 147, 150, 19);
		passwordFiDRG.setToolTipText("");
		content.add(passwordFiDRG);
		
		JLabel lblNewLabel_3 = new JLabel("PWD");
		lblNewLabel_3.setBounds(5, 150, 45, 13);
		content.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID NO");
		lblNewLabel_4.setBounds(5, 127, 45, 13);
		content.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(52, 118, 151, 19);
		content.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("KLU LMS");
		lblNewLabel_5.setBounds(68, 93, 96, 21);
		content.add(lblNewLabel_5);
		
		 lblNewLabel_6 = new JLabel("COMMENT");
		 lblNewLabel_6.setBounds(0, 176, 45, 13);
		content.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(53, 173, 150, 19);
		content.add(textField_4);
		textField_4.setColumns(10);
		
		table_ = new JTable();
		table_.setBounds(345, 75, -123, -51);
		content.add(table_);
		
		JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("New radio item");
		radioButtonMenuItem.setBounds(-26, 199, 131, 5);
		content.add(radioButtonMenuItem);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(269, 118, 1, 1);
		content.add(horizontalBox);
		
		JLabel lblNewLabel_7 = new JLabel("country name");
		lblNewLabel_7.setBounds(0, 65, 45, 13);
		content.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(52, 62, 96, 19);
		content.add(textField_5);
		textField_5.setColumns(10);
	}
}