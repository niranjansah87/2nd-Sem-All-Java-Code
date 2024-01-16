package FACTORYDESIGN;

public interface Shape {
	void draw();

}
class Rectangle implements Shape{

	@Override
	public void draw() {
	System.out.println("I am chutiya rectangle");
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am harami Circle");
		
	}
	
}