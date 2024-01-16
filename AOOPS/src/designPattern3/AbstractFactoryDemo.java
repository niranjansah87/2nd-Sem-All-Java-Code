package designPattern3;



public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory(false);
		Shape shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("Square");
		shape2.draw();
		AbstractFactory shapeFactory1=FactoryProducer.getFactory(true);
		Shape shape3=shapeFactory1.getShape("Rounded Rectangle");
		shape3.draw();
		Shape shape4=shapeFactory1.getShape("Rounded Square");
		shape4.draw();

	}

}
