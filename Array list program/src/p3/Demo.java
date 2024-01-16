package p3;

import java.util.Scanner;

public class Demo                                     

{

public static void main(String args[])
{
Employee e;
Scanner  sc=new Scanner(System.in);
System.out.println("Enter id and name and address of ContractEmployee:");
int id=sc.nextInt();
String name=sc.next();
String address=sc.next();
System.out.println("enter hoursworked and hourlywage :");
int hoursworked=sc.nextInt();
int hourlywage=sc.nextInt();
e=new ContractEmployee(id,name,address,hoursworked,hourlywage);
System.out.println("salary is:"+e.computeSalary());
System.out.println("Enter id and name and address of RegularEmployee:");
id=sc.nextInt();
name=sc.next();
address=sc.next();
System.out.println(" enter basic and allowance");
int basic=sc.nextInt();
int allowance=sc.nextInt();
e=new RegularEmployee(id,name,address,basic,allowance);
System.out.println("salary is:"+e.computeSalary());
sc.close();
}
}
