
public class Car {
	 private String carMake;
	 private  String carRegistrationNumber;
	 private String carModel;
	 private  int yearOfPurchase ;
	 private String color;
	 private Engine engi;
	 Car(String carRegistrationNumber,String carMake,String carModel,String color,int yearOfPurchase ,Engine engi)
	 {
		 
		 this.carRegistrationNumber=carRegistrationNumber;
		 this.carMake=carMake;
		 this.carModel=carModel;
		 this.color=color;
		 this.yearOfPurchase=yearOfPurchase;
		 this.engi=engi;
	
	 }
	 
	 public void setRNumber(String carRegistrationNumber)
	 {
		 this.carRegistrationNumber=carRegistrationNumber;
	 }
	 public void setMake(String carMake)
	 {
		 this.carMake=carMake;
	 }
	
	 public void setModel(String carModel)
	 {
		 this.carModel=carModel;
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
		 return carRegistrationNumber;
	 }
	 public String getMake()
	 {
		 return carMake;
	 }
	
	 public String getModel()
	 {
		 return carModel;
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
		 String st=String.format("Engine Type:%s%n",engi.getEngineT());
		 return st;
	 }
}
