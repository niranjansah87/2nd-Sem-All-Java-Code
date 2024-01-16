package Niranjan;

import java.util.Scanner;

public class Person {
	String  name;
	Birthday per;
	//Has-A relationship
	Person(String name,Birthday per)
	{
		this.name=name;
		this.per=per;
	}
	

	public static void main(String[] args) {
	
	Birthday p=new Birthday(7,11,2003);
	Person n=new Person("Niranjan",p);

	System.out.println(n.name);
	System.out.println(n.per.getD());
	System.out.println(n.per.getM());
	System.out.println(n.per.getY());
	

	}

}
