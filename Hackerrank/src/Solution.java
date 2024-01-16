
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        for(int i=1;i<=10;i=i+1)
        {
        	int m=n*i;
        	System.out.println( n+ " x "+i+" = " +m);
        }
    }
}
