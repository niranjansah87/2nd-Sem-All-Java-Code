package p1;
import java.util.Comparator;
import java.util.Collections;;

public class SortByLength implements Comparator<Cuboid>
{
	public int compare(Cuboid c1, Cuboid c2)
	{
		return (int)(c1.getl()-c2.getl());
	}
}
