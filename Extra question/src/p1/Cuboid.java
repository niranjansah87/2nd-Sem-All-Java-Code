package p1;

public class Cuboid {
	double length;
	double breadth;
	double height;
	
	public Cuboid(double l, double b, double h) {
		length=l;
	 breadth=b;
		height=h;
	}

	public String volume()
	{
		return length*breadth*height +"m";
	}
	public String toString()
	{
String str = String.format("Length=%s%nBreadth=%s%nHeight=%s%nVolume=%s%n",length,breadth,height,volume());
		return str;
	}

}
