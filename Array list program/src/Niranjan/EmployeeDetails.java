package Niranjan;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails
{
	
	private static ArrayList<Employee> al= 
					new ArrayList<Employee>();
	
	public static void main(String[] args) 
	{
		boolean repeat = true;
		Scanner s = new Scanner(System.in);		
		while(repeat)
		{
			System.out.println("Empolyee Database");
			System.out.println("1. Create an New "
					+ "Employee record");
			System.out.println("2. Print All Employees");
			System.out.println("3. Exit Employees "
					+ "Database");		
			System.out.println("Enter U r choice");
			switch(s.nextInt())
			{
			case 1: 
				System.out.println("Enter Employee ID,"
						+ "Employee Name\n, Employee "
						+ "Gender, Employee Salary:");

				Employee st = new Employee(
						s.nextLine(),
						s.nextLine(), s.nextLine(),
						s.nextDouble());

				al.add(st);
				break;
			
			case 2: 
				System.out.println("All Employee "
						+ "Details");
				for(Employee e: al)
					System.out.println(e);
				break;
			
			default: 
				repeat=false;
			}
		}
	}

}

