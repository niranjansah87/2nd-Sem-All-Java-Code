package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mobile {
	private String brand,model;
	private int price;
	Mobile(String brand,String model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public String toString()
	{
		return String.format("Brand=%s Model=%s Price=%d",brand,model,price);
	}
	public static void main(String[] args)
	{
		ArrayList<Mobile>m=new ArrayList<Mobile>();
		m.add(new Mobile("Samsung","S 20 Ultra",80000));
		m.add(new Mobile("Xiomi","redmi 10",20000));
		m.add(new Mobile("Oppo","F 20 Ultra",30000));
		m.add(new Mobile("Vivo","V 20",15000));
		Collections.sort(m,new SortbyBrand());
		System.out.println("Sort by Brand\n");
		for(Mobile mo:m)
		{
			System.out.println(mo);
		}
		Collections.sort(m,new sortBymodel());
		System.out.println("\nSort by Model\n");
		for(Mobile s:m)
		{
			System.out.println(s);
		}
	}
	
	
	

}
class SortbyBrand implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		if(o1.getBrand()==o2.getBrand())
		return 0;
		else if(o1.getBrand()==o2.getBrand())
			return 1;
		else
			return -1;
	}
	
}
class sortBymodel implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		if(o1.getModel()==o2.getModel())
			return 0;
			else if(o1.getModel()==o2.getModel())
				return 1;
			else
				return -1;
	}
	
}

