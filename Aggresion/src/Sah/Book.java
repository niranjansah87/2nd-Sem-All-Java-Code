package Sah;

public class Book {
 String Bname;
 String Bid;
 Author A;
//Has-A relationship
 Book(String Bname,String Bid,Author A)
 {
	 this.Bname=Bname;
	 this.Bid=Bid;
	 this.A=A;
 }
 public String getN()
 {
	 return Bname;
	 
 }
 public String getid()
 {
	 return Bid;
 }
 public String toString()
 {
	 return String.format("Bname=%s%n Bid=%s%n",getN(),getid());
 }
	public static void main(String[] args) {
		Author au=new Author("Aashutosh",22);
		Book b=new Book(" Java Programming","21SC1101",au);
		/*System.out.println("----------------------------------------------------------");
		System.out.println(b.A.getN());
		System.out.println(b.A.getA());
		System.out.println("----------------------------------------------------------");
		System.out.println(b.Bname);
		System.out.println(b.Bid);
		*/
		System.out.println(au);
		System.out.println(b);
		
		

	}

}
