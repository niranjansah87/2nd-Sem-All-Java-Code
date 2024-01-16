package p2;

public class RegularEmployee extends Employee{
	double basicpay;
	double allowance;
	double sal;
	
	RegularEmployee(double basicpay,double allowance)
	{
		this.basicpay=basicpay;
		this.allowance=allowance;
	}
	@Override
	double computeSalary() {
		double HRA=20/100*basicpay;
		sal=basicpay+HRA+allowance;
		System.out.println("SALARY FOR REGULAR EMPLOYEE IS RS "+sal);
		return sal;
	}

}
