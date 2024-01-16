package p1;
import java.util.*;
public class Student
{
	public long id;
	public String name;
	public long phone;
	public static ArrayList<Student> l1 = new ArrayList<Student>();
	 Student(long id1,String name1,long phone1)
	{
		this.id=id1;
		this.name=name1;
		this.phone=phone1;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
public void searchname()
{
	Scanner sc = new Scanner(System.in);
	int flag=0;
	String  k=sc.next();
	for(int i=0;i<l1.size( );i++)
	{
		//Student temp = l1.get(i);
		if(l1.get(i).getName().equals(k))
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Element found");
			flag=1;
			break;
		}
	}
	if(flag == 0)
	{
		System.out.println("element is not found");
	}
}
	
	public String toString()
	{
		String str;
		return str="Name="+name+"Id Number is "+id+" Phone number   "+phone;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Student detail");
		Student p= new Student(sc.nextLong(), sc.next(),sc.nextLong());
		System.out.println("Enter the second Student detail");
		Student p1= new Student(sc.nextLong(), sc.next(),sc.nextLong());
		System.out.println("Enter the third Student detail");
		Student p2= new Student(sc.nextLong(), sc.next(),sc.nextLong());
		System.out.println("Enter the fourth Student detail");
		Student p3= new Student(sc.nextLong(), sc.next(),sc.nextLong());
	
		l1.add(p);
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		p.searchname();
		/*Iterator<Student> itr1 = l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}*/
		for(Student temp: l1)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(temp);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		
		
	}

}