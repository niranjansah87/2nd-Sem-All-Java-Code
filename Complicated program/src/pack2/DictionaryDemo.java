package pack2;
import pack1.Dictionary;
import java.util.ArrayList;
import java.util.Scanner;

class DictionaryDemo{
	public static void main(String[] args) {
		int choice = -1;
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		ArrayList<Dictionary> al = new ArrayList<Dictionary>();
		do {
			System.out.println("     MENU     ");
			System.out.println("--------------");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("0.Exit");
			System.out.println("--------------");
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter how many Student Details you want to Store: ");
				int n = s.nextInt();
				for(int i=0;i<n;i++) {
				System.out.println("Enter Student ID: ");
				int stuno = s.nextInt();
				
				System.out.println("Enter Student Name: ");
				String stuname = s1.nextLine();
				
				System.out.println("Enter Student Mobile Number: ");
				Long stumobile = s.nextLong();
				
				al.add(new Dictionary(stuno, stuname, stumobile));
				}
				break;
			case 2:
			System.out.println("Available items are: ");
			System.out.println("  ID   / Name/  Ph.Number");
			System.out.println(al);
			}
		}
		while (choice!= 0);
		System.out.println("Succesfully Exit! Have a good Day:)");
	}
}
