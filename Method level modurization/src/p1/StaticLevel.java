package p1;

public class StaticLevel {
	private static  int x;
	public void input(int a)
	{
		x=a;
	}
	public static void output()
	{
		System.out.println("X value is "+x);
	}
	public static void main(String[] args)
	{
		MethodLevel s=new MethodLevel();
		s.input(10);
		s.output();
	}

}


