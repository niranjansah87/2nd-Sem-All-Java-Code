package sahithi;

public class Car {
	private String cMake;
	 private  String carRNumber;
	 private String cModel;
	 private  int yearOfPurchase ;
	 private String color;
	 private Engine eng;
	 Car(String carRNumber,String cMake,String cModel,String color,int yearOfPurchase)
	 {
		 
		 this.carRNumber=carRNumber;
		 this.cMake=cMake;
		 this.cModel=cModel;
		 this.color=color;
		 this.yearOfPurchase=yearOfPurchase;
	
	 }
	 public Car(){
		 this.eng=new Engine(yearOfPurchase, cMake, yearOfPurchase, yearOfPurchase);
		 eng.getEngineT();
	 }
	 public void setRNumber(String carRegistrationNumber)
	 {
		 this.carRNumber=carRegistrationNumber;
	 }
	 public void setMake(String carMake)
	 {
		 this.cMake=cMake;
	 }
	
	 public void setModel(String carModel)
	 {
		 this.cModel=cModel;
	 }
	 public void setYOP(int yearOfPurchase)
	 {
		 this.yearOfPurchase=yearOfPurchase;
	 }
	 public void setColor(String color)
	 {
		 this.color=color;
	 }
	 
	 
	public String getRNumber()
	 {
		 return carRNumber;
	 }
	 public String getMake()
	 {
		 return cMake;
	 }
	
	 public String getModel()
	 {
		 return cModel;
	 }
	 public int getYOP()
	 {
		 return yearOfPurchase;
	 }
	 public String getColor()
	 {
		 return color;
	 }
	 public String toString()
	 {
		 String s=String.format("Registration number :%s%n Car make:%s%n Car model=%s%n   Color:%s%n year of purchase:%d%n",getRNumber(),getMake(),getModel(),getColor(),getYOP());
		 return s;
	 }
	 public String toString1()
	 {
		 String st=String.format("Engine Type:%s%n",eng.getEngineT());
		 return st;
	 }

}
