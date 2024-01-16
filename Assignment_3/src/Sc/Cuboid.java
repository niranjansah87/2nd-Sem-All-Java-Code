package Sc;

public class Cuboid {
	 static double length;
	 static double breadth;
	 static double height;
	 static double l;
	 static double b;
	 static double h;
	
	public double Volume()
	{
		return length*breadth*height;
	}
	public String toString()
	{
		String s=String.format("Volume =%s%n ",Volume());
		return s;
		
	}
	public static void main(String[] args)
	{
		Cuboid c=new Cuboid();
		for(int i=0;i<args.length;i++)
		 length=Double.parseDouble(args[0]);
		 breadth=Double.parseDouble(args[1]);
		 height=Double.parseDouble(args[2]);
		 l=Double.parseDouble(args[3]);
		 b=Double.parseDouble(args[4]);
		 h=Double.parseDouble(args[5]);
		  double volume= l*b*h;
		 
		             System.out.println("Volume Of Cuboid is:" +volume);
		             System.out.println(c);
		             
	}
	
	

}
