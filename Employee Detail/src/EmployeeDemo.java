import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Employee detail:");
		Scanner s=new Scanner(System.in);
		Employee z= new Employee();
		z.setEname(s.next());
	    z.setEdesign(s.next());
	    z.setCom(s.next());
	    z.setInc(s.nextInt());
	    System.out.println(z);
	}


	}


