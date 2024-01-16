import java.util.Scanner;

public class BMICalculateDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Name , height ,and weight");
		Scanner s=new  Scanner(System.in);
		BMI   m=new BMI();
		 String  n=s.next();
	    System.out.println("Name: "+n);
	    heightweight(s.nextInt(),s.nextInt());
	   	calcBMI();
		System.out.println("index= " +m.calcBMI(0, 0));

	}

	private static void calcBMI() {
		// TODO Auto-generated method stub
		
	}

	private static void heightweight(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		
	}

}
