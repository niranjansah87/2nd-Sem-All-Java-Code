
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("file2.txt",false);
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("Welcome to KLU");
			bw.newLine();
			bw.write("Admission");
			fw.close();
			System.out.println("Writing is success......");	
		}
		catch(IOException e)
		{
			System.out.println("IOError occured");
		}

	}

}
