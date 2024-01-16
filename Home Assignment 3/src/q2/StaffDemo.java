package q2;

public class StaffDemo {

	public static void main(String[] args) {
		Staff s;
		//new Staff(3490,"Niranjan");
		s=new NonTeachingStaff(3490,"Niranjan",5,500);
		System.out.println(s);
		System.out.println("Salary of Non Teaching Staff is");
		System.out.println(s.computeSalary());
		s=new TeachingStaff(50000,5000);
		System.out.println("Salary of Teaching Staff is");
		System.out.println(s.computeSalary());
		
		

	}

}
