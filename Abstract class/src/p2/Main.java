package p2;


public class Main {

	public static void main(String[] args) {
		Vehicle v;  
		v=new Car();  
		
		System.out.println("Seat capacity of car   is: "+v.seatCapacity());
		v=new Bus();
		System.out.println("Seat capacity of bus is "+v.seatCapacity());

	}

}
