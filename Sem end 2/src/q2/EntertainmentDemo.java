package q2;

public class EntertainmentDemo {

	public static void main(String[] args) {
		Entertainment e;
		e=new Movie();
	
		System.out.println(e.seatingCapacity());
		System.out.println(e.ticketPrice());
		
		e=new Drama();
		System.out.println(e.seatingCapacity());
		System.out.println(e.ticketPrice());

	}

}
