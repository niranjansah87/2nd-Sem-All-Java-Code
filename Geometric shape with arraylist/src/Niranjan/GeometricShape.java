package Niranjan;

public class GeometricShape {
	private String borderColor;
	private boolean filled;
	public void setColor(String borderColor)
	{
		this.borderColor=borderColor;
	}
	public void setFill(boolean filled)
	{
		this.filled=filled;
	}
	public String getColor()
	{
		return borderColor;
	}
	public boolean getfilled()
	{
		return filled;
	}
	/*public String toString()
	{
		return String.format("BorderColor=%s%n Filled=%b%n",getColor(),getfilled());
	}*/
}
