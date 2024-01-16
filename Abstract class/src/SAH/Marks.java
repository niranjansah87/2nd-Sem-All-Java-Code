package SAH;
abstract class Marks
{
	public abstract double getPercentage();
}
	class A extends Marks{
		double a,b,c;
		
		A(double a,double b,double c)
		{
			this.a=a;
			this.b=b;
			this.c=c;
		}
		 public double getPercentage()
		{
			 double per=(((a+b+c)/300)*100);
			 return per;
			
		}

	}


	class B extends Marks{
		double a,b,c,d;
		B(double a,double b,double c,double d)
		{
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
		}
		 public double getPercentage()
		{
			 double per=(((a+b+c+d)/400)*100);
			 return per;	
		}

	}
	
	


		

