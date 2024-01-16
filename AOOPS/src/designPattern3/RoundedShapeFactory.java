package designPattern3;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String ShapeType) {
		if(ShapeType.equalsIgnoreCase("Rounded Rectangle"))
		{
			return new RoundedRectangle();
		}
		if(ShapeType.equalsIgnoreCase("Rounded Square"))
		{
			return new RoundedSquare();
		}
		return null;
	}

}
