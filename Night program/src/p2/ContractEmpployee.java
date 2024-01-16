package p2;

public class ContractEmpployee extends Employee {
	double hourworked;
	double wage;
	ContractEmpployee(double worked,double wage)
	{
		hourworked=worked;
		this.wage=wage;
	}
	@Override
	double computeSalary() {
		double sal;
		sal=hourworked*wage;
		System.out.println("SALARY FOR CONTRACT EMPLOYEE IS RS "+sal);
		return sal;
	}

}
