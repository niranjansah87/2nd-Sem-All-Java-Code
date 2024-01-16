package Niranjan;
import java.util.Scanner;
public class Hospital {
	String HospitalName;
	String HospitalAddr;
	public Hospital(String hosname, String hosaddr) {
		HospitalName=hosname;
		HospitalAddr=hosaddr;
    }
	private  String getHospitalName()
	{
		
		return HospitalName;
		
	}
	private  String getHospitalAddr()
	{
		
		return HospitalAddr;
		
	}
	class Doctor{
		String docName;
		private  void SetDocAddr(String docName)
		{
			this.docName=docName;
			
		}
		private String getDocName()
		{
			return this.docName;
			
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
	}

}
