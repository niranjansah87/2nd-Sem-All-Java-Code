import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadFromFile {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("file.txt",false);
		fw.write("10 21 40 60");
		fw.close();
		
		FileReader fr=new FileReader("file.txt");
		Scanner sc = new Scanner(fr);
		int even=0,odd=0;
		while(sc.hasNextInt())
		{
			int t=sc.nextInt();
			if(t%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Number of evens="+even);
		System.out.println("Number of odds="+odd);
	

	}

}
