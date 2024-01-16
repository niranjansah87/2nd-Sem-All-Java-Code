import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		Product p=new Product();
		Scanner sc=new Scanner(System.in);
		p.setA(sc.next());
		p.setB(sc.next());
		p.setC(sc.nextInt());
		p.setD(sc.nextInt());
		System.out.println(p);

	}

}
