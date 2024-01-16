package sah;

public class Rectangle extends GeometricShape{
	private double length;
	private double width;
	Rectangle()
	{
		super();
		length=5.0;
		width=6.0;
	}
	Rectangle(String c,boolean f,double l,double w)
	{
		super(c,f);
		length=5.0;
		width=6.0;
	}
	
	public double getLen()
	{
		return length;
		
	}
	public double getWid()
	{
		return width;
	}
	public String toString()
	{
		String str=String.format("Color is %s%n",getBorderColor(),getFilled(),getLen(),getWid());
				return str;
	}

	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		System.out.println(r1);
		Rectangle r2=new Rectangle();
		System.out.println(r2);
	}
	
	}
