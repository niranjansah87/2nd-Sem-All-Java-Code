package Niranjan;

public class B extends A{

	B(int x,int y) {
		super(y);
		int a;
		a=x;
		
	}
	public void display()
	{
		super.display();
		System.out.println("Super class variable "+super.a);
		System.out.println("a is "+a);
	}
	public static void main(String[] args)
	{
		B obj=new B(8,10);
		obj.display();
		
				
				
				
				
				
				
				
				
				

	}

}
