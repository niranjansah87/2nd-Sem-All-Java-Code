package sah;

import java.util.Scanner;
import niranjan.LinearEquation;

public class Prompt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.println("enter a,b,c,d,e,f");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
	LinearEquation   le=new LinearEquation(a,b,c,d,e,f);
		if(le.isSolvable())
		{
			System.out.println("x="+le.getX()+"y="+le.getY());
		}
		else
	System.out.println("the equation has no solution");
		

	}


	}


