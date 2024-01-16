package Sah;

import java.util.Scanner;

public class Outer {
	private static Inner Inner;
	String password;
	
	public boolean IsvalidPass(String password)
	{
		 if (!((password.length() >= 8) && (password.length() <= 15)) || (password.contains(" ")))
		 {
			return false; 
		 }
		 this.password=password;
		 return true;
	}
	class Inner{
		String name;
		void setName()
		{
			if(Outer.this.IsvalidPass("true"))
			{
				System.out.println("Name is"+name);
			}
		}
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Outer o=new Outer();
		System.out.println("Enter the password");
		o.IsvalidPass(s.next());
		
		System.out.println("Enter the Name");
		
		Outer.Inner.name=s.next();
		
		System.out.println(o);
		
	}

}
