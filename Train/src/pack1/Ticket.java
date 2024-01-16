package pack1;

public class Ticket {
    private int ticketid,noofseats,fare;
    private String date;
	static int tosebooked;
	static int numberseat;
	public void setA(int tid)
	{
	ticketid=tid;
	}
	public void setB(int seatno)
	{
	noofseats=seatno;
	}
	public void setC(String fdate)
	{
	date=fdate;
	}
	public void setD(int tfare)
	{
	fare=tfare;
	}
	static void setE(int booked)
	{
	tosebooked=booked;
	}
	static void setF(int nseat)
	{
		numberseat=nseat;
	}
	public int getA()
	{
	return ticketid;
	}
	public int getB()
	{
	return noofseats;
	}
	public String getC()
	{
	return date;
	}
	public int getD()
	{
	return fare;
	}
	public int getE()
	{
	return tosebooked;
	}
	public int getF()
	{
	return numberseat;
	}
	public String toString()
	{
	String str=String.format("ticket id:%d%n No of seat:%d%n date:%s%n total fare:%d%n total seats booked:%d%n number of seat:%d%n",getA(),getB(),getC(),getD(),getE(),getF());
	return str;
	}

}
