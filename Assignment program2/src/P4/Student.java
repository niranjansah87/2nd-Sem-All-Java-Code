package P4;

public class Student {
	private String ID;
	private String Name;
	private String gender;
	private String age;
	Student(String id,String name,String gend,String a){
		ID=id;
		Name=name;
		gender=gend;
		age=a;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return Name;
	}
	public String getG()
	{
		return gender;
	}
	public String getage()
	{
		return age;
	}
	public String toString()
	{
		String s=String.format("Student ID=%s%n Student Name=%s%n Gender=%s%n Age=%s%n",getID(),getName(),getG(),getage());
		return s;
		
	}

}
