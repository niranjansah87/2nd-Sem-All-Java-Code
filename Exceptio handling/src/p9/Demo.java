package p9;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		System.out.println("Enter Book ID:");
		b.setBID(sc.next());
		System.out.println("Enter Book Name:");
		b.setBNAME(sc.next());
		System.out.println("Enter Book Aurthor:");
		b.setAURTHOR(sc.next());
		System.out.println("Enter Book YOP:");
		b.setYOP(sc.nextInt());
		System.out.println(b);
		}
}
