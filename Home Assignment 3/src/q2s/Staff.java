package q2s;

import java.util.Scanner;

abstract class Staff{ 
 static String name;
 static int id;
static int salary;
 Staff(int id,String name, int salary){
	this.id=id;
	this.name=name;
	this.salary = salary;
}
public int getid() {
return id;
}
 
public String getname() {
return name;
}
public int getSalary() {
 return salary;
}

public String toString() 
{ 
return this.id+"\t"+this.name+"\t\t" +this.salary;
}
abstract double computesalary();
}

class teachingStaff extends Staff{
	int basic;
	int allowance;
	 teachingStaff(int id,String Name,int basic, int allowance) {
		super(id, name, salary);
		this.basic=basic;
		this.allowance=allowance;
	}
	
	double computesalary() {
  
  
   return salary= basic +(20 % basic) + allowance;
	}
 public void display(){
  System.out.println("Name: "+name);
  System.out.println("id: "+id);
  System.out.println("Salary: "+salary);
  System.out.println("basic: "+basic);
  System.out.println("allowance: "+allowance);
  
	
}
}
class nonteachingStaff extends Staff{
	int  hoursWorked;
	int hourlyWage;
	nonteachingStaff(int id,String Name,int hour,int wage) {
		super(id, name, salary);
		hoursWorked=hour;
		hourlyWage=wage;
		
	}
	
	double computesalary() {
		
  
  return salary=hoursWorked*hourlyWage;
 }
 public void display(){
  System.out.println("Name: "+name);
  System.out.println("id: "+id);
  System.out.println("No of Working Hours: "+hoursWorked);
  System.out.println("Rate per hour: "+hourlyWage );
  System.out.println("----------------------");
 }
}
