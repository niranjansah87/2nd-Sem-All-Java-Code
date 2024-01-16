import java.util.Scanner;

public class Hypertenuse {

	public static void main(String[] args) {
		double sideA,sideB,hypo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of sideA=");
		sideA=sc.nextInt();
		System.out.println("Enter the value of Side B=");
		sideB=sc.nextInt();
		hypo=(Math.sqrt(sideA)+Math.sqrt(sideB))/2;
		System.out.println("Hypotenuse="+hypo);

	}

}
