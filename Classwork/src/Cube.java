 class Cube {
	 private double l,b,h;
	 public boolean SetL(double len)
	 {
		 if(len>0)
		 {
			 l=len; 
			 return true;
		 }
		 return false;
	 }
	 public boolean SetB(double bre)
	 {
		 if(bre>0)
		 {
			 
			 b=bre; 
			 return true;
		 }
		 return false;
	 }
	 public boolean SetH(double hei)
	 {
		 if(hei>0)
		 {
			 h=hei;
			 return true;
		 }
		 return false;
	 	
	 }
	 public String getL()
	 {
	 	return l+"m";
	 }
	 public String getB()
	 {
	 	return b+"m";
	 }
	 public String getH()
	 {
	 	return h+"m";
	 }
	 public String Volume()
	 {
		 return l*b*h+"cu.m";
	 }
	 public String toString()
	 {
	 	String str=String.format("l:%s b:%s h:%s Volume:%s",getL(),getB(),getH(),Volume());
	 			return str;					
	 }
	  }

