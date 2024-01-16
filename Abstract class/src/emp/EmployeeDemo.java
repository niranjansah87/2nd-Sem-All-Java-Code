package emp;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Employee e;
		//System.out.println("Enter the ID,name,basic pay,year of experience,Ira,");
		RegularEmployee e=new RegularEmployee(2100090187,"Niranjan",5000,6);
		//e=new RegularEmployee(s.nextLong(),s.next(),s.nextInt(),s.nextInt());
		System.out.println("=====================Employee All Detail==============");
		System.out.println("Employee Id is "+e.Id);
		System.out.println("Employee Name is "+e.name);
		System.out.println("Basic pay "+e.basicpay);
		System.out.println("IRA Is is "+e.ira);
		System.out.println("Year of Experience is "+e.yoe+" Years");
		System.out.println("Salary is "+e.edoulateSalary());
		System.out.println("========================================================");
		
		

	}

}
