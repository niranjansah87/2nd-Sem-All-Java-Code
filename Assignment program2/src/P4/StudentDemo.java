package P4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	private static Scanner s;
	private static ArrayList<Student> stud;
	private static void initialize() {
		s=new Scanner(System.in);
		stud=new ArrayList<Student>();
	}
	private static int menuoption()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>Main Menu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Add new Student");
		System.out.println("2.Print all student");
		System.out.println("4.Search based on ID");
		System.out.println("5.Exit");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Enter the choice:");
		return s.nextInt();
		
	}
	public static void main(String[] args) {
		int ch;
		initialize();
		while(true)
		{
			ch=menuoption();
			switch(ch)
			{
			case 1:
				stud.add((Student) getStudDetail());
				break;
			case 2:
				System.out.println(">>>>>>>All Student Detail>>>>>>>");
				for(Student c: stud)
					System.out.println(c);
				break;
			case 3:
				searchBasedonID();
				break;
			case 4:
				System.exit(0);
				
			}
			
		}


	}
	private static void searchBasedonID() {
		System.out.println("Enter ID to Search");
		String search=s.nextLine();
		for(Student sid:stud)
		{
			if(sid.getID()==search)
			{
				System.out.println("ID Found");
				System.out.println(sid);
				return;
			}
				System.out.println("ID not Found");
		}
		
	}
	private static Object getStudDetail() {
		System.out.println("Enter the following: (ID,Name,Gender<Male/female>,age) ");
		return new Student(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
	}

}
