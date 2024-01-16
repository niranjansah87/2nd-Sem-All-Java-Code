package FACTORYDESIGN;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory s=new ShapeFactory();
		Shape s1=s.getShape("Circle");
		s1.draw();
		
		Shape s2=s.getShape("Rectangle");
		s2.draw();

	}

}