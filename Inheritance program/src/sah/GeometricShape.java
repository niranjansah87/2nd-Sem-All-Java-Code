package sah;

 class GeometricShape {
	protected String borderColor;
	protected boolean filled;
	GeometricShape()
	{
		borderColor="Black";
		filled=false;
	}
	
	GeometricShape(String c,boolean f)
	{
		borderColor="red";
		filled=f;
	}
	public String getBorderColor()
	{
		return borderColor;
	}
	public boolean getFilled()
	{
		return filled;
	}
}
