package level;
 class CabApp {
	private String name;
    private int num;
    private double distance;
    public void setA(String pname)
    {
    	name=pname;
    }
    public void setB(int phone)
    {
    	num=phone;
    }
    public double setC(double d)
    	{
    	return distance=d;	
    	}
    
    public String getA()
    {
    	return name;
    }
    public int getB()
    {
    	return num;
    }
    public String getC()
    {
    	return distance+"km";
    }
    public String fare()
    {
    	return "Rs"+ distance*10;
    }
    public String toString()																											
	 {
	 	String str=String.format("name:%s%n num:%s%n distance:%d%n fare:%s%n",getA(),getB(),getC(),fare());
	 	return str;					
	 }
}
