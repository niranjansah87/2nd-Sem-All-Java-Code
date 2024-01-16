package Niranjan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("Names.txt",false);
			fw.write("ID           Names\n");
			fw.write("2100090187   Niranjan\n");
			fw.write("2100090185   Rohit\n");
			fw.close();
			FileWriter aw=new FileWriter("Address.txt",false);
			aw.write("ID           Address\n");
			aw.write("2100090187   Nepal\n");
			aw.write("2100090185   Bihar\n");
			aw.close();
			FileReader fb=new FileReader("Names.txt");
			BufferedReader bw =new BufferedReader(fb);
			FileReader fs=new FileReader("Address.txt");
			BufferedReader bm =new BufferedReader(fs);
			
			String line,line2;
			System.out.println("Student Detail");
			System.out.println("ID              Name               Address");
			while((line = bw.readLine()) != null &&(line2 = bm.readLine()) != null)
			{
				String[] st = line.split("   ");
				String[] sj = line2.split("  ");
				String ID=st[0];
				String Name=st[1];
				String Address=sj[1];
				
				
				System.out.println(ID+"      "+Name+"             "+Address);
				
			}
			fb.close();
			fs.close();
			
		} catch (IOException e) 
		{
			System.out.println(e);
		}

	}

}