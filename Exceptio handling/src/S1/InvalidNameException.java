package S1;

public class InvalidNameException extends Exception {
	String type;
	InvalidNameException(String type)
	{
		this.type=type;
	}
	public String toString()
	{
		return "InvalidName"+type;
	}

}
class InvalidIDException extends Exception {
	String ID;
	InvalidIDException(String ID)
	{
		this.ID=ID;
	}
	public String toString()
	{
		return "InvalidID"+ID;
	}

}
class InvalidAuthorException extends Exception {
	String Author;
	InvalidAuthorException(String Author)
	{
		this.Author=Author;
	}
	public String toString()
	{
		return "InvalidAuthor"+Author;
	}

}
class InvalidYOPException extends Exception {
	int YOP;
	InvalidYOPException(int YOP)
	{
		this.YOP=YOP;
	}
	public String toString()
	{
		return "InvalidYOP"+YOP;
	}

}
