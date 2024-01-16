package p1;

public class ArrayIndexOutofBound {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[9]=100;
		}
		catch(java.lang.Exception e)
		{
			System.out.println(e);
		}

	}

}
