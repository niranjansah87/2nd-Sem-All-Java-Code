package Niranjan;
import java.util.Scanner;
public class Circuit {
static int[] resistance=new int[10];
public static int sumresistance(int resist[]) {
	 int sum=0,i;
	    for(i=0;i<10;i++)
	    sum=sum+resist[i];
	   
		return sum;
}
public static void main(String args[]) {
	int total = 0;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("Enter the "+ (i+1)+" resistance: ");
		resistance[i]=sc.nextInt();
		total=sumresistance(resistance);
	   
	}
	 System.out.println("Total Resistance is:"+ total);
	}
}