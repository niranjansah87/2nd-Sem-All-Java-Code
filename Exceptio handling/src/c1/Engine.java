package c1;



public class Engine {
	private int engineID;
	private String engineType;
	private int horsePower;
	private float engineWeight;
	
	public void setID(int id)
	{
		//autoboxing
		Integer obj=id;
		String str=obj.toString();
		int len=str.length();
		try {
		if(len==5)
		{
			engineID=id;
		}
		else
		{
			throw new InvalidID(engineID);
		}
		}
		catch(InvalidID e){
			System.out.println(e);
		}
	}
	public void setType(String type)
	{
		boolean m=type.matches("[A-Z a-z]+");
		int len=type.length();
		try {
			if(len==5 && m)
			{
				engineType=type;
				
			}
			else
			{
				throw new InvalidType(engineType);
			}
		}
		catch(InvalidType e){
			System.out.println(e);
		}
		
	}
	public void setPower(int pow)
	{
		try {
			if(pow<1000)
			{
				throw new InvalidPower(horsePower);
			}
			else
			{
				horsePower=pow;
			}
		}
		catch(InvalidPower d)
		{
			System.out.println(d);
		}
	}
	public void setWeight(float Wei)
	{
		try {
			if(Wei<1000)
			{
				throw new InvalidWeight(engineWeight);
			}
			else
			{
				engineWeight=Wei;
			}
		}
		catch(InvalidWeight dp)
		{
			System.out.println(dp);
		}
	}
	public int getID()
	{
		return engineID;
	}
	public String getType()
	{
		return engineType;
	}
	public int getPower()
	{
		return horsePower;
	}
	public float getWeight()
	{
		return engineWeight;
	}
	
	public String toString()
	{
		return String.format("Engine ID=%d%n engineType=%s%n Horsepower=%d%n Engine Weight=%f kg",getID(),getType(),getPower(),getWeight());
	}
}
