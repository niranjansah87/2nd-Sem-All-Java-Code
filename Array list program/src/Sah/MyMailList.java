package Sah;

public class MyMailList {
	private String name;
	private String mailId;
	MyMailList(String name,String mailId)
	{
		this.name=name;
		this.mailId=mailId;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return mailId;
	}
	public String toString()
	{
		return String.format("Name=%s%n mailId=%s%n", getName(),getID());
	}

}
