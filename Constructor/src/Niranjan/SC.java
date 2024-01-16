package Niranjan;

public class SC {
	private  int a,b;
	SC(int x, int y)
	{
		a=x;
		b=y;
	}
	public String Area(){
		return a*b+"m";
	}
	
	public String toString()
	{
String str = String.format("A=%d%nB=%d%nArea=%s%n",a,b,Area());
		return str;
	}

}
