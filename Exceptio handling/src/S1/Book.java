package S1;

public class Book {
	private String Bname;
	private String Bid;
	private String Bauthor;
	private int YOP;
	
	public void setName(String Bname)
	{
		try {
		if(Bname.matches("[A-Z a-z -]+"))
		{
			this.Bname=Bname;
		}
		else
		{
			throw new InvalidNameException(Bname);
		}
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
	}
	public void setID(String Bid)
	{
		try {
			if(Bid.matches("[A-Z a-z 0-9]+"))
			{
				this.Bid=Bid;
			}
			else
			{
				throw new InvalidIDException(Bid);
			}
		}
		catch(InvalidIDException f)
		{
			System.out.println(f);
		}
	}
	public void setAuthor(String Bauthor)
	{
		try {
			if(Bid.matches("[A-Z a-z]+"))
			{
				this.Bauthor=Bauthor;
			}
			else
			{
				throw new InvalidAuthorException(Bauthor);
			}
		}
		catch(InvalidAuthorException g)
		{
			System.out.println(g);
		}
	}
	public void setYOP(int yop)
	{
		//autoboxing
				Integer obj=yop;
				String str=obj.toString();
				int len=str.length();
		try {
			if(len==4)
			{
				YOP=yop;
			}
			else
			{
				throw new InvalidYOPException(yop);
			}
		}
		catch(InvalidYOPException h)
		{
			System.out.println(h);
		}
	}
	public String getN()
	 {
		 return Bname;
		 
	 }
	 public String getid()
	 {
		 return Bid;
	 }
	 public String getauthor()
	 {
		 return Bauthor;
	 }
	 public int getyop()
	 {
		 return YOP;
	 }
	 public String toString()
	 {
		 return String.format("Bname=%s%n Bid=%s%n Bauthor=%s%n YOP=%d%n",getN(),getid(),getauthor(),getyop());
	 }
	
	 
	 

}
