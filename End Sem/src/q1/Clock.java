package q1;

public class Clock {
	private int hr,min,sec;
	public boolean setHour(int hr)
	{
		if(hr>0 && hr<23)
		{
			this.hr=hr;
			return true;
		}
		return false;
		
		
	}
	public boolean setMin(int min)
	{
		if(min>0 && min<60)
		{
			this.min=min;
			return true;
		}
		return false;
		
	}
	public boolean setSec(int sec)
	{
		if(sec>0 && sec<60)
			{
			this.sec=sec;
			return true;
		}
		return false;
		
	}
	public int getHr()
	{
		return hr;
	}
	public int getMin()
	{
		return min;
	}
	public int getSec()
	{
		return sec;
	}
	public String toString()
	{
		return String.format("%d hrs %d mins %d secs",getHr(),getMin(),getSec());
	}
	public static void main(String[] args) {
		Clock c=new Clock();
		c.setHour(9);
		c.setMin(30);
		c.setSec(45);
		System.out.println(c);

	}

}