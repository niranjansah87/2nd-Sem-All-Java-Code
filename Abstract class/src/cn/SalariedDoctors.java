package cn;

class SalariedDoctors extends Doctor {
	
	int  basicPay=5000;
	int noOfOperations=20;
	double computeSalary() {
		int sal=basicPay + noOfOperations*2000;
		System.out.println("Salaried  doctor salary is "+sal);
		return sal;	
	}

}
