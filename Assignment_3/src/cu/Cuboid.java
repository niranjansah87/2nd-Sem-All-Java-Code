package cu;

public class Cuboid {
	private double length;
	private double breadth;
	private double height;
	
	public boolean setL(double L) {
	if(L>0)
	{
		length=L;
		return true;
	}
	return false;
	}
	public boolean setB(double B) {
		if(B>0)
		{
			breadth=B;
			return true;
		}
		return false;
		}
	public boolean setH(double H) {
		if(H>0)
		{
			height=H;
			return true;
		}
		return false;
		}
	public String getL()
	{
		return length+" m";
	}
	public String getB()
	{
		return breadth+" m";
	}
	public String getH()
	{
		return height+" m";
	}
	public String Volume()
	{
		return length*breadth*height+" cu.m";
	}
	public String toString()
	{
		String s=String.format("Length =%s%n Breadth=%s%n Height=%s%n Volume=%s%n ",getL(),getB(),getH(),Volume());
		return s;
		
	}

}
