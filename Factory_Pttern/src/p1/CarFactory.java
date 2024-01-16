package p1;

import java.util.Scanner;

public class CarFactory {

    public static Car getCarType(char choice)
    { 
	   Car car=null;
	   if(choice == 's') 
              car = new Suzuki( );  
		else if(choice == 'h')  
              car = new Honda( );  
		else if(choice == 'b')  
	               car = new BMW( );
	   return car;
    }  
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
			Car ca;

			    System.out.println("Welcome to Car Showroom");
				System.out.println("1.Suzuki(s)");
				System.out.println("2.Honda(h)");
				System.out.println("3.BMW(b)");
				System.out.println("Enter u r choice :");
				ca=getCarType(s.next().charAt(0));
				
				System.out.println(ca.CarColor());
				System.out.println(ca.carModel());

	}


}
