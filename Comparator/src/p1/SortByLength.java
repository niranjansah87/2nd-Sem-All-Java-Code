package p1;

import java.util.Comparator;
public class SortByLength implements Comparator<Cuboid>{
	@Override
	public int compare(Cuboid c1, Cuboid c2) {
		if(c1.getL()==c2.getL())
			return 0;
			else if(c1.getL()>c2.getL())
				return 1;
			else
				return -1;
	}
}
