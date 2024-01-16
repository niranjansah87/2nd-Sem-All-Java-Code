
public class Cost {
	 float wei;
	private float Cost;
	public String findCost()
	{
		if(wei>0 && wei<=1)
			Cost=2.5f;
		else if(wei>1 && wei<=3)
			Cost=5.5f;
		else if(wei>3 && wei<=10)
			Cost=8.5f;
		else if(wei>10&& wei<=20)
			Cost= 10.5f;
		else if(wei>20)
		{
			Cost=50f;
		}
		return "RS "+ (Cost*wei);	
	}
	public String toString()
	{
		String str=String.format("Cost is %s%n",findCost());
		return str;
	}
	
}

