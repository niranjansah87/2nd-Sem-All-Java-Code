package p1;

public class CourseClass {
	private String CourseTitle,coursecode;
private int credit;
public void setT(String title)
{
	CourseTitle=title;
}
public boolean setC(String code)
{
	if (code.matches("[a-zA-Z_]+"))
	{
		coursecode=code;
		return true;
	}
	return false;
	
}
public boolean setD(int c)
{
	if(c>0 && c<6)
	{
		credit=c;
		return true;
	}
	return false;
	
}
public String getT()
{
	return CourseTitle;
}
public String  getC()
{
	return coursecode;
}
public String  getD()
{
	return credit+" point";
}
public String toString()
{
	String str=String.format("Course Title=%s%n Course code=%s%n Course credit=%s%n",getT(),getC(),getD());
	return str;
}
}
