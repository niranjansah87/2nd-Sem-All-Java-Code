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
			
			fw.write("2100090187   Niranjan\n");
			fw.write("2100090185   Rohit\n");
			fw.write("2100090184   Aadarsh\n");
			fw.write("2100090183   Aashutosh\n");
			fw.write("2100090144   Saif\n");
			fw.close();
			FileWriter aw=new FileWriter("Address.txt",false);
			
			aw.write("2100090187   Nepal\n");
			aw.write("2100090185   Bihar\n");
			aw.write("2100090187   Nepal\n");
			aw.write("2100090187   Nepal\n");
			aw.write("2100090185   Bihar\n");
			aw.close();
			FileReader fb=new FileReader("Names.txt");
			BufferedReader bw =new BufferedReader(fb);
			FileReader fs=new FileReader("Address.txt");
			BufferedReader bm =new BufferedReader(fs);
			
			String line,line2;
			System.out.println("******************Student Detail*********************");
			System.out.println("ID**************Name**************Address");
			System.out.println("=========================================");
			while((line = bw.readLine()) != null &&(line2 = bm.readLine()) != null)
			{
				String[] st = line.split("   ");
				String[] sj = line2.split("  ");
				String ID=st[0];
				String Name=st[1];
				String Address=sj[1];
				
				
				System.out.println(ID+"      "+Name+"             "+Address);
				
				
			}
			System.out.println("=========================================");
			fb.close();
			fs.close();
			
		} catch (IOException e) 
		{
			System.out.println(e);
		}

	}

}
