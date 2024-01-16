package p3;


import java.util.Scanner;
abstract class Employee                          
{
public int id;
public String name;
public String address;
Employee(int id,String name,String address)
{
this.id=id;
this.name=name;
this.address=address;
}
public abstract double computeSalary();
}
class ContractEmployee extends Employee                       

{
 private int hoursworked;
 private int hourlywage;
 ContractEmployee(int id,String name,String address,int hoursworked,int hourlywage)
 {
super(id,name,address);
this.hoursworked=hoursworked;
this.hourlywage=hourlywage;
 }
 public  double computeSalary()
 {
return hoursworked*hourlywage;
 }
}
class RegularEmployee extends Employee                      
{

public int basic;
public int allowance;
RegularEmployee(int id,String name,String address,int basic,int allowance)
{
super(id,name,address);
this.basic=basic;
this.allowance=allowance;
}
public  double computeSalary()
{
return basic+ (basic*20/100)+allowance;
}
}


