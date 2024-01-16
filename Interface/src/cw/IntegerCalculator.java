package cw;

class IntegerCalculator implements MyCalculator{
	private static int x=10;
	private static int y=20;
	
	

	@Override
	public void add() {
		int sum=x+y;
		System.out.println("Addition is "+sum);
		
	}

	@Override
	public void sub() {
		int sub=x-y;
		System.out.println("Subtraction is "+sub);
		
	}

	@Override
	public void mul() {
		int mul=x*y;
		System.out.println("Multiplication is "+mul);
		
	}

	@Override
	public void div() {
		int div=x/y;
		System.out.println("Division is "+div);
		
	}
	

}
