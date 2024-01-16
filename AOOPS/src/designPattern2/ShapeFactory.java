package designPattern2;

public class ShapeFactory {

	
		public Shape getShape(String ShapeType)
		{
			if(ShapeType==null)
			{
				return null;
			}
			if(ShapeType.equalsIgnoreCase("CIRCLE"))
			{
				return new Circle();
			}
			if(ShapeType.equalsIgnoreCase("RECTANGLE"))
			{
				return new Rectangle();
			}
			if(ShapeType.equalsIgnoreCase("SQUARE"))
			{
				return new Square();
			}
			return null;
		}

	

}
