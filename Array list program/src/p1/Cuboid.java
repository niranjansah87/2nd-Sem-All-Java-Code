package p1;
public class Cuboid 
{
	private int length,breadth,height;
	
	Cuboid(int l,int b,int h)
	{
		this.length=l;
		this.breadth=b;
		this.height =h;
	}
	public int getl() {return this.length;}
	public int getb() {return this.breadth;}
	public int geth() {return this.height;}
	public int getA() {return (getl()*getb()*geth());}
	public String toString()
	{
		String  str="L="+ getl()+ "\tB=" + getb()+ "\tH=" + geth();
				str= str +"\tArea="+getA();
		return str;
	}
	
}
