import java.util.Scanner;


public class SalaryDemo {

	public static void main(String[] args) {
		Salary sa =new Salary();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the HRA:");
		 sa.setH(s.nextInt());
		 System.out.println("Enter the Bonus:");
		 sa.setB(s.nextInt());
		 System.out.println("Enter the Basic pay:");
		 sa.setBasic(s.nextInt());
		 System.out.println(sa);

	}

}
