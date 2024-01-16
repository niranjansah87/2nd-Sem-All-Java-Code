import java.util.Scanner;
public class Book {
	
private String name;
private int id;
private String author;
private int yop;
public void setn(String n)
{
	try
	{
		if(n.matches("[A-Z a-z]"))
		{
			throw new Name(n);
			
		}
		else
		{
			name=n;
		}
	}
	catch(Name e)
	{
		System.out.println(e);
	}
}
public void setid(int i)
{
	id=i;
}
public void setauthor(String a)
{
	try
	{
		if(a.matches("[A-Z a-z]"))
		{
			throw new Author(a);
		
			
		}
		else
		{
			
			author=a;
		}
	}
	catch(Author e)
	{
		System.out.println(e);
	}
}
public void sety(int y)
{
	Integer obj=y;
	String str=obj.toString();
	int len=str.length();
	try
	{
		if(len==4)
		{
			yop=y;
		}
		else
		{
			throw new Year(y);
		}
	}
	catch(Year e)
	{
		System.out.println(e);
	}
}
public String getn()
{
	return name;
}
public int getid()
{
	return id;
}
public String getauthor()
{
	return author;
}
public int gety()
{
	return yop;
}
public String toString()
{
	String str=String.format("name:%s\n id:%d\nauthor:%s\nyear:%d",getn(),getid(),getauthor(),gety());
	return str;
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	Book s=new Book();
	System.out.println("enter name,id,author,year:");
	s.setn(sc.next());
	s.setid(sc.nextInt());
	s.setauthor(sc.next());
	s.sety(sc.nextInt());
	System.out.println(s);
	
}
}
class Name extends Exception
{
	private String bname;
	Name(String n)
	{
		bname=n;
	}
	public String toString()
	{
		return "book name:"+bname;
	}
}
class Id extends Exception
{
	private int bid;
	Id(int i)
	{
		bid=i;
	}
	public String toString()
	{
		return "book id:"+bid;
	}
}
class Author extends Exception
{
	private String bauthor;
	Author(String a)
	{
		bauthor=a;
	}
	public String toString()
	{
		return "author is:"+bauthor;
	}
}
class Year extends Exception
{
	private int byop;
	Year(int y)
	{
		byop=y;
	}
	public String toString()
	{
		return "year of published is:"+byop;
	}
}