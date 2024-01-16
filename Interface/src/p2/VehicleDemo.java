package p2;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		System.out.println("==============================================");
		v.changegear(5);
		System.out.println("----------------------------------------------");
		v.speedup();
		System.out.println("==============================================");

	}

}
