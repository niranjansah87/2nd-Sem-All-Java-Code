package p4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Movie implements Comparable<Movie>{
	private String movien;
	Movie(String movien)
	{
		this.movien=movien;
	}
	public String getName()
	{
		return movien;
	}
	
	@Override
	public int compareTo(Movie o) {
		
		if(movien==o.movien)
			return 0;
		
			return 1;
		
	}
	

	public static void main(String[] args) {
		
		
		Vector<Movie> mov=new Vector<Movie>();
		
		mov.add(new Movie("KGF 2"));
		mov.add(new Movie("Bahubali 2"));
		mov.add(new Movie("RRR"));
		mov.add(new Movie("Heropanti 2"));
		mov.add(new Movie("Runway"));
		mov.add(new Movie("Shiddat"));
		Collections.sort(mov);
		System.out.println("Shortest movie");
		for(Movie s:mov)
		{
			
			System.out.println(s.movien);
		}
		

	
		
		
	
		
		 
		

	
	
	
	


	
}
}


