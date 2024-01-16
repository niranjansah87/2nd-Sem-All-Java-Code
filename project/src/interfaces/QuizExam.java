package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class QuizExam extends JFrame implements ActionListener{
	JButton e1;
	QuizExam(String s)
	{
		e1=new JButton("Enter");
		e1.addActionListener(this);
		add(e1);
		e1.setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    setLayout(null);  
	    setLocation(250,100);  
	    setVisible(true);  
	    setSize(600,350); 
	}
	
	
	
	public static void main(String[] args) {
		new QuizExam("Quiz Exam");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
