package comparable;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	
	Employee(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return String.format("Name "+name+" ID "+id+ " Age %d",getAge());
	}
	@Override
	public int compareTo(Employee o) {
		if(age==o.getAge())
		return 0;
		else if(age>o.getAge())
			return 1;
		else
			return -1;
	}
}
