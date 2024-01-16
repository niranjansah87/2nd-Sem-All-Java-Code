package Niranjan;

public class Triangle {
	private  double b,h;
	Triangle(double x,double y)
	{
		b=x;
		h=y;
	}
	public String area()
	{
		return (b*h)/2 +"m";
	}
	public String toString()
	{
        String str = String.format("Base=%s%n Height=%s%n Area=%s%n",b,h,area());
		return str;
	}


}
