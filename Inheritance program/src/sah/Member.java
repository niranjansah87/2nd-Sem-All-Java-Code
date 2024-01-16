package sah;

public class Member {
	protected String name;
	protected int age;
	protected long Phone_Number;
	protected String address;
	 protected float salary;
	protected String Specilization;
	Member(){
		name=" ";
		age=0;
		Phone_Number=0;
		address=" ";
		salary=0;
		Specilization=" ";
	}
	public String getName()
	{
		return name;
	}
	public String getage()
	{
		return age +" years";
	}
	public long getNum()
	{
		return Phone_Number;
	}
	public float getSal()
	{
		return salary;
	}
	public String getSpec()
	{
		return Specilization;
	}
	public String toString()
	{
		String str=String.format("Name is %s%n age is %s%n Number is %d%n Salary is %f%n Specilization is %s%n",getName(),getage(),getNum(),getSal(),getSpec());
				return str;
	}

}
