package q2;

abstract class Staff {
	protected static int ID;
	 protected static String Name;
	 abstract double computeSalary();
	 Staff(int ID,String Name)
	 {
		 this.ID=ID;
		 this.Name=Name;
	 }
	 public String toString()
	 {
		 return String.format("ID=%d%n Name=%s",ID,Name);
	 }

}
class NonTeachingStaff extends Staff{
	int hourWorked;
	int hourWage;
	NonTeachingStaff(int ID,String Name,int hw,int hwage)
	{
		super(ID, Name);
		this.hourWorked=hw;
		this.hourWage=hwage;
	}
	@Override
	double computeSalary() {
		int sal=hourWorked*hourWage;
		return sal;
	}
	
}
class TeachingStaff extends Staff{
	int basic;
	int allowance;
	TeachingStaff(int basic,int allowance) {
		super(ID, Name);
		this.basic=basic;
		this.allowance=allowance;
		
	}
	
	@Override
	double computeSalary() {
		int HRA=(20/100)*basic;
		int sal=basic+allowance+HRA;
		return sal;
	}
	
}