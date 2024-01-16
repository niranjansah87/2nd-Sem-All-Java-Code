
package q8;
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
	public void display()
	{
		System.out.println("Edges:"+edges()+" Vertices:"+vertices()+" Length:"+length+" Breadth:"+breadth+" Area:"+area());
	}
	
}
class Cuboid extends Rectangle{
	double height=3;
	double volume()
	{
		return area()*height;
		
	}
	
	
}


