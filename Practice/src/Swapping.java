import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a=");
		a=sc.nextInt();
		System.out.println("Enter b=");
		b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
