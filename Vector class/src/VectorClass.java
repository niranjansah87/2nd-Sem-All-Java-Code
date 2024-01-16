import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer>t=new Vector<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		for(Integer obj:t)
		{
			System.out.println(obj);
		}
		System.out.println("After Removal");
		t.remove(2);
		Iterator<Integer>obj=t.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		t.set(2,90);
		System.out.println("After updation");
		for(Integer tmp:t)
		{
			System.out.println(tmp);
		}
		t.add(3,40);
		System.out.println("After Insertion");
		for(Integer tmp:t)
		{
			System.out.println(tmp);
		}
		t.firstElement();
		t.lastElement();
		for(int i=0;i<t.size();i++)
		{
			System.out.println(t.get(i));
		}
		

	}

}
