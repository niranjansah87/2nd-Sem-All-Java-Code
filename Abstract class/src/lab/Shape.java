package lab;

abstract class Shape {
	static int numslides;
	Shape(int numslides){
		this.numslides=numslides;
	}
	public int getNumSlide()
	{
		return numslides;
	}
	public abstract int getArea();
	public abstract int getPermeter();
	public abstract void getNumSlides();

}
