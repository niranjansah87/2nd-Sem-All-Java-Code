package Niranjan;

public class Rectangle extends GeometricShape {
	private double length;
	private double width;
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	/*public String toString()
	{
		return String.format(" Length=%d%n Width=%d%n",getLength(),getWidth());
	}*/

}
