package practice;

import java.util.Collections;
import java.util.Vector;

public class Student implements Comparable<Student>{
	String ID;
	int mark;
	Student(String ID,int mark)
	{
		this.ID=ID;
		this.mark=mark;
	}
	public String getID()
	{
		return ID;
	}
	public int getMark()
	{
		return mark;
	}
	public String toString()
	{
		return String.format("ID=%s mark=%d",getID(),getMark());
	}
	public static void main(String[] args) {
		Vector<Student>stud=new Vector<Student>();
		
		stud.add(new Student("2100090184",350));
		stud.add(new Student("2100090187",450));
		stud.add(new Student("2100090144",300));
		stud.add(new Student("2100090183",400));
		stud.add(new Student("2100090186",499));
		
		System.out.println("Sorting by mark");
		Collections.sort(stud);
		for(Student s:stud)
		{
			System.out.println(s);
		}
		

}
	@Override
	public int compareTo(Student o) {
		if(mark==o.getMark())
			return 0;
		else if(mark>o.getMark())
			return 1;
		else
			return -1;
	}
}
