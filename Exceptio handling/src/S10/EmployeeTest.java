package S10;

import java.util.Scanner;

import S9.InvalidPAN;

public class EmployeeTest {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in); 
	String PAN=s.next();
	PAN(PAN);

	}

	public static void PAN(String PAN) {
		try {
			if(PAN.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}+"))
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("InValid");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
