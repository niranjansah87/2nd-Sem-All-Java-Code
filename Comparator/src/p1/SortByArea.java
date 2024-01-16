package p1;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid>{
	
	public int compare(Cuboid c1, Cuboid c2)
	{
		if(c1.area()==c2.area())
			return 0;
			else if(c1.area()>c2.area())
				return 1;
			else
				return -1;
	}

}
