package Sah;

public class Triangle extends GeometricShape{
	private double b;
	private double h;
	Triangle(double base,double height)
	{
		b=base;
		h=height;
	}
	public double getB()
	{
		return b;
		
	}
	public double getH()
	{
		return h;
		
	}
	public double Area()
	{
		double ar=0.5*b*h;
		return ar;
	}
	public String toString()
	{
		String s=String.format("Area is %d%n",Area());
		return s;
	}

}
