package Niranjan;

public class MultipleGeneric<T,S> {
	T var;
	S var2;
	
	public void setA(T var,S var2)
	{
		this.var=var;
		this.var2=var2;
	}
	public void setB(S var2)
	{
		
		this.var2=var2;
	}
	public T getT()
	{
		return var;
	}
	public S getS()
	{
		return var2;
	}
	public static void main(String[] args) {
		MultipleGeneric<String, Float>var1=new MultipleGeneric<String, Float>();
		var1.setA("Generic class example",123.00f);
		//var1.setB();
		System.out.println(var1.getT());
		System.out.println(var1.getS());
		

	}


	

}
