package practice2;

import java.util.Collections;
import java.util.Vector;



public class StudentDemo {

	public static void main(String[] args) {
		Vector<Student>stud=new Vector<Student>();
		
		stud.add(new Student(90184,350));
		stud.add(new Student(90187,450));
		stud.add(new Student(90144,300));
		stud.add(new Student(90183,400));
		stud.add(new Student(90186,499));
		
		System.out.println("Sorting by mark");
		Collections.sort(stud,new SortByMark());
		for(Student s:stud)
		{
			System.out.println(s);
		}
		

	}

}
