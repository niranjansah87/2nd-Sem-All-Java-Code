package Sah;

public class Author {
	private String Aname;
	private int Aage;
	Author(String Aname,int Aage)
	{
		this.Aname=Aname;
		this.Aage=Aage;
	}
	public String getN()
	{
		return Aname;
	}
	public int getA()
	{
		return Aage;
	}
	public String toString()
	{
		String s=String.format("Author name=%s%n  Author age=%d",getN(),getA());
		return s;
		
	}

}
