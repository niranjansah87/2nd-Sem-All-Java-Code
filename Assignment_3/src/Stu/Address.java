package Stu;

public class Address {
	private String City;
	private String State;
	private String Country;
	
	Address(String City,String State,String Country)
	{
		this.City=City;
		this.State=State;
		this.Country=Country;
	}
	public String getCity()
	{
		return City;
	}
	public String getState()
	{
		return State;
	}
	public String getCountry()
	{
		return Country;
	}
	public String toString()
	{
		String s=String.format("City=%s%n State=%s%n Country=%s%n", getCity(),getState(),getCountry());
		return s;
	}
}
