package practice2;

import java.util.Comparator;

public class SortByMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.mark==o2.mark)
			return 0;
		else if(o1.mark>o2.mark)
			return 1;
		else
			return -1;
	}

}
