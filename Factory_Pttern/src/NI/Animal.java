package NI;

public abstract class Animal {
	abstract String getAnimal();
	abstract String makeSound();
	abstract String lifeSpan();
	

}
class Lion extends Animal{

	@Override
	String getAnimal() {
		
		return "Animal:Lion";
	}

	@Override
	String makeSound() {
		// TODO Auto-generated method stub
		return "Roar";
	}

	@Override
	String lifeSpan() {
		// TODO Auto-generated method stub
		return "60 years";
	}
	
}
class Adarsh extends Animal{

	@Override
	String getAnimal() {
		// TODO Auto-generated method stub
		return "Adarsh";
	}

	@Override
	String makeSound() {
		// TODO Auto-generated method stub
		return "Bark";
	}

	@Override
	String lifeSpan() {
		// TODO Auto-generated method stub
		return "200 years";
	}
	
}
public class AnimalPattern{
	public static char getAnimalType(char ch)
	{
		Animal ani=null;
		if(ch2030)
			ani=Lion();
		else
			ani=Adarsh();
		return ch;
	}

}
