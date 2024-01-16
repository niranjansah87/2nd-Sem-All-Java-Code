package p3;

public class Demo {

	public static void main(String[] args) {
		Game g;
		g=new Chess();
		System.out.println("Players in chess is "+g.noOfplayers());
		g=new Fotball();
		System.out.println("Players in fotball is "+g.noOfplayers());

	}

}
