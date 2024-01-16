package Stu;

import java.util.Scanner;

public class Employee {
		int ID;
		String Name;
		static Address Add;
		Employee(int ID,String Name,Address Add)
		{
			this.ID=ID;
			this.Name=Name;
			Employee.Add=Add;
		}
		public int getID()
		 {
			 return ID;
			 
		 }
		 public String getName()
		 {
			 return Name;
		 }
		 public String toString()
		 {
			 return String.format("ID=%d%n Name=%s%n",getID(),getName());
		 }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the City,State,Country");
		Address a=new Address(s.nextLine(),s.nextLine(),s.nextLine());
		System.out.println("Enter ID and name");
		Employee e=new Employee(s.nextInt(),s.nextLine(),Add);
		
		
		
		System.out.println(">>>>>>>>Personal Detail>>>>>>>>");
		System.out.println(a);
		System.out.println(">>>>>>>>Address Detail>>>>>>>>");
		System.out.println(e);
		
		
		

	}

}
