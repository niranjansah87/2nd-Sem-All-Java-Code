package c1;

public class InvalidID extends Exception{
	int eid;
	InvalidID(int eid){
		this.eid=eid;
		
	}
	public String toString()
	{
		return "Invalid ID"+eid;
	}

}
 class InvalidType extends Exception{
	String type;
	InvalidType(String type){
		this.type=type;
		
	}
	public String toString()
	{
		return "Invalid Type"+type;
	}

}
class InvalidPower extends Exception{
	int pow;
	InvalidPower(int pow){
		this.pow=pow;
		
	}
	public String toString()
	{
		return "Invalid Power"+pow;
	}

}
class InvalidWeight extends Exception{
	float wei;
	InvalidWeight(float engineWeight){
		this.wei=engineWeight;
		
	}
	public String toString()
	{
		return "Invalid Weight"+wei;
	}

}
