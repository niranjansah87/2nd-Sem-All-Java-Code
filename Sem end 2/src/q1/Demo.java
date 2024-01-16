package q1;

public class Demo {

	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		System.out.println(v.noOfWheels());
		v=new Bicycle();
		System.out.println(v.noOfWheels());

	}

}
