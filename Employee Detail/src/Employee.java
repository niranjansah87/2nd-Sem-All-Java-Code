
public class Employee {
private String ename,edesign,comname;
private int inc;
public void setEname(String name)
{
	ename = name;
}
public void setEdesign(String designation)
{
	edesign = designation;
}
public void setCom(String company)
{
	comname = company;
}
public void setInc(int sal)
{
	inc = sal;
}
public String getEname() {
	return ename;
}
public String getEdesign() {
	return edesign;
}
public String getCom() {
	return comname;
}
public int getInc()
{
	return inc;
}
public String toString()																											
{
	String str=String.format("Employee name:%s%n Designation:%s%n Company name:%s%n Income:%s%n",getEname(),getEdesign(),getCom(),getInc());
	return str;					
}
}
