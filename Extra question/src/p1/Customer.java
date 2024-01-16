package p1;

public class Customer {
	private String name;
    private long num;
    private int distance;
    public void setA(String pname)
    {
    	name=pname;
    }
    public void setB(long phone)
    {
    	num=phone;
    }
    public boolean setC(int d)
    	{
    	if(d>0)
    	{
    		distance=d;
    		return true;
    	}
    	return false; 	
    	}
    
    public String getA()
    {
    	return name;
    }
    public long getB()
    {
    	return num;
    }
    public String getC()
    {
    	return distance+"km";
    }
    public String fare()
    {
    	return "Rs "+ distance*20;
    }
    public String toString()																											
	 {
	 	String str=String.format("Name:%s%n Number:%d%n Distance:%s%n Fare:%s%n",getA(),getB(),getC(),fare());
	 	return str;					
	 }

}
