package Niranjan;

public class Birthday {
	private int month;
	private int day;
	private int year;
	
	Birthday(int month,int day,int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getM()
	{
		return month;
	}
	public int getD()
	{
		return day;
	}
	public int getY()
	{
		return year;
	}
	public String toString()
	{
		String s=String.format("Month=%d%n Day=%d%s year=%d%s",getM(),getD(),getY());
		return s;
		
	}

}
