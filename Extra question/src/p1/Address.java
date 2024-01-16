package p1;

public class Address {
String City;
String State;
String Country;
public Address(String C,String S,String A)
{
	City=C;
	State=S;
	Country=A;
}

public String toString()
{
	System.out.println("-------Address Details--------");
	String n=String.format("City: %s%n State:%s%n Country:%s%n",City,State,Country);
	return n;
}
}
