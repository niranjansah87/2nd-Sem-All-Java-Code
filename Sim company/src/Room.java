
public class Room {
private long ISBN;
private String Title;
private double Price;
public void setA(long num)
{
	ISBN=num;
}
public void setB(String t)
{
	Title=t;
}
public void setC(double p)
{
	Price=p;
}
public long getA()
{
	return ISBN;
}
public String getB()
{
	return Title;
}
public String getC()
{
	return "Rs"+Price;
}
public String toString()
{
	String str=String.format("ISBN Number=%d%n Title=%s%n Price=%s%n",getA(),getB(),getC());
	return str;
}
}
