package Niranjan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Addition.txt",false);
			fw.write("10 20 30 40 50");
			fw.close();
			FileReader fr=new FileReader("Addition.txt");
			Scanner s=new Scanner(fr);
			int sum=0;
			while(s.hasNextInt())
			{
				int t=s.nextInt();
				sum=sum+t;
				
			}
			System.out.println("Addition is "+sum);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
