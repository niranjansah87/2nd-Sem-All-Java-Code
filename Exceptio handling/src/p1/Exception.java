package p1;

public class Exception {

	public static void main(String[] args) {
		int a=35,b=6,c=6,result;
		try
		{
			result=a/(b-c);
			System.out.println("Result is"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Rest of the code will be printed");

	}

}
