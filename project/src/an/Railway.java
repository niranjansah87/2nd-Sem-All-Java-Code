package an;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

class Railway
{ 
  static int destination,cost,select;
  String quata,ticket,category;
  int train_No,passengers;
  String city[]={"Wardha","Badnera","Akola","Bhusaval","Manmad","Daund","Pune"};

  void input()
  {
        

     Scanner sc = new Scanner(System.in);
    
    System.out.println(" \n                    From Nagput to :- "+city[destination]);
    System.out.println("Enter the destination :- ");
          System.out.println("0.Wardha \n1.Badnera \n2.Akola \n3.Bhusaval \n4.Manmad \n5.Daund \n6.Pune");
          destination = sc.nextInt();
          if(destination==0)
            cost=65;
          else if(destination==1)
            cost=56;
          else if(destination==2)
            cost=120;
          else if(destination==3)
            cost=200;
          else if(destination==4)
            cost=256;
          else if(destination==5)
            cost=310;
          else if(destination==6)
            cost=415;
    System.out.print("SL/Gen/Ac");
    System.out.print("\nClass :- ");
    category = sc.next();
    System.out.print("\nNo Of Passengers :- ");
    passengers = sc.nextInt();
    System.out.print("\nQuata :- ");
    quata = sc.next();
    System.out.print("\nTicket Type :- ");
    ticket = sc.next();
    System.out.println("\nInsurance Company:- Travel Insurance Premium : Rs. 0.0");
    cost=cost*passengers;
    
  }

 
  void display()
  {
    System.out.println("     __________________________________________________");
    System.out.println("    |                   Happy Journey                  |");
    System.out.println("    |_____Central Railway / Indian Railways Portal_____|");
    System.out.println("                                                                      ");

     Scanner sc = new Scanner(System.in);
    
    LocalDate date = LocalDate.now();
    System.out.println("    Date :"+date);

    LocalTime myObj = LocalTime.now();
    System.out.println("    Time :"+myObj);
    
    System.out.print("\n               Train_No / Name :- 12981 / Nagpur - "+city[destination] );
    System.out.print("\n                     PNR No. :- 2812823128"); //Passenger Name Record
    System.out.print("\n                            Journey                            ");
    System.out.println(" \n                    From Nagput to :- "+city[destination]);
    System.out.print("    SL/Gen/Ac");
    System.out.print("\n    Class :- "+category+"                      No Of Passengers :- "+passengers);
    System.out.print("\n    Quata :- "+quata+"                         Ticket Type :- "+ticket);
    System.out.println("\n    Travel Insurance Premium : Rs. 0.0");
    System.out.println("\n    Cost Of Passengers :- "+cost);
    
    System.out.println("    |__________________________________________________|");
  }

       public static void main(String[] args) 
       {
          char ch;
          Railway t = new Railway();
          Scanner sc = new Scanner(System.in);
          do
          {  
              
            t.input();
            t.display();
            System.out.print("    Do you want to book another ticket (y/n) :");
            ch=sc.next().charAt(0);
          }while(ch=='y');
       }
}