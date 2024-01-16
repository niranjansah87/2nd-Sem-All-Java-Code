package finalp;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
//******************************************   Loginpage   ********************************************
public class Railway
{  
	Railway()
	{	
		JFrame f=new JFrame("HOME");
		JLabel l11=new JLabel(" - TRAIN TICKET BOOKING  -");
		l11.setBounds(300,105,500,30);
		l11.setFont(new Font ("Arial",Font.PLAIN,20));
		f.add(l11);
//*** username and passowrd ***
JLabel l1=new JLabel("User name");
l1.setBounds(340,200,95,30);
f.add(l1);
JTextField t1=new JTextField("");
t1.setBounds(440,200,130,30);
f.add(t1);
JLabel l2=new JLabel("Password");
l2.setBounds(340,250,95,30);

f.add(l2);
JPasswordField t2=new JPasswordField("");
t2.setBounds(440,250,130,30);
f.add(t2);
//***Login button*** 
JButton b=new JButton("Login");
b.setBounds(455,305,95,30);
f.add(b);
b.addActionListener(new ActionListener() {	
	public void actionPerformed(ActionEvent ae) {
		String uname=t1.getText();
		String psd=t2.getText();
		if (uname.equals("klu") && psd.equals("123"))
			{
			b.addActionListener(new ActionListener() {			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Train();
			}
		});
			}	
		else
			{
JOptionPane.showMessageDialog(f,"Invalid username or password");

			}
	}
	});
JLabel l3=new JLabel("Don't have a account..?");
l3.setBounds(340,370,140,50);
f.add(l3);
JButton b1=new JButton("Register");
b1.setBounds(475,385,85,20);
f.add(b1);
b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Form();
			}
		});
f.setSize(900,600);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
// ****   MAIN METHOD   ****
public static void main(String[] sri)
{
new Railway();
}
}
//***************************REGISTRER FORM************************************
class Form {
			JFrame f = new JFrame("Registration");
	public Form()
{
	JLabel l=new JLabel("REGISTRATION");
l.setFont(new Font ("Arial",Font.PLAIN,20));
l.setBounds(150,70,250,30);
f.add(l);
JLabel l1=new JLabel("Name  :");
l1.setBounds(50,150,95,30);
f.add(l1);
JTextField t1=new JTextField("");
t1.setBounds(175,157,100,20);
f.add(t1);
JLabel l2=new JLabel("Age    :");
l2.setBounds(50,200,80,30);
f.add(l2);
JTextField  t2= new JTextField();
t2.setBounds(175,207,30,20);

f.add(t2);
JLabel l3=new JLabel("Gender  :");
l3.setBounds(50,250,95,30);
f.add(l3);
JRadioButton j1=new JRadioButton("male");	
j1.setBounds(150,250,95,30);			
f.add(j1);
JRadioButton j2=new JRadioButton("Female");	
j2.setBounds(250,250,95,30);			 
f.add(j2);
JLabel l4=new JLabel("State   :");
l4.setBounds(50,300,135,30);
f.add(l4);
String s1[] = {"SELECT", "Andhra pradesh", "Telangana", "Tamil nadu", "Maharastra", "madhaya pradesh" }; 
JComboBox t3=new JComboBox(s1);
t3.setBounds(175,310,100,20);
f.add(t3);
JLabel l6=new JLabel("User name   :");
l6.setBounds(50,375,135,30);
f.add(l6);
JTextField  t5= new JTextField();
t5.setBounds(175,380,95,20);
f.add(t5);

JLabel l61=new JLabel("Password   :");
l61.setBounds(50,410,135,30);
f.add(l61);
JTextField  t51= new JPasswordField();
t51.setBounds(175,420,95,20);
f.add(t51);
JLabel l16=new JLabel("Mobile number   :");
l16.setBounds(50,450,135,30);
f.add(l16);
JTextField  t15= new JTextField();
t15.setBounds(175,455,95,20);
f.add(t15);
JLabel l5=new JLabel("address   :");
l5.setBounds(50,500,135,30);
f.add(l5);
JTextArea  t4= new JTextArea();
t4.setBounds(175,510,270,100);
f.add(t4);
			JButton b=new JButton("Submit");
			b.setBounds(200,640,95,20);
			f.add(b);
			b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
		
			{
				JOptionPane.showMessageDialog(f,"Register sucesfully.\n Please click on loginpage...");
			}	
			}
	});
	JButton back=new JButton("Login page");
			back.setBounds(300,705,100,20);
			f.add(back);
			back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Railway();
			}
		});
	JLabel l8=new JLabel("                                        please login...");
	l8.setBounds(50,700,500,30);
	f.add(l8);
f.setSize(500,800);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//***********************Train list**************************
class Train {
			JFrame f = new JFrame("Trains list");
	public Train()
{
	JLabel l=new JLabel("Trains and Timings");
l.setFont(new Font ("Arial",Font.PLAIN,20));
l.setBounds(150,70,250,30);
f.add(l);
JLabel l1=new JLabel("Starting point  :");
l1.setBounds(50,150,95,30);
f.add(l1);
JTextField t1=new JTextField("");
t1.setBounds(175,157,100,20);
f.add(t1);
JLabel l2=new JLabel("Destination point    :");
l2.setBounds(50,170,150,95);
f.add(l2);
JTextField  t2= new JTextField();
t2.setBounds(175,207,100,20);
f.add(t2);
JLabel l3=new JLabel("Gender  :");
l3.setBounds(50,250,95,30);
f.add(l3);
JRadioButton j1=new JRadioButton("male");	
j1.setBounds(150,250,95,30);			
f.add(j1);
JRadioButton j2=new JRadioButton("Female");	
j2.setBounds(250,250,95,30);			 
f.add(j2);
JLabel l4=new JLabel("Trains   :");
l4.setBounds(50,300,135,30);
f.add(l4);
String s1[] = {"SELECT", "Seshadri express", "Shatabdi express", "Garib rath", "Vande Bharath express", "Vishaka express","Rajadhani express" }; 
JComboBox t3=new JComboBox(s1);
t3.setBounds(175,310,100,20);
f.add(t3);
JLabel l6=new JLabel("TIMINGS   :");
l6.setBounds(50,370,135,30);
f.add(l6);
String s11[] = {"SELECT", "09:00AM", "09:55AM", "11:00AM", "12:30PM", "01:30PM", "02:55PM", "03:15PM", "04:52PM","06:00PM","08:00PM","10:00PM","11:55PM" };
JComboBox t33=new JComboBox(s11);
t33.setBounds(175,375,100,20);
f.add(t33);
JLabel l61=new JLabel("Seats   :");

l61.setBounds(50,410,135,30);
f.add(l61);
JRadioButton j10=new JRadioButton("Upper");	
j10.setBounds(150,410,95,30);			
f.add(j10);
JRadioButton j20=new JRadioButton("LOWER");	
j20.setBounds(250,410,95,30);			 
f.add(j20);
JLabel l16=new JLabel("Mobile number   :");
l16.setBounds(50,450,135,30);
f.add(l16);
JTextField  t15= new JTextField();
t15.setBounds(175,455,95,20);
f.add(t15);
JLabel l5=new JLabel("Select seat number   :");
l5.setBounds(50,500,135,30);
f.add(l5);
String s111[] = {"SELECT", "s1", "s2", "s5", "s6", "s7", "s9", "s24", "s29","s37","s42","s48","s55","s59","s64","s79" };
JComboBox t330=new JComboBox(s111);
t330.setBounds(175,510,100,20);
f.add(t330);
JLabel l333=new JLabel("Ac/NON-AC");
l333.setBounds(50,550,130,30);

f.add(l333);
JRadioButton j11=new JRadioButton("AC");	
j11.setBounds(150,550,95,30);			
f.add(j11);
JRadioButton j22=new JRadioButton("NON-AC");	
j22.setBounds(250,550,95,30);			 
f.add(j22);
JLabel l133=new JLabel("Train   :");
l133.setBounds(50,600,130,30);
f.add(l133);
JRadioButton j111=new JRadioButton("EXPRESS");	
j111.setBounds(150,600,95,30);			
f.add(j111);
JRadioButton j222=new JRadioButton("SUPER FAST");	
j222.setBounds(250,600,120,30);			 
f.add(j222);
			JButton b=new JButton("Submit");
			b.setBounds(200,660,95,20);
			f.add(b);
			b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Details();

			}
		});
f.setSize(500,800);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
//****************passenger details********************
class Details 
{
			JFrame f = new JFrame("PASSENGET DETAILS");
	public Details()
{
	JLabel l=new JLabel("PASSENGER DETAILS");
l.setFont(new Font ("Arial",Font.PLAIN,20));
l.setBounds(150,70,250,30);
f.add(l);
JLabel l1=new JLabel("Name  :");
l1.setBounds(50,150,95,30);
f.add(l1);
JTextField t1=new JTextField("");

t1.setBounds(175,157,100,20);
f.add(t1);
JLabel l2=new JLabel("Age    :");
l2.setBounds(50,200,80,30);
f.add(l2);
JTextField  t2= new JTextField();
t2.setBounds(175,207,80,20);
f.add(t2);
JLabel l3=new JLabel("Gender  :");
l3.setBounds(50,250,95,30);
f.add(l3);
JRadioButton j1=new JRadioButton("male");	
j1.setBounds(150,250,95,30);			
f.add(j1);
JRadioButton j2=new JRadioButton("Female");	
j2.setBounds(250,250,95,30);			 
f.add(j2);
JLabel l6=new JLabel("Conform Password   :");
l6.setBounds(50,300,150,30);
f.add(l6);
JTextField  t5= new JPasswordField();
t5.setBounds(175,310,95,20);
f.add(t5);

JLabel l16=new JLabel("Mobile number   :");
l16.setBounds(50,350,135,30);
f.add(l16);
JTextField  t15= new JTextField();
t15.setBounds(175,360,95,20);
f.add(t15);
JLabel l5=new JLabel("Additional information :");
l5.setBounds(50,400,135,30);
f.add(l5);
JTextArea  t4= new JTextArea();
t4.setBounds(195,410,240,80);
f.add(t4);
			JButton b=new JButton("Submit");
			b.setBounds(200,520,95,20);
			f.add(b);
			b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) 
{			{
				JOptionPane.showMessageDialog(f,"Succesfully Tickrt Booked.. \n Wish you happy journey...");
			}	
			}
	});
	
		JButton back=new JButton("Login page");
			back.setBounds(300,705,100,20);
			f.add(back);
			back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				f.dispose();
				new Railway();
			}
		});
		JLabel l8=new JLabel("     Click here to Loginpage..........");
	l8.setBounds(50,700,500,30);
	f.add(l8);
f.setSize(500,800);
f.setLayout(null);
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
