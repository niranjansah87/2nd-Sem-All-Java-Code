package p5;

public class Vehicle {
private String vnum;
private int vwheel;
private String vown;
private long vmob;
public Vehicle(String num, int wheel, String own, long mob) {
	vnum=num;
	vwheel=wheel;
	vown=own;
	vmob=mob;
}

public String getNum()
{
	return vnum;
}
public int getWh()
{
	return vwheel;
}
public String getName()
{
	return vown;
}
public long getMob()
{
	return vmob;
}
public String toString()
{
	String s=String.format("Vehicle Number=%s%n Vehicle wheel =%d%n Owner Name=%s%n Mobile Number=%d%n",getNum(),getWh(),getName(),getMob());
	return s;
	
}
}
