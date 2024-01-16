package p1;

public class Cuboid {
	private int a;
	private int b;
	private int c;
	//Default Constructor
	Cuboid()
	{
		System.out.println("Default Constructor");
		a=5;
		b=6;
		c=7;
	}
	//Parameterized Constructor
	Cuboid(int x,int y,int z)
	{
		System.out.println("Parameterized Constructor");
		a=x;
		b=y;
		c=z;
	}
	//copy constructor
	Cuboid(Cuboid obj)
	{
		System.out.println("Copy Constructor");
		a=obj.a;
		b=obj.b;
		c=obj.c;
	}
	public String toString1()
	{
String st = String.format("A=%d%n B=%d%n",a,b);
		return st;
	}
	public String toString()
	{
			String str = String.format("A=%d%nB=%d%n",a,b);
		return str;
	}

	public static void main(String[] args)
	{
		Cuboid cu=new Cuboid();
		System.out.println(cu.a+" "+cu.b+" "+cu.c+" ");
		Cuboid c=new Cuboid(9,10,11);
		System.out.println(c);
		Cuboid obj=new Cuboid(9,10,11);
		System.out.println(obj);
	}
	

}
