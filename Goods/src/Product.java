
public class Product {
private String ID,Name;
private int quantity,price;
public void setA(String cid)
{
	ID=cid;
}
public void setB(String cname)
{
	Name=cname;
}
public boolean setC(int good)
{
	if(good>0) {
		quantity=good;
		return true;
	}
	return false;
}
public boolean setD(int p)
{
	if(p>0)
	{
		price=p;
		return true;
	}
	return false;
}
public String getA()
{
	return ID;
}
public String getB()
{
	return Name;
}
public String getC()
{
	return quantity+" KG";
}
public String getD()
{
	return "Rs "+price;
}
public int Total()
{
	return quantity*price;
}
public String toString()
{
	String str=String.format("Customer id=%s%n Customer Name:%s%n Quantity:%s%n Price:%s%n",getA(),getB(),getC(),getD(),Total());
	return str;
}
}
