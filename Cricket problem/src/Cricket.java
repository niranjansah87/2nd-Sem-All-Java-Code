
public class Cricket {
	 static String name;
	 static String Country;
	 static int Matchplay;
	 static int TotalRuns;
	 Cricket(String nplayer,String Cout,int play,int totalruns )
	 {
		 name=nplayer;
		 Country=Cout;
		 Matchplay=play;
		 TotalRuns=totalruns;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String getCout()
	 {
		 return Country;
	 }
	 public int getMat()
	 {
		 return Matchplay;
	 }
	 public int getRun()
	 {
		 return TotalRuns;
	 }
	 public String toString()
	 {
		 String s=String.format("Name:%s%n Country:%s%n Match played:%d%n Total Runs:%d%n",getName(),getCout(),getMat(),getRun());
		 return s;
	 }

}
