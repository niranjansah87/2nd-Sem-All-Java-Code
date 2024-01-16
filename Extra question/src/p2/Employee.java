package p2;

public class Employee {
	long ID;
	String Name;
	public Employee(long C,String S){
		ID=C;
		Name=S;
	}
	public String toString()
	{
		System.out.println("-------Employee Details--------");
		String s=String.format("ID: %d%n Name:%s",ID,Name);
		return s;
	}
	
		

	

}
