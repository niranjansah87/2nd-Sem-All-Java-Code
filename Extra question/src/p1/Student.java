package p1;

import java.util.Scanner;
public class Student {
private static Student arr[] = new Student[50];
private static Scanner s;
private static int count;
private static void initialize() 
{
s = new Scanner(System.in);
}
private static void addStudent()
{
if(count<arr.length)
{
System.out.println("Enter Student ID:");
long tid = s.nextLong();
System.out.println("Enter Student Name:");
String tna = s.nextLine(); 
System.out.println("Enter Student Gender: Male/Female");
String g = s.nextLine(); 
System.out.println("Enter Student Age: ");
int age = s.nextInt(); 
Student st = new Student();
if(st.setStudent(tid,tna,g,age))
{
arr[count++]=st;
}
}
else
System.out.println("Cannot create Student");
}

private static int menuSelection()
{
System.out.println("------------------Students Detail Menu-------------");
System.out.println("1. Add new Student");
System.out.println("2. Print All Student");
System.out.println("3. Search Student based on ID");
System.out.println("4. Exit ");
System.out.println("Enter U r choice");
String str = s.nextLine();
int r = Integer.parseInt(str);
return r;
}
private static void searchID()
{
System.out.println("Enter Student ID number :");
String Sid = s.nextLine();
for(int i=0;i<count;i++)
{
System.out.println(i);
if(arr[i].getID().equals(Sid))
{
System.out.println(arr[i]);
break;
}
}
}
private static void displayAllStudent()
{
System.out.println("All Student Details");
for(int i=0;i<count;i++)
{
System.out.println(arr[i]);
}
}
public static void main(String[] args) 
{
boolean repeat = true;
int choice;initialize();
while(repeat)
{
choice=menuSelection();
switch(choice)
{
case 1: 
addStudent(); 
break;
case 2: 
	System.out.println(count);
	displayAllStudent();  
break;
case 3:
searchID();
break;
case 4: 
System.exit(0); 
break;
default: 
repeat=false;
}
}
}
}
class Employee 
{
private int id;
private String name;
private String gender;
private int age;
Employee()
{
this.id=0;
this.name="#";
this.gender="#";
this.age=0;
}
Student(int i,String n,String g,int a)
{
if(setID(i))
this.id=i;
else
this.id=0;
if(setName(n))
this.name=n;
else
this.name="#";
if(setGender(g))
this.gender=g;
else
this.gender="#";
if(setAge(a))
	this.age=a;
else
	this.age=0;
}

public long getID()
{
return this.id;
}
private String getName()
{
return this.name;
}
public String getGender()
{
return this.gender;
}
public int getAge()
{
	return this.age;
}

private void setName(String s)
{
name=s;
}
private boolean setID(int i)
{
if(i>0)
{
this.id=i;
return true;
}
return false;
}
private boolean setAge(int a) {
	if(a>0)
	{
		age=a;
		return true;
	}
	return false;
}
private boolean setGender(String g) 
{
	if(g.equals("Male")||g.equals("Female"))
	{
		gender=g;
		return true;
	}
	

	return false;
}
public boolean setStudent(String tid2,
String tna,String td,int a)
{
int tid = Integer.parseInt(tid2);

if(setID (tid) && setName(tna) && setGender(g) && setAge(a))
{
	this.id=tid;
	this.name=tna;
    this.gender=g;
this.age=a;
return true;
}
return false;
}

public String toString()
{
return String.format("%n-----------Student Details---------:%n"
+ "Student ID : %d%nStudent Name : "
+ "%s%n"
+ "Student Gender : %s%n"+"Student Age:%s", getID(),
getName(),getGender(),getAge());
}
}
