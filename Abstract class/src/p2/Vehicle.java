package p2;

abstract class Vehicle {
	abstract int seatCapacity();

}
class Car extends Vehicle
{
	int seatCapacity()
	{
		return 4;
	}
}
class Bus extends Vehicle
{
	int seatCapacity()
	{
		return 50;
	}
}
