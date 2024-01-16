package m;

import java.util.Scanner;

public class CandidateCode { 
	public static void main(String args[] ) throws Exception {
   //Write code here 
		Scanner ob = new Scanner(System.in);
		int lh = ob.nextInt(); 
		int lm = ob.nextInt();
int th = ob.nextInt();
int tm = ob.nextInt();
int hh = lh + th;
int mm = lm + tm;
if(mm > 59) { 
	hh += 1;
	mm = mm - 60;
	}
if(hh > 23) { 
	hh = hh - 24;
	}
System.out.print(String.format("%02d %02d", hh, mm)); 
}
}