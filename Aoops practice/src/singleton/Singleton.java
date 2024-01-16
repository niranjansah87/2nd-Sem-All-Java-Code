package singleton;

public class Singleton {
	private static Singleton instance=new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return instance;
	}
	public void showMessage()
	{
		System.out.println("Hello world!");
		
	}
	public static void main(String[] args)
	{
		Singleton o1=Singleton.getInstance();
		o1.showMessage();
	}
	

}
