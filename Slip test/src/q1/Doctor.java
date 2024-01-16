package q1;

public abstract class Doctor {
	static int ID;
	static String name;
	static String specialization;
	Doctor(int ID,String name,String specialization)
	{
		
		this.ID=ID;
		this.name=name;
		this.specialization=specialization;
	}
	abstract double computeSalary();
	

}


