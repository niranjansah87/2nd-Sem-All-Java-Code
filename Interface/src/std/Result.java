package std;

public class Result implements Student{
	float mark1,mark2,mark3,mark4,mark5;
	Result(float mark1,float mark2,float mark3,float mark4,float mark5)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		this.mark5=mark5;
	}
	@Override
	public void Percent() {
		float per;
		per=((mark1+mark2+mark3+mark4+mark5)/500*100);
		System.out.println("Percentage of Student is "+per +"%");
		
	}
	@Override
	public void Detail() {
		System.out.println("Student ID number is "+ID);
		System.out.println("Student Name is "+Name);
		
	} 

}
