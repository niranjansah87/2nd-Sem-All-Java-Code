import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int x,y;
		int power = 1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of X=");
		 x=s.nextInt();
		 System.out.println("Enter the value of Y=");
		 y=s.nextInt();
		 while(x>0 && y>0)
		 {
			 power=(int) (Math.pow(x, y)); 
			 System.out.println("Power of number="+power);
		 }
		
		

	}

}
