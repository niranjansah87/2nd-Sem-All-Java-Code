package p1;

public class BMI {
	private String Name;
	private float wei,hei;
	public void setName(String name) 
	{
		Name = name;
	}
	public void setW(float weight)
	{
		wei=weight;
	}
	public void setH(float height)
	{
		hei=height;
	}
	public String getName() {
		return Name;
	}
	public String getW()
	{
		return wei+" kg";
	}
	public String getH()
	{
		return hei+" m";
	}
	public String BMI()
	{
		return (float) (wei/Math.pow(hei,2))+" kg/m";
	}
	public String toString()
	{
		String str=String.format("Name=%s%n Weight=%s%n Height=%s%n BMI=%s%n",getName(),getW(),getH(),BMI());
		return str;
	}
	
	

}
