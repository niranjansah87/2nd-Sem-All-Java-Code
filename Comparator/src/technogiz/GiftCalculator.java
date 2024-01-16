package technogiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GiftCalculator implements Comparable<GiftCalculator> {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t<10)
		{
			int g=s.nextInt();
			int n=s.nextInt();
			ArrayList<Integer>gf=new ArrayList<Integer>();
					for(int i=0;i<n;i++)
					{
						gf.add(s.nextInt());
					}
					Collections.sort(gf);
					for(Integer c:gf)
					{
						System.out.println(c);
					}
		}

	}

	@Override
	public int compareTo(GiftCalculator o) {
		if()
		return 0;
	}

}
