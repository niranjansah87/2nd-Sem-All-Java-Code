package St;

import java.util.Scanner;

public class Student {
	private String ID;
	private String Name;
	private String Gender;
	private String Branch;
	
	public void setID(String ID)
	{
		this.ID=ID;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public boolean setGender(String Gender)
	{
		if(Gender.matches("[Male]+") || Gender.matches("[Female]+"))
		{
			this.Gender=Gender;
			return true;
		}
		return false;
	}
	public boolean setBranch(String Branch)
	{
		if(Gender.equals("[ECE]+") || Gender.equals("[CSE]+")|| Gender.equals("[ME]+")|| Gender.equals("[CS&IT]+")|| Gender.equals("[EEE]+")|| Gender.equals("[CE]+")|| Gender.equals("[BT]+")|| Gender.equals("[IOT]+"))
		{
			this.Branch=Branch;
			return true;
		}
		
		return false;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return Name;
	}
	public String getGENDER()
	{
		return Gender;
	}
	public String getBranch()
	{
		return Branch;
	}
	public String toString()
	{
		String s=String.format("Student ID=%s%n Student name=%s%n Student Gender=%s%n Student Branch=%s%n",getID(),getName(),getGENDER(),getBranch());
		return s;
		
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		Scanner ss=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Enter the student ID");
			s.setID(ss.nextLine());
			System.out.println("Enter the student Name");
			s.setName(ss.nextLine());
			System.out.println("Enter the student Gender(Male/Female)");
			s.setGender(ss.next());
			System.out.println("Enter the student Branch");
			s.setBranch(ss.next());
		}
		
		for(int i=0;i<2;i++)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>All Students Details>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(s);
		}
		
		
	}

	

}
