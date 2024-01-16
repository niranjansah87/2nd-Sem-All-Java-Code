package lab;

public class Rectangle extends Shape{
	int width,height;
	Rectangle(int width,int height) {
		super(numslides);
		this.width=width;
		this.height=height;
	}

	@Override
	public int getArea() {
		return width*height;
		
	}

	@Override
	public int getPermeter() {
		int per=2*(width+height);
		return per; 
		
	}

	@Override
	public void getNumSlides() {
		System.out.println("Num slides is "+numslides);
		
	}

}
