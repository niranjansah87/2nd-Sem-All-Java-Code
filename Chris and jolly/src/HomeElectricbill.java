
public class HomeElectricbill {
	 private String c1name;
	 private int customerno;
	 private int Unit;
	 public void setCName(String cname)
	 {
	 c1name = cname;
	 }
	 public void setCNumber(int cno)
	 {
	 customerno = cno;
	 }
	 public void setUnit(int U)
	 {
		 Unit=U;
	 }
	 public String getCName()
	 {
	 return c1name;
	 }
	 public int getCNumber()
	 {
	 return customerno;
	 }
	 public int getUnit()
	 {
		 return Unit;
	 }
	 public int TotalBill( )
	 {
	 int charge;
	 int Fine;
	 if(Unit<=50)
	 charge=2;
	 else if(Unit>=51 && Unit<=100)
	 charge = 3;
	 else if(Unit>=101 && Unit<=300)
	 charge = 5+100;
	 else if(Unit>=301 && Unit<=450)
	 charge = 6;
	 else
	 charge = 8 ;
	 if(Unit<=50)
		 Fine=0;
		 else if(Unit>=51 && Unit<=100)
		 Fine = 0;
		 else if(Unit>=101 && Unit<=300)
		 Fine = 100;
		 else if(Unit>=301 && Unit<=450)
		 Fine = 200;
		 else
		 Fine = 250 ;
	 return (Unit*charge+Fine);
	 }
	 public String toString( )
	 {
	 String str;
	 str = String.format("Customer Name :%s%nCustomer Number :%d%n Unit consumed=%d%n"
	 + "Billed to be Paid :%d%n",getCName(),getCNumber(),getUnit(),TotalBill( ));
	 return str;
	 }
}
