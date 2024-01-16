package Bank;

public abstract class Bank {
	abstract String getBalance();
}
class BankA extends Bank{
	String getBalance()
	{
		return "$ "+150;
	}
}
class BankB extends Bank{
	String getBalance()
	{
		return "$ "+200;
	}	
}
class BankC extends Bank{
	String getBalance()
	{
		return "$ "+250;
	}
}
