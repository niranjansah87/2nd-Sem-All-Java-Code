package q5;

abstract class Shape {
	abstract int edges();
	abstract int vertices();

}
class Rectangle extends Shape{
	double length=5;
	double breadth=2;
	
	@Override
	int edges() {
		
		return 4;
	}

	@Override
	int vertices() {
	
		return 4;
	}
	double area()
	{
		return length*breadth;
	}
	public String toString()
	{
		return String.format("Edges:%d,Vertices:%d,Length:%d m,Breadth:%d,Area:%d sq.m",edges(),vertices(),length,breadth,area());
	}
	
}
class Cuboid extends Rectangle{
	double height=3;
	double volume()
	{
		return area()*height;
		
	}
	public String toString()
	{
		return String.format("Edges:%d ,Vertices:%d ,Length:%d m,Breadth:%d m,Volume:%d cu.m",edges(),vertices(),length,breadth,volume());
	}
	
}
