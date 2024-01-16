package Niranjan;
import java.util.ArrayList;
import java.util.Scanner;
public class VoterDemo {
		private static Scanner sc;
		private static ArrayList<Voter> arobj;
		public static void initialize()
		{
			sc=new Scanner(System.in);
			arobj=new ArrayList<Voter>();
		}
		public static Voter getVoterDict()
		{
			System.out.println("Enter the following: (ID, Name, Age, Address)=> ");
			return new Voter(sc.nextLong(),sc.next(),sc.nextInt(),sc.next());
		}
		
		public static void SearchID()
		{
			System.out.println("Enter ID Number to Search");
			long search=sc.nextLong();
			for(Voter tobj:arobj)
			{
				if(tobj.getID()==search)
				{
					System.out.println("ID found.");
					System.out.println(tobj);
					return;
				}
					System.out.println("ID is not found.");
			}
		}

		public static int menuOption()
		{
			System.out.println("1.Add Voter Details");
			System.out.println("2.Search Based on ID");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			
			return sc.nextInt();
			
		}
		
		public static void main(String[] args) 
		{
			int ch;
			initialize();
			
			while(true)
			{
				ch=menuOption();
				switch(ch)
				{
				case 1:
					arobj.add(getVoterDict());
					break;
				case 2:
					SearchID();
					break;
				case 3:
					System.exit(0);
				}
			}	
		}
		
}
