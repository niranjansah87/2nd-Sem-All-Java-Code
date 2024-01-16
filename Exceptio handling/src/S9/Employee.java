package S9;

public class Employee {
	private String ID;
	private String PAN;
	public void setID(String ID)
	{
		
		this.ID=ID;
	}
	public void setPAN(String PAN)
	{
		try {
			if(PAN.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}+"))
			{
				this.PAN=PAN;
			}
			else
			{
				throw new InvalidPAN(PAN);
			}
		}
		catch(InvalidPAN e)
		{
			System.out.println(e);
		}
	}
	public String getID()
	{
		return ID;
	}
	public String getPAN()
	{
		return PAN;
	}
	public String toString()
	{
		return String.format("ID=%s%n PAN=%s%n",getID(),getPAN());
	}

}
