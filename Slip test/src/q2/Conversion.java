package q2;

import java.util.Scanner;

public class Conversion {
	private int feet;
	public void setFeet(int feet)
	{
		try {
			if(feet<0)
			{
				throw new InvalidInputException(feet);
				
			}
			else
			{
				this.feet=feet;
			}
		}
		catch(InvalidInputException e)
		{
			System.out.println(e);
		}
		
	}
	public int Convert()
	{
		return feet*12;
	}
	
	public String toString()
	{
		return "Length in inch="+Convert();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Conversion c=new Conversion();
		c.setFeet(s.nextInt());
		System.out.println(c);

	}

}
class InvalidInputException extends Exception{
	int feet;
	InvalidInputException(int feet)
	{
		this.feet=feet;
	}
	public String toString()
	{
		return "InvalidInputException";
	}
}
