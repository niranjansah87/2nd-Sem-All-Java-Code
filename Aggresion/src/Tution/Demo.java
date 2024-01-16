package Tution;

public class Demo {

	public static void main(String[] args) {
		TutionCenter tu=new TutionCenter();
		tu.setName("Niranjan");
		tu.setAdd("Vijayawada");
		tu.setSeat(50);
		tu.setNum(982675349);
		TutionMaster tm=new TutionMaster();
		tm.setNam("Aashu");
		tm.setCo("CTOOD");
		tm.setSal(50000);
		tm.sethour(6);
		
		System.out.println(tu);
		System.out.println(tm);
		
		
		
	}

}
