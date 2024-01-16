package p1;

public class Book {
	private String Bname;
	private String Bid;
	private String BAuthor;
	private String YOP;
	public boolean setN(String Name) {
	
		if(Name.matches("[a-zA-z]+"))
		{
		Bname=Name;
		return true;
	}
		return false;
	}
	public boolean setID(String id)
	{
		if(id.matches("[ ]+") || id.matches("[@#$%%^&]+"))
		{
			
			return false;
		}
		Bid=id;
		return true;
			
	}
	public boolean setAu(String Au)
	{
		if(Au.matches("[1-9]") && Au.matches("[!@#$%^&*]+"))
		{
			
			return false;
		}
		BAuthor=Au;
		return true;
	}
	public boolean setY(String Y)
	{
		if(Y.length()<=4)
		{
			Y=YOP;
			return true;
		}
		return false;
			
	}
	public String getN()
	{
		return Bname;
	}
	public String getID()
	{
		return Bid;
	}
	public String getAu()
	{
		return BAuthor;
	}
	public String getY()
	{
		return YOP;
	}
	public String toString()
	{
		String s=String.format("Book name=%s%n  Author ID=%s%n Author name=%s%n YOP=%s%n",getN(),getID(),getAu(),getY());
		return s;
		
	}

}
