package designPattern3;



public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String ShapeType) {
		if(ShapeType==null)
		{
			return null;
		}
		if(ShapeType.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		if(ShapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
				return null;
	}

}
