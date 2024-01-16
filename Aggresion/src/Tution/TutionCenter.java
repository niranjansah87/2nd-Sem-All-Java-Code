package Tution;

public class TutionCenter {
	private String Name;
	private String Address;
	private int SeatCap;
	private long phone;
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setAdd(String Address)
	{
		this.Address=Address;
	}
	public void setSeat(int SeatCap)
	{
		this.SeatCap=SeatCap;
	}
	public void setNum(int phone)
	{
		this.phone=phone;
	}
	public String getName()
	{
		return Name;
	}
	public String getAdd()
	{
		return Address;
	}
	public int getSeat()
	{
		return SeatCap;
	}
	public long getNum()
	{
		return phone;
	}
	public String toString()
	{
		return String.format("Name=%s%n Address=%s%n Seat Capacity=%d%n Phone=%d%n",getName(),getAdd(),getSeat(),getNum());
	}
	
}
