package q1;

public class VisitingDoctor extends Doctor {
	int noOfVisits;
	int travelFare;
	int accommodationFare;
	VisitingDoctor(int ID,String name,String specialization,int v,int t,int a)
	{
		super(ID,name,specialization);
		this.noOfVisits=v;
		this.travelFare=t;
		this.accommodationFare=a;
	}
	double computeSalary() {
		int vsal=noOfVisits*(travelFare+accommodationFare);
		System.out.println("Visiting doctor salary is "+vsal);
		return vsal;	
	}
	public void display()
	{
		System.out.println("Travel fare="+travelFare+"No of Visits="+noOfVisits+"Accommodation ="+accommodationFare+" Salary="+computeSalary());
	}
}
