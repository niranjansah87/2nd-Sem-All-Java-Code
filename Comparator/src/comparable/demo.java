package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		ArrayList<Employee>e=new ArrayList<Employee>();
		e.add(new Employee(456,"Niranjan",25));
		e.add(new Employee(123,"rohit",22));
		e.add(new Employee(345,"aadarash",19));
		Collections.sort(e);
		for(Employee i:e)
		{
			System.out.println(i);
		}
	}

}
