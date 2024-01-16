package q5;



public class Main {

	public static void main(String[] args) {
		Bank b;
		b=new BankA();
		System.out.println("=====================================================");
		System.out.println("Balance in Bank A is "+b.getBalance());
		System.out.println("=====================================================");
		b=new BankB();
		System.out.println("=====================================================");
		System.out.println("Balance in Bank B is "+b.getBalance());
		System.out.println("=====================================================");
		b=new BankC();
		System.out.println("=====================================================");
		System.out.println("Balance in Bank B is "+b.getBalance());
		System.out.println("=====================================================");

	}

}
