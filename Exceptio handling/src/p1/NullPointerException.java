package p1;

public class NullPointerException {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(java.lang.Exception ae)
		{
			System.out.println(ae);
		}
		System.out.println("Rest of the code will be printed");

	}

}
