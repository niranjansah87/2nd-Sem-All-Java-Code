package S8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class Movie implements Comparable<Movie> {
    String mname;

    Movie(String s) {
        mname = s;
    }

    public String toString() {
        return mname;
    }
    @Override
    public int compareTo(Movie other) {
        
        Integer l1 = mname.length();
        Integer l2 = other.mname.length();
        return l1.compareTo(l2);
    }
    public static void main(String[] args) {
   	
        ArrayList<Movie> mov = new ArrayList<>();
        mov.add(new Movie("KGF 2"));
		mov.add(new Movie("Bahubali 2"));
		mov.add(new Movie("RRR"));
		mov.add(new Movie("Heropanti 2"));
		mov.add(new Movie("Runway"));
		mov.add(new Movie("Shiddat"));
        
        Collections.sort(mov);
        System.out.println("=======Sorted by length===================");
        for(Movie m:mov)
        {
        	
        	System.out.println(m);
        	
        }
        System.out.println("==========================================");
        System.out.println("Shortest: " + Collections.min(mov));
        System.out.println("Longest: " + Collections.max(mov));
}
    
}