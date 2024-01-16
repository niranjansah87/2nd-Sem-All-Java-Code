package pack7;

 class ElectricBill {
	 private String c1name;
	 private int c1no;
	 private int pread;
	 private int cread;
	 public void setCName(String cname)
	 {
	 c1name = cname;
	 }
	 public void setCNumber(int cno)
	 {
	 c1no = cno;
	 }
	 public void setPReading(int preading)
	 {
	 pread= preading;
	 }
	 public void setCReading(int creading)
	 {
	 cread = creading;
	 }
	 public String getCName()
	 {
	 return c1name;
	 }
	 public int getCNumber()
	 {
	 return c1no;
	 }
	 public int getPReading1()
	 {
	 return pread;
	 }
	 public int getCReading1()
	 {
	 return cread;
	 }
	 public float computeBill( )
	 {
	 int diff = cread- pread;
	 float charge;
	 if(diff<=100)
	 charge=1.0F;
	 else if(diff>=101 && diff<=200)
	 charge = 2.50F;
	 else if(diff>=201 && diff<=500)
	 charge = 5.00F;
	 else
	 charge = 6.00F;
	 return (diff*charge);
	 }
	 public String toString( )
	 {
	 String str;
	 str = String.format("Customer Name :%s%nCustomer Number :%d%n"
	 + "Current Reading :%d%nPrevious Reading :%d%n"
	 + "Billed to be Paid :%f%n",getCName(),getCNumber(),getPReading1(),
	 getCReading1(), computeBill( ));
	 return str;
	 }

}
