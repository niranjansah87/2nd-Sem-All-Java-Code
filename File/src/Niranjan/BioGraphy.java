package Niranjan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BioGraphy {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Niranjan.txt",false);
			BufferedWriter bw=new BufferedWriter(fw);
			fw.write("Name:Niranjan sah\n");
			fw.write("Age:19\n");
			fw.write("Branch:CSIT\n");
			fw.write("University:KL University\n");
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
