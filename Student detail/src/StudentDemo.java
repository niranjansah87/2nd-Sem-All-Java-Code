import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args)
	{
	Student st =new Student();
     Scanner s=new Scanner(System.in);
	System.out.println("Enter the id number=");
	    st.setA(s.nextLong());
	    System.out.println("Enter the phone number=");
	    st.setB(s.nextLong());
	    System.out.println("Enter the name=");
	    st.setC(s.next());
	    System.out.println(st);
	}
}
