package example;

import   java.util.ArrayList;
import   java.util.Collections;
import java.util.Vector;
public  class  Employee  implements Comparable<Employee>{
	int id;
	String name;
	int age;
	Employee(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		String s;
		s="Number:"+id+" "+"Name:"+name+" "+"Age:"+age;
		return s;
	}
	public int compareTo(Employee e) 
	{
		if(age == e.getAge()) 
			return 0;
		else if(age >e.getAge())
			return 1;
		else
			return -1;
		}




	public static void main(String[] args) {
		Vector<Employee> e = new Vector<Employee>();
		e.add(new Employee(456,"A",23));
		e.add(new Employee(123,"B",22));
		e.add(new Employee(345,"C",18));
		Collections.sort(e);
		for(Employee i:e) {
			System.out.println(i);
		}
	}
}

