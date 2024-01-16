package sahithi;

public class Engine {
	private int EID;
	 private  String EType;
	 private int power;
	 private  float EWeight;
	 Engine(int EID,String EType,int power,float EWeight )
	 {
		 this.EID=EID;
		 this.EType=EType;
		 this.power=power;
		 this.EWeight=EWeight;
	 }
	 public int getEID()
	 {
		 return EID;
	 }
	 public String getEngineT()
	 {
		 return EType;
	 }
	 public int getHorshPow()
	 {
		 return power;
	 }
	 public float getWeight()
	 {
		 return EWeight;
	 }
	 public String toString()
	 {
		 String s=String.format("Engine Id:%d%n  Horsh Power:%d%n Engine Weight:%f%n",getEID(),getEngineT(),getHorshPow(),getWeight());
		 return s;
	 }

}
