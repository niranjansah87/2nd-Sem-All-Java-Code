package q2;

abstract class Entertainment {
	String Title;
	abstract int seatingCapacity();
	abstract int ticketPrice();
	
}
class Movie extends Entertainment{
	String director;

	@Override
	int seatingCapacity() {
		
		return 250;
	}

	@Override
	int ticketPrice() {
		return 200;
	}
	
}
class Drama extends Entertainment{
	String writer;

	@Override
	int seatingCapacity() {
		
		return 500;
	}

	@Override
	int ticketPrice() {
		
		return 100;
	}
}
