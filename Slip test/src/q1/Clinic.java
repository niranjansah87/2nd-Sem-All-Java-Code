package q1;
import java.util.Scanner;


public class Clinic {
	public static Scanner s=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int i;
		System.out.println("Select Any One: ");
		Scanner r=new  Scanner (System.in);
		System.out.println("1.Salaried Doctor ");
		System.out.println("2.Visiting Doctor");
		int ch=r.nextInt();
		switch(ch){
		case 1: 
			   System.out.println("Enter the number of Salaried Doctor: ");
			   int n=r.nextInt();
			   SalariedDoctors[] l=new SalariedDoctors[n];
			   for(i=0;i<n;i++){
				   System.out.println("Enter the ID,Name,basic,allowance");
			    l[i]=new SalariedDoctors(s.nextInt(),s.next(),s.next(),s.nextInt(),s.nextInt());
			     }
			   for(i=0;i<n;i++){
			    l[i].display();
			    System.out.println(l[i].computeSalary());
			   }
			   break;
		case 2:
			   System.out.println("Enter the number of Visiting Doctor: ");
			   int m= r.nextInt();
			   VisitingDoctor[] h=new VisitingDoctor[m];
			   for(i=0;i<m;i++){
				   System.out.println("Enter the ID,Name,hour,wage");
			     h[i]=new VisitingDoctor(s.nextInt(),s.next(),s.next(),s.nextInt(),s.nextInt());
			     }
			   for(i=0;i<m;i++){
			    h[i].display();
			    System.out.println(h[i].computeSalary());
			   }
			   break;
	}
	

}
}

	    
	   
