package S2;

public class Student {
		private long ID;
		private int mark1,mark2,mark3,mark4;
		
	Student(long ID,int mark1,int mark2,int mark3,int mark4)
	{
		this.ID=ID;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}
	public long getID()
	{
		return ID;
	}
	
	public int Total()
	{
		int total=mark1+mark2+mark3+mark4;
		return total;
	}
	public String toString()
	{
		return String.format("ID=%d%n Mark1=%d%n Mark2=%d%n Mark3=%d\n Mark4=%d\n Total Mark=%d",ID,mark1,mark2,mark3,mark4,Total());
	}
}
