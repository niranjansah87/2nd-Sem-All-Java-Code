package p3;

public abstract class Shape {
	public abstract double RectangleArea();
	public abstract double SquareArea();
	public abstract double CircleArea();
}
class Area extends Shape{
	
	public double RectangleArea()
	{
		double l=6;
		double b=7;
		double area=l*b;
		return area;
	}
	public double SquareArea()
	{
		double l=5;
		double area=l*l;
		return area;
	}
	public double CircleArea()
	{
		double r=7;
		double area=3.14*r*r;
		return area;
	}
	
}

