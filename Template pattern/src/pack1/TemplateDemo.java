package pack1;

public class TemplateDemo {
	public static void main(String[] args) {
		ComputerBuilder comType;
		System.out.println("Standard Computer");
			
			comType = new StandardComputer();
			
			comType.buildComputer();

			System.out.println("\nHigh End Computer");
			comType = new HighEndComputer();
			comType.buildComputer();

		}

}
