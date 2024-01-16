package p1;

 abstract class Car {
	abstract String CarColor();
	abstract String carModel();

}
class Suzuki extends Car{

	@Override
	String CarColor() {

		return "Color:Black";
	}

	@Override
	String carModel() {
		
		return "Model:Maruti";
	}
	
}
class Honda extends Car{

	@Override
	String CarColor() {
		
		return "Color:Red";
	}

	@Override
	String carModel() {
		
		return "Model:Shine";
	}
	
}
class BMW extends Car{

	@Override
	String CarColor() {
		
		return "Color:White";
	}

	@Override
	String carModel() {
		
		return "Model:S";
	}
	
}
