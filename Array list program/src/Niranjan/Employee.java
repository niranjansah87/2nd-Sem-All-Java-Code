package Niranjan;

public class Employee 
{
	
	private String id;
	private String name;
	private String gender;
	private double salary;	
	Employee()
	{
		this.id="#";
		this.name="#";
		this.gender="#";
		this.salary=0.0;		
	}
	
	Employee(String i,String n,String g,double s)
	{
			this.id=i;
			this.name=n;
			this.gender=g;
			this.salary=s;
	}
	
	private String getID()
	{
		return this.id;
	}
	
	private String getName()
	{
		return this.name;
	}
	
	private String getGender()
	{
		return this.gender;
	}

	private double getSalary()
	{
		return this.salary;
	}

	public String toString()
	{
		return String.format("%nID : %s%nName : "
				+ "%s%n"
				+ "gender : %s%n"
				+ "Salary : %f", getID(),
				getName(),getGender(),getSalary());
	}
	
}


