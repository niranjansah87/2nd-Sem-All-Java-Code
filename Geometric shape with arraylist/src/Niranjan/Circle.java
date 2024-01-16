package Niranjan;

public class Circle extends Rectangle{
	private double radius;
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public String toString()
	{
		return String.format("BorderColor=%s%n Filled=%b%n Length=%d%n Width=%d%n Radius=%d%n ",getColor(),getfilled(),getLength(),getWidth(),getRadius());
	}

}
