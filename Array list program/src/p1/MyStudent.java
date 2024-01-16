package p1;


import java.util.Scanner;
public class MyStudent {
	
		public static void main(String[] args) {
			Student a[]=new Student[10];
			boolean repeat=true;
			int x=0;
			Scanner s=new Scanner(System.in);
			while(repeat)
			{
			System.out.println("enter choice");
			System.out.println("1.new student\n2.print all student\n3.serach\n4.exit");
			int n=s.nextInt();
			switch(n)
			{
			case 1:
				int id;
				System.out.println("enter id number");
				id=s.nextInt();
				String name;
				System.out.println("enter name");
				name=s.next();
				System.out.println("enter gender");
				String gen;
			    gen=s.next();
			    int age;
			    System.out.println("enter age");
			    age=s.nextInt();
			    a[x]=new Student();
			    a[x].setid(id);
			    a[x].setname(name);
			    a[x].setgen(gen);
			    a[x].setage(age);
			   
			    x++;
			    break;
			case 2:
				for(int i=0;i<x;i++)
				{
					a[i].display();
				}
				break;
			case 3:
				int aa;
				System.out.println("eneter id to be search");
				aa=s.nextInt();
				for(int i=0;i<x;i++)
				{
					if(a[i].checkid(aa))
						a[i].display();
				}
				break;
			case 4:
				System.exit(0);
				repeat=false;
			}
			}
		}

	}