import java.util.ArrayList;
import java.util.Scanner;




public class CricketDemo {
	private static Scanner s;
	private static ArrayList<Cricket> cric;
	private static void initialize() {
		s=new Scanner(System.in);
		cric=new ArrayList<Cricket>();
		
	}

	private static int menuoption()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>Main Menu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Add new Cricketer");
		System.out.println("2.Display data of players who player more than 50 matches");
		System.out.println("3.Display all");
		System.out.println("4.Search By country");
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
				cric.add(getCricDetail());
				break;
			case 2:
				Display50();
				break;
			case 3:
				System.out.println(">>>>>>>All Cricketer Detail>>>>>>>");
				for(Cricket c: cric)
					System.out.println(c);
				break;
			case 4:
				searchByCountry();
				break;
			case 5:
				System.exit(0);
				
			}
			
		}

	}

	private static void searchByCountry() {
		System.out.println("Enter Country to Search");
		String search=s.next();
		for(Cricket coun:cric)
		{
			if(coun.getCout()==search)
			{
				System.out.println("Player found of %s Country"+search);
				System.out.println(coun);
				return;
			}
				System.out.println("Player is not found of %s Country."+search);
		}
		
	}

	
	private static void Display50() {
		System.out.println("Enter Number of match of player:");
		int mat=s.nextInt();
		for(Cricket ma:cric)
		{
			if(ma.getMat()>=mat)
			{
				System.out.println("Player found who played "+mat+" matches"+mat);
				System.out.println(ma);
				return;
			}
				System.out.println("Player not found who played "+mat+" matches"+mat);
		}
		
	}

	private static Cricket getCricDetail() {
		
		System.out.println("Enter the following: (Name,Country,Match played,Total Runs) ");
		return new Cricket(s.next(),s.next(),s.nextInt(),s.nextInt());
	}

	

}
