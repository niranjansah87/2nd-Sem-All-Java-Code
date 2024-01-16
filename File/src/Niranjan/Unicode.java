package Niranjan;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Unicode {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("");
			OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-16");
			BufferedWriter bw =new BufferedWriter(osw);
			bw.write("我爱你");
			
			bw.newLine();
			
			bw.write("0x10FFFF");
			
			bw.close();
			
			System.out.println("Writing is success......");	
			
		}
		catch(IOException e)
		{
			
			System.out.println("IOException occured");
		}

	}

}
