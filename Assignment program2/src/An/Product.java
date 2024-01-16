package An;

public class Product {
	private String id;
	private String name;
	private int Quantity;
	private int price;
	public void setN(String N)
	{
		id=N;
	}
	public void setC(String C)
	{
		name=C;
	}
	public void setP(int p)
	{
		Quantity=p;
	}
	public boolean setL(int l)
	{
		if(l>0)
		{
			price=l;
			return true;
		}
		
		return false;
	}
	public String getN()
	{
		return id;
	}
	public String getC()
	{
		return name;
	}
	public String getP()
	{
		return Quantity+" kg";
	}
	public String getL()
	{
		return "Rs "+price;
	}
	public String Total()
	{
		int total=Quantity*price;
		return "Rs "+total;
	}
	public String toString()
	{
		String s=String.format("ID IS =%s%n NAME IS =%s%n Quantity =%s%n Price is =%s%n Amount to be paid=%s%n",getN(),getC(),getP(),getL(),Total());
		return s;
	}

}
