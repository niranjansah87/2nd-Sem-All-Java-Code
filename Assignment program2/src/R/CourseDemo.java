package R;
import java.util.Scanner;
public class CourseDemo {

	public static void main(String[] args) {
		CourseClass c=new CourseClass();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Course Title=");
		c.setT(s.next());
		System.out.println("Enter the Course code=");
		c.setC(s.next());
		System.out.println("Enter the Course credit=");
		c.setD(s.nextInt());
		System.out.println(c);
		

	}

}


