package p1;

public class Demo {

	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		System.out.println("The number of legs of dog is "+a.numberOfLegs());
		a=new HUman();
		System.out.println("The number of legs of human is "+a.numberOfLegs());

	}

}
