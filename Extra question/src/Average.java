import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int n=s.nextInt();
		int Arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
			Arr[i]=s.nextInt();
		int len=Arr.length;
		 int sum = 0;
	        int min = Arr[0];
	        int max = Arr[0];
	        int avg;

	        for(int i = 0; i < len; i++)
	        {
	            sum += Arr[i];

	            if(Arr[i] < min)
	                min = Arr[i];
	            else if(Arr[i] > max)
	                max = Arr[i];
	        }

	        avg = sum /len;

	        System.out.println("Largest elements is "+min);
	        System.out.println("Smallest elements is "+max);
	        System.out.println("Average of array is "+avg);
		

	}

}
