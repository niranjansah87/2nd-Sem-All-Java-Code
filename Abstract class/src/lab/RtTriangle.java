package lab;

public class RtTriangle extends Shape{
	int width,height;
	RtTriangle(int width,int height) {
		super(numslides);
		this.width=width;
		this.height=height;
	}

	@Override
	public int getArea() {
		
		return 1/2*(width*height);
	}

	@Override
	public int getPermeter() {
		
		return height+width;
	}

	@Override
	public void getNumSlides() {
		System.out.println("Num slides is "+numslides);
		
	}
	

}
