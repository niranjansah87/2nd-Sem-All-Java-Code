package q2s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Employee {
	public static ArrayList<Employee>emp=new ArrayList<Employee>();
	public static Scanner s=new Scanner(System.in);
	private int ID,salary;
	private String gender,name;
	Employee(int ID,String name,String gender,int salary)
	{
		this.ID=ID;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return String.format("ID=%d Name=%s gender=%s Salary=%d",ID,name,gender,salary);
	}
	
	public static int menuOption()
	{
		System.out.println("*****************Menu****************");
		System.out.println("1.Add new Employee");
		System.out.println("2.Print all");
		System.out.println("3.Sort By salary");
		System.out.println("4.Exit");
		return s.nextInt();
	}
	public static void main(String[] args)
	{
		int ch;
		
		while(true)
		{
		ch=menuOption();
		switch(ch)
		{
		case 1:emp.add(addNewEmployee());
		break;
		
		case 2:
			System.out.println("All Employee Detail");
			for(Employee ds:emp)
			{
				System.out.println(ds);
			}
		break;
		
		case 3:
			System.out.println("Sort by Salary");
			Collections.sort(emp,new SortBySalary());
			for(Employee a:emp)
			{
				System.out.println(a);
			}
		}
		}
		
	}
	private static Employee addNewEmployee() {
		System.out.println("Enter the ID,Name,Gender,Salary");
		return new Employee(s.nextInt(),s.next(),s.next(),s.nextInt());
	}
	

}
class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()==o2.getSalary())
		return 0;
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		else
			return -1;
	}

}
