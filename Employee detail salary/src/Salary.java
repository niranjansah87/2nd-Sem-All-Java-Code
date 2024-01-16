
public class Salary {
private int HRA,BONUS,BasicPay;
public void setH(int sal)
{
	HRA=sal;
}
public void setB(int Bonussal)
{
	BONUS=Bonussal;
}
public void setBasic(int Pay)
{
	BasicPay=Pay;
}
public int getH() {
	return HRA;
}
public int getB() {
	return BONUS;
}
public int getBasic() {
	return BasicPay;
}
public String toString()																											
{
	String str=String.format("HRA:%s%n Bonus:%s%n Basic Pay:%s%n ",getH(),getB(),getBasic());
	return str;					
}
}
