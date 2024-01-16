package practice2;

public class Student {
	int ID;
	int mark;
	Student(int ID,int mark)
	{
		this.ID=ID;
		this.mark=mark;
	}
	public int getID()
	{
		return ID;
	}
	public int getMark()
	{
		return mark;
	}
	public String toString()
	{
		return String.format("ID=%d mark=%d",getID(),getMark());
	}

}
