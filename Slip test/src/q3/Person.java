package q3;

public class Person {
	protected static String fname;
	protected static String lname;
	
}
class Votor extends Person{
	private int ID,age;
	Person p;
	Votor(int ID,int age,String fname,String lname)
	{
		
		this.ID=ID;
		this.age=age;
		this.fname=fname;
		this.lname=lname;
	
	}
	public void setAge(int age)
	{
		try {
			if(age>18 && age<110)
			{
				this.age=age;
			}
			else
			{
				throw new InvalidAgeException(age);
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return String.format("First Name=%s%n Last Name=%s%n ID=%d%n Age=%d",fname,lname,ID,getAge());
	}
}
class InvalidAgeException extends Exception{
	int age;
	InvalidAgeException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "InvalidAge";
	}
}
