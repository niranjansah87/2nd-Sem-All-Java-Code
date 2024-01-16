package pack1;
import java.util.Scanner;
public class TicketDemo {

	public static void main(String args[]) {
		System.out.println("Enter the Ticket detail:");
		Scanner s=new Scanner(System.in);
		Ticket z= new Ticket();
		z.setA(s.nextInt());
	    z.setB(s.nextInt());
	    z.setC(s.next());
	    z.setD(s.nextInt());
	    Ticket.setE(s.nextInt());
	    Ticket.setF(s.nextInt());
	    System.out.println(z);
	}

}
