package Niranjan;

public class Driver {

	public static void main(String[] args) {
		Employee e=new Employee();
		Manager m=new Manager();
		e.name="Ram";
		e.age=20;
		e.Phone_Number=98267490;
		e.salary=10000;
		e.address="vijayawada";
		e.Specilization="CS&IT";
		m.department="CSE";
		System.out.println("Name="+e.name);
		System.out.println("Age="+e.age);
		System.out.println("Phone number="+e.Phone_Number);
		e.printSalary();
		System.out.println("Specialization="+e.Specilization);
		System.out.println("Department="+m.department);
		
		

	}

}
