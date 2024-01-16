package pack2;

abstract class CookRecipe
{
	public void cookFood()
	{
	    putStoveOn();
	    cutSpecificVegetable();
	    cookSpecificVegetable();
	    putStoveOff();
	}
	  public void putStoveOn( )
	  {
		  System.out.println("Turn on the stove");
	  }
	  public void putStoveOff(){
		   System.out.println("Turn off the stove");
	  } 
	
	  public abstract void  cutSpecificVegetable();
	  public abstract void  cookSpecificVegetable();
}

class CookCarrotRice extends CookRecipe{
	  public void cutSpecificVegetable( )
	  {
		  System.out.println("Cut Carrot");
	  }
	  public void cookSpecificVegetable( )
	  {
		  System.out.println("Boil and cook carrot rice");
	  }
	}

class CookTomateoRice extends CookRecipe
{
	
	  public void cutSpecificVegetable( )
	  {
		  System.out.println("Cut Tomateo");
	  }
	  public void cookSpecificVegetable( )
	  {
		  System.out.println("Boil and cook tomateo rice");
	  }
	
}


