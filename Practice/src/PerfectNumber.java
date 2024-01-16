import java.util.Scanner;
public class PerfectNumber {
   public static boolean Perfect(int num){
      for(int i=1; i*i<=num; i++) {
         if((num%i == 0) && (num/i==i))
         return true;
      }
      return false;
   }
   public static void main(String[] args) {
      int number ;
      boolean result = false;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number::");
      number = scan.nextInt();
      result = Perfect(number);
      if(result)
         System.out.println("Perfect Square");
      else
         System.out.println("Not a Perfect Square");
   }
   }
