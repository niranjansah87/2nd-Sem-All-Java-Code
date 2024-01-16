package p2;



public class Student {
	private int id;
	public String Name;
	public void SetName(String name)
	{
		boolean m=name.matches("[A-Z a-z]+");
		
		try {
			if(m)
			{
				
				throw new InvalidNameException(Name);
				
			}
			else
			{
				this.Name=Name;
			}
		}
		catch(InvalidNameException e){
			System.out.println(e);
		}
	}
	public void setID(int id)
	{
		try {
		if(id>0)
		{
			this.id=id;
		}
		else
		{
			throw new InvalidIDException(id);	
		}
		}
		catch(InvalidIDException e){
			System.out.println(e);
		}
		
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return Name;
	}
	public String toString()
	{
		return String.format("Name=%s%n ID=%d",getName(),getID());
	}
}
class InvalidIDException extends Exception{
	int id;
	InvalidIDException(int id)
	{
		this.id=id;
	}
	public String toString()
	{
		return "Invalid ID"+id;
	}
}
class InvalidNameException extends Exception{
	String Name;
	InvalidNameException(String Name)
	{
		this.Name=Name;
	}
	public String toString()
	{
		return "Invalid Name"+Name;
	}
}
