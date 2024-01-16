package iNSURANCE;
public class InsuranceCom {
	private String ID,Name;
	private int pamount,noofinstall;
	public void setA(String cid)
	{
		ID=cid;
	}
	public void setB(String cname)
	{
		Name=cname;
	}
	public boolean setC(int premium)
	{
		if(premium==1000 || premium==5000 || premium==25000)
		{
			pamount=premium;
			return true;
		}
		System.out.println("Invalid input");
		return false;
	}
	public boolean setD(int install)
	{
		if(install>1 && install<20 )
		{
			noofinstall=install;
			return true;
		}
		System.out.println("Invalid input");
		return false;
	}
	public String getA()
	{
		return ID;
	}
	public String getB()
	{
		return Name;
	}
	public String getC()
	{
		return "Rs"+pamount;
	}
	public String getD()
	{
		return noofinstall+ " Times";
	}
	public String toString()
	{
		String str=String.format("Customer ID:%s%n Customer Name:%s%n Premium amount:%s%n No of installments:%s%n ",getA(),getB(),getC(),getD());
		return str;
	}

}