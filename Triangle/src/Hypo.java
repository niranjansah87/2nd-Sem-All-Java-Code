
public class Hypo {
private double sideA,sideB;
public void setA(double a)
{
	sideA=a;
}
public void setB(double b)
{
	sideB=b;
}
public double setA()
{
	return sideA;
}
public double setB()
{
	return sideB;
}
public double Result()
{
	return (Math.sqrt(Math.sqrt(sideA)+Math.sqrt(sideB)))/2;
}
public String toString()
{
	String str=String.format("Side A:%s%n Side b:%s%n Hypotenuse:%s%n",setA(),setB(),Result());
	return str;
}
}
