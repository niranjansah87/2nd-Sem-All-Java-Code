package cn;
import java.util.Scanner;
public class Clinic {
	private static Scanner s=new Scanner(System.in);;
	private static Doctord doc[];
	private static int i=0;
	private static void initialize(int n) {
		doc=new Doctord[n];
	}
		
		public static int menuoption()
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>Main Menu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("1.Add new Doctor data");
			System.out.println("2.Display all doctor data");
			System.out.println("3.Exit");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Enter the choice:");
			return s.nextInt();
			
		}

	public static void main(String[] args) {
		Doctor d;
		d=new VisitingDoctor();
		System.out.println("==================================================");
		d.computeSalary();
		System.out.println("==================================================");
		d=new SalariedDoctors();
		System.out.println("==================================================");
		d.computeSalary();
		System.out.println("==================================================");
		int ch;
		System.out.println("Enter the number of doctor u want to add:");
		initialize(s.nextInt());
		while(true)
		{
			ch=menuoption();
			switch(ch)
			{
			case 1:
				getDocDetail();
				break;
			case 2:
				printAll();
				break;
			case 3:
				System.exit(0);
			
				
			}
			
		}

	}
	private static void printAll() {
		System.out.println(">>>>>>>All Doctor Detail>>>>>>>");
		for(i=0;i<doc.length;i++)
		{
			System.out.println(doc[i]);
		}

		
	}

	private static Doctord getDocDetail() {
		System.out.println("Enter the detail:ID,Name,Specialization");
		Doctord temp=new Doctord(s.nextLong(),s.next(),s.next());
		System.out.println("Data is added ");
		return doc[i++]=temp;

		
	}

}
