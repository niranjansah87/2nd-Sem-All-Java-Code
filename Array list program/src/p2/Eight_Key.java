package p2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
public class Eight_Key {
	
	public static void main (String[] args) {
	ArrayList<String> a1=new ArrayList<String> ();
	Scanner sc=new Scanner (System.in);
	for (int i=0;i<5;i++)
	a1.add (sc.next());
	sc.close();
	Collections.sort (a1);
	Iterator itr=a1.iterator ();
	while (itr.hasNext()){
	System.out.println(itr.next());
	}
	}
	}



