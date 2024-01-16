package pack1;

public class Cuboid {
      private double l,b,h;
      public boolean setL(int len)
      {
    	  if(len>0)
    	  {
    		  l=len;
    		  return true;
    	  }
		return false;  
      }
      public boolean setB(int bre)
      {
    	  if(bre>0)
    	  {
    		  b=bre;
    		  return true;
    	  }
		return false;  
      }
      public boolean setH(int hei)
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
      public double Volume()
      {
    	  return l*b*h;
      }
      public   String     toString( )
		{
	String   str = String.format("Length :%s%nBreadth :%s%nHeight :%s%nVolume :%f Cu.m",getL( ),getB( ),getH( ),Volume( ));
			
			return   str;
		}
		
}


