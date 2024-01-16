
package pack1;

public class CuboidDemo {

	public static void main(String[] args) {
		Cuboid cu= new Cuboid();
		if(cu.setL(10)&&cu.setB(10)&&cu.setH(10))
		{
			System.out.println(cu);
		
		}
		else
		{
			System.out.println("Enter the valid input");
		}

	}

}
