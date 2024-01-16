package p1;

public class Vote {
	public static void Validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		try {
			Validate(14);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code will be executed");

	}

}
