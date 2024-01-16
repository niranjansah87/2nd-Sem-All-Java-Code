package p1;

public class MethodLevel {
	private static int x;
	public static void input(int a)
	{
		x=a;
	}
	public static void output()
	{
		System.out.println("X value is "+x);
	}
	public static void main(String[] args)
	{
		MethodLevel.input(10);
		MethodLevel.output();
	}

}
