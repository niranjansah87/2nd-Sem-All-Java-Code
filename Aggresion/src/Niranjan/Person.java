package Niranjan;

import java.util.Scanner;

public class Person {
	String  name;
	PerDay per;
	//Has-A relationship
	Person(String name,PerDay per)
	{
		this.name=name;
		this.per=per;
	}
	

	public static void main(String[] args) {
	
	PerDay p=new PerDay(7,11,2003);
	Person n=new Person("Niranjan",p);

	System.out.println(n.name);
	System.out.println(n.per.getD());
	System.out.println(n.per.getM());
	System.out.println(n.per.getY());
	

	}

}
