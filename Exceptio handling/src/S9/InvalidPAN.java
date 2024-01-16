package S9;

public class InvalidPAN extends Exception {
	String type;
	InvalidPAN(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return "InvalidPAN";
	}

}
