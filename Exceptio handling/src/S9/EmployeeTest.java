package S9;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter the ID");
		e.setID(s.next());
		System.out.println("Enter the PAN");
		e.setPAN(s.next());
		System.out.println(e);

	}

}
