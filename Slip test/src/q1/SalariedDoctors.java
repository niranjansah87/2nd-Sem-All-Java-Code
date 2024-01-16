package q1;

public class SalariedDoctors extends Doctor {
	int  basicPay;
	int noOfOperations;
	public SalariedDoctors(int ID,String name,String specialization,int basicPay,int noOfOperations)
	{
		super(ID,name,specialization);
		this.basicPay=basicPay;
		this.noOfOperations=noOfOperations;
	}
	
	double computeSalary() {
		int sal=basicPay + noOfOperations*2000;
		System.out.println("Salaried  doctor salary is "+sal);
		return sal;	
	}
	public void display()
	{
		System.out.println("Basic pay="+basicPay+"No of operation="+noOfOperations+" Salary="+computeSalary());
	}

}
