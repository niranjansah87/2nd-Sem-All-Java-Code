package f1;

import java.util.Scanner;

public class Niranjan {
	private int l,b,h;
	
	public void setaaS(int l)
	{
		this.l=l;
	}
	
	public void setsas(int b)
	{
		this.b=b;
		
	}
	
	public void setas(int h)
	{
		this.h=h;
		
	}
	
	public int volume()
	{
		return l*b*h;
	}
	public int getL()
	{
		return l;
	}
	
	public int getB()
	{
		return b;
	}
	
	public int getH()
	{
		return h;
	}
	public String toString()
	{
		String str=String.format("Length=%d Breadth=%d Height=%d Volume=%d",l,b,h,volume());
		return str;
		
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Niranjan nir=new Niranjan();
		nir.setaaS(s.nextInt());
		nir.setsas(s.nextInt());
		nir.setas(s.nextInt());
		System.out.println(nir);
		
	}

}
