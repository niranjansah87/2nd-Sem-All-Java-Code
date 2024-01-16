package  pack1;

abstract class ComputerBuilder 
{

    public final void buildComputer() 
    {
        addMotherboard();
        setupMotherboard();
        addProcessor();
     }

    abstract void addMotherboard();
    abstract void setupMotherboard();
    abstract void addProcessor();

}



class StandardComputer extends ComputerBuilder
{
	   public void addMotherboard( )
	   {
		   System.out.println("Motherboard - Standard Motherboard");
	   }
	
	   public void setupMotherboard()
	   {
		   System.out.println("Screwing the motherboard to the case");
		   System.out.println("Pluging the power supply");		
	   }
	   public void addProcessor()
	   {
		   System.out.println("Processor - Standard Processor");
	   }
}

class HighEndComputer extends ComputerBuilder
{
	   public void addMotherboard( )
	   {
		   System.out.println("Motherboard - HighEnd Motherboard");
	   }
	   public void setupMotherboard()
	   {
		   System.out.println("Screwing the motherboard to the case");
		   System.out.println("Pluging the power supply");		
	   }
	   public void addProcessor()
	   {
		   System.out.println("Processor - HighEnd Processor");
	   }
}


