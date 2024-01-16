
public class Command {

	public static void main(String[] args) {
		int sum=0,x,max=0;
		for(int i=0;i<args.length;i++)
		{                                                   
			x=Integer.parseInt(args[i]);
			if(x>max)
			{
				max=x;
			}
			sum=sum+x;
		}
		int avg=sum/args.length;
		
		System.out.println("Total Marks="+sum);
		System.out.println("Average Marks="+avg);      
		System.out.println("Max Marks="+max);

	}

	
	

}
