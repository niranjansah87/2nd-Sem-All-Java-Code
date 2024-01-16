package p1;

public class Student {

	private int id,age;
	private String gen,name;
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setgen(String gen)
	{
		this.gen=gen;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public boolean checkid(int aa)
	{
		if(id==aa)
		return true;
		else
			return false;
		
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public String getgen()
	{
		return gen;
	}
	public int getage()
	{
		return age;
	}
	public void display()
	{
		System.out.println(String.format("id=%d\n name=%s\n gender=%s\n age=%d%n",getid(),getname(),getgen(),getage()));
	}
	

}
