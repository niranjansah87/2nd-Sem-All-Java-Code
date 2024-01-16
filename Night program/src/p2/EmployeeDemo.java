package p2;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e;
		e=new RegularEmployee(30000,10000);
		e.computeSalary();
		
		e=new ContractEmpployee(9,5000);
		e.computeSalary();

	}

}
