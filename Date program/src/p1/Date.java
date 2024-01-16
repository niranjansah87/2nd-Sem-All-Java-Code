package p1;

public class Date {
	int date;
	int month;
	int year;
	public Date(int day,int mon,int y)
	{
		date=day;
		month=mon;
		year=y;
	}
	public boolean setA(int d,int m,int ye)
	{
		if(d>0 && m>0 && ye>0)
		{
			date=d;
			month=m;
			year=ye;
			return true;
		}
		return false;
	}
	public int getDate()
	{
		return date;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		String n=String.format("Date format= %d/%d/%d",getDate(),getMonth(),getYear());
		return n;
	}
	

}
