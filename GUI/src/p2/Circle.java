package p2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Circle implements ActionListener
{
	JFrame f;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int rad= Integer.parseInt(t1.getText());
			double area=3.14*rad*rad;
			t2.setText(Double.toString(area));
		}
		else if(e.getSource()==b2)
		{
			int rad=Integer.parseInt(t1.getText());
			int diam=2*rad;
			t2.setText(Integer.toString(diam));
		}
		else if(e.getSource()==b3)
		{
			int rad=Integer.parseInt(t1.getText());
			double peri=2*3.14*rad;
			t2.setText(Double.toString(peri));
		}
	}
	Circle()
	{
		f=new JFrame("Circle implementations");
		l1=new JLabel("radius");
		l2=new JLabel("output");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("Area of Circle");
		//b2.setForeground(Color.orange);
		//b2.setBackground(Color.red);
		b2=new JButton("diameter");
		b3=new JButton("permeter");
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.pack();
	}
	public static void main(String[] args) 
	{
		new Circle();

	}

}
