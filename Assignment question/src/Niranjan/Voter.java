package Niranjan;
public class Voter {
	static long id;
	static String name;
	static int age;
	static String address;
	Voter(long i, String n, int ag, String a)
	{
		id=i;
		name=n;
		age=ag;
		address=a;
		}
		public Long getID() 
		{
			return id;
		}
		public String getName()
		{
			return name; 
		}
		public long getAge()
		{
			return age; 
		}
		public String getAddress()
		{
			return address; 
		}
		
		public void setID(Long i)
		{
			id=i; 
		}
		public void setName(String n)
		{
			 name=n; 
		}
		public void setAge(int ag)
		{
			age=ag; 
		}
		public void setAddress(String a)
		{
			address=a; 
		}
		
		public String toString()
		{
			String str;
			str=String.format("ID: %s%n Name: %s%n Age: %s%n Address: %s%n",getID(),getName(),getAge(),getAddress());
			return str;
		}
		
	}
