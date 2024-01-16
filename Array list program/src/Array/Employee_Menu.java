package Array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Employee_Menu
{
public static Scanner sr=new Scanner(System.in);
public static void main(String[] args)
{

	ArrayList<Employee> al= new ArrayList<Employee>();

	while(true)
	{

		System.out.println("\n***Main Menu***");

		System.out.println("1) Add Employee ");

		System.out.println("2) Display all Employee");

		System.out.println("3) Sort wrt salary");

		System.out.println("4) Exit");

		System.out.println("Enter your choice");

		int cho=sr.nextInt();

		switch(cho)
{

case 1:System.out.println("Enter an employee detail");
	Employee e=new Employee(sr.nextLong(), sr.next(),
			sr.next().charAt(0), sr.nextDouble());
	al.add(e);
break;
case 2:System.out.println("The lsit of Employee are:");
for(int i=0;i<al.size();i++)
System.out.println(al.get(i));
break;
case 3:
	System.out.println("The sorted lsit based on salary:");
	Collections.sort(al, new SortbySalary());
for(int i=0;i<al.size();i++)
System.out.println(al.get(i));
}
}
}
}                            
