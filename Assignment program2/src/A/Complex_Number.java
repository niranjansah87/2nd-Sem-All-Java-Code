package A;


public class Complex_Number {
	private int real;
	private int img;
	Complex_Number(int r,int I)
	{
		
	real=r;
	img=I;	
	}
	Complex_Number(Complex_Number n)
	{
		
	real=n.real;
	img=n.img;	
	}
	public static void main(String[] args) {
		Complex_Number n=new Complex_Number(5,6);
		System.out.println("Real number is "+n.real);
		System.out.println("Imaginary number is "+n.img);
	}
	

}