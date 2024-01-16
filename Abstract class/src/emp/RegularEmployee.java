package emp;

class RegularEmployee extends Employee{
	double basicpay;
	double yoe;
	double bonus;
	double ira;
	RegularEmployee(long Id,String name,int b,int yoe)
	{
		this.Id=Id;
		this.name=name;
		basicpay=b;
		this.yoe=yoe;
	}
	double edoulateSalary() {
		
		if(yoe>5)
		{
			ira=(10/100*basicpay);
			bonus=(30/100*basicpay);
			
		}
		else
		{
			ira=(10/100*basicpay);
			bonus=(10/100*basicpay);
			
		}
		return (basicpay+ira+bonus) ;
		
	}
	/*public String toString()
	{
		return String.format(" Basic pay=%d%n IRA=%d%n bonus=%d%n Salary=%d%n",basicpay,ira,bonus,edoulateSalary());
	}*/

}
