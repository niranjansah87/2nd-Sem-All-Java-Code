package p1;
import java.util.Comparator;
import java.util.Collections;
public class SortByArea implements Comparator<Cuboid>
{
	public int compare(Cuboid c1, Cuboid c2)
		{
			return (int)(c1.getA()-c2.getA());
		}
}
