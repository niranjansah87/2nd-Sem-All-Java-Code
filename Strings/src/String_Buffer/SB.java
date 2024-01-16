package String_Buffer;

public class SB {

	

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("KL University");
		s.append("Vijayawada");
		System.out.println(s.length());
		System.out.println(s.capacity());
		s.insert(5,"IS");
		System.out.println("Inserted String "+s);
		System.out.println(s.reverse());
		System.out.println(s);
		System.out.println(s.charAt(5));
		System.out.println(s);
		System.out.println(s.delete(0, 2));
		System.out.println(s);
		System.out.println(s.replace(0, 1, "KG"));
		System.out.println(s);
		

	}

}
