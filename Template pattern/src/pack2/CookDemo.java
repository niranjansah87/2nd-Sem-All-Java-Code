package pack2;

public class CookDemo {

	public static void main(String[] args) {
		System.out.println("Cook Carrot Rice");
		CookRecipe crobj = new CookCarrotRice( );
		crobj.cookFood( );

		System.out.println("\nCook Tomateo Rice");		
		crobj = new CookTomateoRice( );
		crobj.cookFood( );	

	}

}
