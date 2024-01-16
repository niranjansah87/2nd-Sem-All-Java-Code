package Niranjan;

import java.util.Scanner;

public class Account {
	private static Account obj=new Account();
	private int amount;
	private Account()
	{
		amount=5000;
	}
	public void withdraw(int w)
	{
		amount=amount-w;
		System.out.println(amount);
	}
	public void deposit(int a)
	{
		amount=amount+a;
		System.out.println(amount);
	}
	public static Account getInstance()
	{
		return obj;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw and deposit amount");
		Account  Atm1=getInstance();
		Atm1.withdraw(sc.nextInt());
		Atm1.deposit(sc.nextInt());
		
		Account Atm2=getInstance();
		Atm2.withdraw(sc.nextInt());
		Atm2.deposit(sc.nextInt());
		
		Account Atm3=getInstance();
		Atm3.withdraw(sc.nextInt());
		Atm2.deposit(sc.nextInt());
	
	}

}