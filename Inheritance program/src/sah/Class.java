package sah;

public class Class extends Member {
	protected String department;
	public void setD(String dep)
	{
		department=dep;
	}
	public String getDep()
	{
		return department;
	}
	public String toString()
	{
		String s=String.format("department=%s%n", getDep());
		return s;
	}
}
