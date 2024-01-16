import java.util.Scanner;

public class Kashmir {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature in centigrade=");
		float temp=s.nextFloat();
		if(temp<0)
		{
			System.out.println("Freezing Weather");
		}
		else if(temp>0 && temp<10)
		{
			System.out.println(" Very cold Weather");
		}
		else if(temp>10 && temp<20)
		{
			System.out.println("Cold Weather");
		}
		else if(temp>20 && temp<30)
		{
			System.out.println("Freezing Weather");
		}
		else if(temp>30 && temp<40)
		{
			System.out.println("It's Hot Weather");
		}
		else
		{
			System.out.println("Its very hot Weather");
		}
		

	}

}
