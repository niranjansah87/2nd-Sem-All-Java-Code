import java.util.Scanner;

class CubeDemo {

			public static void main(String args[]) {
				Cube v= new Cube();
				Scanner s=new Scanner(System.in);
		        v.SetL(s.nextDouble());
		        v.SetB(s.nextDouble());
		       v.SetH(s.nextDouble());
				System.out.println(v);
}
	 }

