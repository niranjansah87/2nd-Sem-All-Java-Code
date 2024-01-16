package S2;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getID()>o2.getID())
			return 1;
			else if(o1.getID()==o2.getID())
			return 0;
			else
				return -1;
	}

}
