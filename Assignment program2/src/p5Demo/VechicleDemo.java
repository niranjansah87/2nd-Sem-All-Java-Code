package p5Demo;
import java.util.ArrayList;
import java.util.Scanner;


import p5.Vehicle;
public class VechicleDemo {
	private static Scanner s;
	private static ArrayList<Vehicle> vehi;
	private static void initialize() {
		s=new Scanner(System.in);
		vehi=new ArrayList<Vehicle>();
	}
	private static int menuoption()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>Main Menu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Add new Vehicle");
		System.out.println("2.Print all student");
		System.out.println("4.Display based on ID");
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
			      vehi.add((Vehicle) getVehiDetail());
				break;
			case 2:
				System.out.println(">>>>>>>All Vehicle Detail>>>>>>>");
				for(Vehicle v: vehi)
					System.out.println(v);
				break;
			case 3:
				DisplayBasedonNumber();
				break;
			case 4:
				System.exit(0);
				
			}
			
		}

	}
	private static void DisplayBasedonNumber() {
		System.out.println("Enter Vehicle number to Search");
		String search=s.nextLine();
		for(Vehicle vid:vehi)
		{
			if(vid.getNum()==search)
			{
				System.out.println("Vehicle Number Found");
				System.out.println(vid);
				return;
			}
				System.out.println("Vehicle Number not Found");
		}
		
	}
	private static Vehicle getVehiDetail() {
		System.out.println("Enter the following: (Vehicle Number,Wheeler<2/4>,Name,Mobile NUMBER) ");
		return new Vehicle(s.next(),s.nextInt(),s.next(),s.nextLong());
		
	}

}
