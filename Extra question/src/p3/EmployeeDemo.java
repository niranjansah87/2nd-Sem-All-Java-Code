package p3;

import java.util.Scanner;
import p1.Address;
import p2.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID,Name:");
		Employee E=new Employee(s.nextLong(),s.next());
		System.out.println("Enter the City,State,Country:");
		Address A=new Address(s.next(),s.next(),s.next());
		System.out.println(E);
		System.out.println(A);

	}

}
