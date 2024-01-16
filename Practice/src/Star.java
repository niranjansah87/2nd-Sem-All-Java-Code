class Rectangle {
private int l,b;
public void SetL(int len)
{
	l=len;
}
public void SetB(int bre)
{
	l=bre;
}
public int getL()
{
	return l;
}
public int getB()
{
	return b;
}
public int Area()
{
	return l*b;
}
public String toString()
{
	String str=String.format("%s%s%s",getL(),getB(),Area());
	
			return str;
						
}
class RectangleDemo{
	public static void main(String[] args)
	{
		Rectangle r= new Rectangle();
		r.SetL(5);
		r.SetB(5);
		System.out.println(r);
	}
}
}
		

