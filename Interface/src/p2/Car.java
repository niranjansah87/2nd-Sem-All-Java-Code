package p2;

class Car implements Vehicle {
	//int gear=5;
	int speed=120;
	public int changegear(int gear)
	{
		System.out.println("Gear is "+gear);
		return gear;
	}
	public void speedup()
	{
		System.out.println("Speed is "+speed);
	}
}
