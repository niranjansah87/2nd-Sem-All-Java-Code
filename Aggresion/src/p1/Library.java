package p1;

import java.util.ArrayList;
import java.util.Scanner;
import p1.Book;
public class Library {
	
	 Book b;
	 
	private static Scanner s;
	private static ArrayList<Book> bo;
	private static void initialize() {
		s=new Scanner(System.in);
		bo=new ArrayList<Book>();
		
	}
	private static int menuoption()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>Main Menu>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Add new book");
		System.out.println("2.Print all book");
		System.out.println("3.Search By BookID");
		System.out.println("4.Search By Book Name");
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
				bo.add(addNewBook());
				break;
			case 2:
				printAll();
				
				break;
			case 3:
				searchByBookID();
				break;
			case 4:
				searchByBookName();
				break;
			case 5:
				System.exit(0);
				
			}
			
		}
		

	}
	private static void printAll() {
		
		for(Book b:bo)
		{
		System.out.println(">>>>>>>All Book detail>>>>>>>");
			System.out.println(b);
		}
		
	}
	private static void searchByBookName() {
		System.out.println("Enter Bookname of to Search");
		String sear=s.next();
		for(Book bm:bo)
		{
			if(bm.getN()==sear)
			{
				System.out.println("Book found   ");
				System.out.println(bm);
				return;
			}
				System.out.println("Book not found ");
		}
		
	}
	private static void searchByBookID() {
		System.out.println("Enter Id of to Search");
		String search=s.next();
		for(Book bk:bo)
		{
			if(bk.getID()==search)
			{
				System.out.println("Book found of id "+search);
				System.out.println(bk);
				return;
			}
				System.out.println("Book found of id"+search);
		}
		
	}
	private static  Book addNewBook() {
		System.out.println("Enter the following: (Book name,Book id,book Author,Year of publication) ");
		
		Book b=new Book();
		System.out.println("Enter the Book name) ");
		b.setN(s.next());
		System.out.println("Enter the Book id");
		b.setID(s.next());
		System.out.println("Enter the book Author");
		b.setAu(s.next());
		System.out.println("Enter Year of publication) ");
		b.setY(s.next());
		return b ;
		
	}

}
