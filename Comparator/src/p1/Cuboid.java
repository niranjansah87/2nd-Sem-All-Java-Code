/*Draw a class diagram and develop the logic for the following:-
scenario.consider the class cuboid with length, breadth and height 
as a private attributes.code the parameterized constructor and 
toString() method. Develop main method that store 
data of cuboid as a collection and must be menu
driven with the following operation:
1. Add new Cuboid 
2. Display all
3. Sort by length
4. Sort by Area
[Hint : Area of cuboid is length*breath*height]*/





package p1;

public class Cuboid {
	private int length;
	private int breadth;
	private int height;
	
	Cuboid(int length,int breadth,int height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public int getL()
	{
		return length;
	}
	public int getB()
	{
		return breadth;
	}
	public int getH()
	{
		return height;
	}
	public int area()
	{
		return length*breadth*height;
	}
	public String toString()
	{
		return String.format("Length=%d         breadth=%d     height=%d    Area=%d",getL(),getB(),getH(),area());
	}
}
