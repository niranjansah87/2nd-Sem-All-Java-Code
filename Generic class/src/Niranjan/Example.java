package Niranjan;

public class Example<T> {
	T var;
	public void setA(T var)
	{
		this.var=var;
	}
	public T getT()
	{
		return var;
	}
	public static void main(String[] args) {
		Example<String>var1=new Example<String>();
		Example<Float>var2=new Example<Float>();
		var1.setA("Generic class example");
		var2.setA(123.00f);
		System.out.println(var1.getT());
		System.out.println(var2.getT());
		

	}


	

}
