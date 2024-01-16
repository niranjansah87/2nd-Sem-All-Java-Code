package sahithi;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
	private static Scanner s;
	private static ArrayList<Car> ca;
	private static void initialize() {
		s=new Scanner(System.in);
		ca=new ArrayList<Car>();
		
	}

	private static int menuoption()
	{
		System.out.println("Main Menu");
		System.out.println("1.Add Car Detail");
		System.out.println("2.Display all car detail");
		System.out.println("3.Display based on model");
		
		System.out.println("5.Exit");
		
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
				ca.add(getCarDetail());
				break;
			
			case 2:
				System.out.println(">>>>>>>All Car Detail>>>>>>>");
				for(Car e: ca)
					System.out.println(e);
				break;
			case 3:
				DisplayBasedOnModel();
				break;
			
			case 4:
				System.exit(0);
				
			}
			
		}

	}

	

	
	

	private static void DisplayBasedOnModel() {
		System.out.println("Enter Model of car:");
		String mod=s.next();
		for(Car ma:ca)
		{
			if(ma.getModel()==mod)
			{
				System.out.println("Car Found");
				System.out.println(ma);
				return;
			}
				System.out.println("Car not found");
		}
		
	}

	private static Car getCarDetail() {
		
		System.out.println("Enter the following: (Car Registration number,Car Make,Car model,color,Year of purchase");
		return new Car(s.nextLine(),s.nextLine(),s.nextLine(),s.next(),s.nextInt());
	}

	

}
