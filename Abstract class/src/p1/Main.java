package p1;

public class Main {

	public static void main(String[] args) {
		Bank b;  
		b=new SBI();  
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<SBI Bank Status>>>>>>>>>>>>>>>>>>");
		System.out.println("Rate of Interest of SBI  is: "+b.getRateOfInterest()+" %");
		System.out.println("Interest of SBI  is: Rs "+b.calculateInterest());
		
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<ICICI Bank Status>>>>>>>>>>>>>>>>>>");
		b=new ICICI();  
		System.out.println("Rate of Interest of ICICI is: "+b.getRateOfInterest()+" %");
		System.out.println("Interest of ICICI  is: Rs "+b.calculateInterest());

	}

}
