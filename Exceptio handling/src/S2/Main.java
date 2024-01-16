package S2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;



public class Main {
	public static Vector<Student> stud=new Vector<Student>();

	public static void main(String[] args) {
		stud.add(new Student(90187,70,88,89,78));
		stud.add(new Student(90185,82,64,52,49));
		stud.add(new Student(90184,85,96,40,20));
		stud.add(new Student(90183,71,60,80,68));
		Collections.sort(stud, new SortByID());
		System.out.println("Student Detail based on ID");
		for(Student cu:stud)
		{
			System.out.println(cu);
		}

	}


	

}
/*class SortByID implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
	}
	
}*/
