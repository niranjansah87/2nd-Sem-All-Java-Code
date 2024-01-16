package Array;

public class Employee
{
private long id;
private String name;
private char gen;
private double sal;
Employee(long i,String na,char g,double s)
{
this.id=i;
this.name=na;
this.gen=g;
this.sal=s;
}
public long getid() {return this.id;}
public String getname() {return this.name;}
public char getgen() {return this.gen;}
public double getsal() {return this.sal;}
public String toString()
{
return "Id ="+getid()+"\tName="+getname()+
"\tGender="+getgen()+ "\tSalary="+getsal();
}
}
