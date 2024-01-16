
public class Engine {
	 private int EngineID;
	 private  String EngineType;
	 private int horshpower;
	 private  float EngineWeight;
	 Engine(int EngineID,String EngineType,int horshpower,float EngineWeight )
	 {
		 this.EngineID=EngineID;
		 this.EngineType=EngineType;
		 this.horshpower=horshpower;
		 this.EngineWeight=EngineWeight;
	 }
	 public int getEID()
	 {
		 return EngineID;
	 }
	 public String getEngineT()
	 {
		 return EngineType;
	 }
	 public int getHorsh()
	 {
		 return horshpower;
	 }
	 public float getWeight()
	 {
		 return EngineWeight;
	 }
	 public String toString()
	 {
		 String s=String.format("Engine Id:%d%n  Horsh Power:%d%n Engine Weight:%f%n",getEID(),getEngineT(),getHorsh(),getWeight());
		 return s;
	 }


}
