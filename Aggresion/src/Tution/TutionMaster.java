package Tution;

public class TutionMaster {
	private String Name;
	private String Course;
	private long Salary;
	private int noofhour;
	
	public void setNam(String Name)
	{
		this.Name=Name;
	}
	public void setCo(String Course)
	{
		this.Course=Course;
	}
	public void setSal(int Salary)
	{
		this.Salary=Salary;
	}
	public void sethour(int noofhour)
	{
		this.noofhour=noofhour;
	}
	public String getName()
	{
		return Name;
	}
	public String getCo()
	{
		return Course;
	}
	public long getSal()
	{
		return Salary;
	}
	public int getnoofhour()
	{
		return noofhour;
	}
	public String TotalSalary()
	{
		return "Rs "+Salary*noofhour;
	}
	public String toString()
	{
		return String.format("Name=%s%n Course=%s%n Salary=%d%n No of hour=%d%n Total Amount to be paid=%s%n",getName(),getCo(),getSal(),getnoofhour(),TotalSalary());
	}
	

}
