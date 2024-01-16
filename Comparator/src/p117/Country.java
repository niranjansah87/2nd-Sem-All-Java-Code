package p117;

public class Country {
	private String name;
	
	Country(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return String.format("Country Name %s",getName());
	}
	

}
