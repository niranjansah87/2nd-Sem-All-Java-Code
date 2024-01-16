package q6;

public class Student {
	private static int mark1,mark2,mark3;
	public void setMark(int mark1,int mark2,int mark3)
	{
		try {
		if((mark1<100) && (mark2<100) &&(mark3<100))
		{
			this.mark1=mark1;
			this.mark2=mark2;
			this.mark3=mark3;
		}
		else
		{
			throw new InvalidMarkException(mark1,mark2,mark3);
		}
		}
		catch(InvalidMarkException e)
		{
			System.out.println(e);
		}
	}
	public static int computeTotal()
	{
		return mark1+mark2+mark3;
	}
	public String toString()
	{
		return String.format("Total Makr=%d",computeTotal());
	}

}
class InvalidMarkException extends Exception{
	int mark1,mark2,mark3;
	InvalidMarkException(int mark1,int mark2,int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public String toString()
	{
		return "InvalidMark";
	}
}
