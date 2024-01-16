package niranjan;
import java.util.Scanner;

public class LinearEquation {
	private int a,b,c,d,e,f,x,y;
	public LinearEquation(int a,int b,int c,int d,int e,int f)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;			
	}
	public boolean isSolvable()
	{
		int result;
		result=(this.a*this.d)-(this.b*this.c);
		if(result==0)
			return false;
		else
			return true;
	}
	public  int getX()
	{
		this.x=(e*d-b*f)/(a*d-b*c);
		return this.x;
	}
	public  int getY()
	{
		this.y=(a*f-e*c)/(a*d-b*c);
		return this.y;
	}

	
	}
	


