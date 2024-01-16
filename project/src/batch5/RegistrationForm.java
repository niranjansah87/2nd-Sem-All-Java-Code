package batch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class RegistrationForm extends JFrame implements ItemListener
{
	static JFrame f;
	static JLabel l; 
	// combobox 
	static JComboBox c1; 
    public static void main(String [] args) throws Exception
    {
        f=new JFrame();
        Container c;
        JLabel title,name,mno,gender,add,res;
        JTextField tname,tmno;
        JRadioButton male,female;
        ButtonGroup gengp;
        JTextArea tadd,resadd,tout;
        JCheckBox term;
        JButton sub,reset;
        f.setTitle("RegistrationForm");
        f.setBounds(200,80,1150,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        c=f.getContentPane();
        c.setLayout(null);
 
 
 
        //label-title
        title=new JLabel("RegistrationForm");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(400,30);
        title.setLocation(420,20);
        c.add(title);
       
        //label-name
        name=new JLabel("Name");
        name.setFont(new Font("Arial",Font.PLAIN,30));
        name.setSize(200,30);
        name.setLocation(50,70);
        c.add(name);
   
   
        //label-mno
        mno=new JLabel("ID Number");
        mno.setFont(new Font("Arial",Font.PLAIN,30));
        mno.setSize(300,30);
        mno.setLocation(50,120);
        c.add(mno);

//TextField-name
tname=new JTextField();
tname.setFont(new Font("Arial",Font.PLAIN,30));
tname.setSize(120,30);
tname.setLocation(275,70);
c.add(tname);
   
   
        //TextField-mno
        tmno= new JTextField();
        tmno.setFont(new Font("Arial",Font.PLAIN,30));
        tmno.setSize(120,30);
        tmno.setLocation(275,120);
        c.add(tmno);
       
        //Label-Gender
        gender= new JLabel("Gender");
        gender.setFont(new Font("Arial",Font.PLAIN,30));
        gender.setSize(300,30);
        gender.setLocation(50,170);
        c.add(gender);
       
       
        //RadioButton-male
        male=new JRadioButton("male");
        male.setFont(new Font("Arial",Font.PLAIN,30));
        male.setSelected(true);
        male.setSize(100,20);
        male.setLocation(255,170);
        c.add(male);
       
       
        //RadioButton-female
        female=new JRadioButton("female");
        female.setFont(new Font("Arial",Font.PLAIN,30));
        female.setSelected(true);
        female.setSize(200,20);
        female.setLocation(395,170);
        c.add(female);
       
       
        //ButtonGroup
        gengp=new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
       
       
        //Label address
        add=new JLabel("Address");
        add.setFont(new Font("Arial",Font.PLAIN,30));
        add.setSize(3500,30);
        add.setLocation(50,230);
        c.add(add);
     
     
        //TextArea-address
        tadd=new JTextArea();
        tadd.setFont(new Font("Arial",Font.PLAIN,30));
        tadd.setSize(300,30);
        tadd.setLocation(275,230);
        tadd.setLineWrap(true);
        c.add(tadd);
   
   
        //Checkbox- terms and conditionn
        term= new JCheckBox("Accept Terms and conditions");
        term.setFont(new Font("Arial",Font.PLAIN,30));
        term.setSize(450,20);
        term.setLocation(110,320);
        c.add(term);
       
       
        //Button-Reset
        reset=new JButton("Reset");
        reset.setFont(new Font("Arial",Font.PLAIN,30));
        reset.setSize(150,25);
        reset.setLocation(370,410);
        c.add(reset);
		
		
       
//Button-submit
sub=new JButton("Submit");
sub.setFont(new Font("Arial",Font.PLAIN,30));
sub.setSize(150,25);
sub.setLocation(100,410);
c.add(sub);



        //Label-result
        res=new JLabel("");
        res.setFont(new Font("Arial",Font.PLAIN,30));
        res.setSize(500,30);
        res.setLocation(50,515);
        c.add(res);
     //TextArea- result
        
	
	    resadd=new JTextArea();
        resadd.setFont(new Font("Arial",Font.PLAIN,30));
        resadd.setSize(200,30);
        resadd.setLocation(275,510);
        
        
        c.add(resadd);
		
        //Printing details
		tout=new JTextArea();
        tout.setFont(new Font("Arial",Font.PLAIN,30));
        tout.setSize(450,500);
        tout.setLocation(650,80);
        tout.setLineWrap(true);
        tout.setEditable(false);
		f.setVisible(true);
        c.add(tout);
        

        //ActionListener for submit button
        sub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(term.isSelected())
                {
                    String data,data1,data2,data3;
                    data="Name:"+tname.getText() + "\n" + "ID Number:"+tmno.getText() + "\n";
					if(male.isSelected())
						
						
                    data1="Gender:"+male.getText() + "\n";
					else
						 data1="Gender:"+female.getText() + "\n";
                    data2="Address:"+tadd.getText()+"\n";
					data3="Sports:"+c1.getSelectedItem();
                    tout.setText(data+data1+data2+data3);
                    tout.setEditable(false);
                    res.setText("Registration successfully....");
                }
                else
                {
                    
                   // resadd.setText("null");
                    tout.setText("Please accept the terms and conditions");
                }
        }});
        reset.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tname.setText("");
                tadd.setText("");
                tmno.setText("");
                res.setText("");
                tout.setText("");
                term.setSelected(false);
                //resadd.setText("");
            }
        }); 
		RegistrationForm s = new RegistrationForm(); 

		// array of string contating cities 
		String s1[] = { "Kabaddi", "Cricket", "Volley Ball", "Basket Ball", "Hockey" }; 

		// create checkbox 
		c1 = new JComboBox(s1); 

		// add ItemListener 
		c1.addItemListener(s); 

		// create labels 
		l = new JLabel("select your game "); 

		// set color of text 
		l.setForeground(Color.red); 

		f.add(l); 

		// add combobox to panel 
		f.add(c1); 

        l.setSize(150,25);
        l.setLocation(100,450);
	    c1.setSize(150,25);
        c1.setLocation(100,470);
	}
	public void itemStateChanged(ItemEvent e) 
	{ 
	} 
}