package lab;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s;
		s=new Rectangle(10,5);
		System.out.println("Area of Rectangle is "+s.getArea());
		System.out.println("Area of Rectangle is "+s.getPermeter());
		
		s=new RtTriangle(10,10);
		System.out.println("Area of Triangle is "+s.getArea());
		System.out.println("Area of Triangle is "+s.getPermeter());

	}

}
