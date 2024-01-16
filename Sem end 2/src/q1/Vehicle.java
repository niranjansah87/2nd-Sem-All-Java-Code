package q1;

abstract class Vehicle {
	abstract int noOfWheels();

}
class Car extends Vehicle{

	@Override
	int noOfWheels() {
		
		return 4;
	}
	
}
class Bicycle extends Vehicle{

	@Override
	int noOfWheels() {
		return 2;
	}
	
}
