package cn;

class VisitingDoctor extends Doctor{

	
	int noOfVisits=20;
	int travelFare=500;
	int accommodationFare=1800;
	VisitingDoctor(int noOfVisits,int travelFare,int accommodation)
	{
		this.noOfVisits=noOfVisits;
		this.travelFare=travelFare;
		this.accommodationFare=accommodationFare;
	}
	double computeSalary() {
		int vsal=noOfVisits*(travelFare+accommodationFare);
		System.out.println("Visiting doctor salary is "+vsal);
		return vsal;	
	}
}
