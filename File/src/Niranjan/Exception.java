package Niranjan;

import java.io.FileWriter;
import java.io.IOException;

public class Exception {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("file1.txt",true);
			fw.write("File operationz");
			fw.write("\r\n");
			fw.write("Program");
			fw.close();
			System.out.println("Writing is success......");	
		}
		catch(IOException e)
		{
			System.out.println("IOException occured");
		}

	}

}
