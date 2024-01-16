package NJ;

public class State {
	private String name;
	private String Capital;
	private long Population;
	private int Literacy;
	public void setN(String N)
	{
		name=N;
	}
	public void setC(String C)
	{
			Capital=C;
	}
	public void setP(long p)
	{
		Population=p;
	}
	public void setL(int l)
	{
		Literacy=l;
	}
	public String getN()
	{
		return name;
	}
	public String getC()
	{
		return Capital;
	}
	public long getP()
	{
		return Population;
	}
	public int getL()
	{
		return Literacy;
	}
	public String toString()
	{
		String s=String.format("Name of State=%s%n Capital of State=%s%n Population=%d%n Literacy Rate=%d%n"+getN(),getC(),getP(),getL());
		return s;
	}

}
