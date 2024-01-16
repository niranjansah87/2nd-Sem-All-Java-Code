import java.util.Scanner;
class MyCalculator {
    
    public long power(int n, int p) throws Exception
    {
        if(n == 0 && p == 0)
            throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long)(Math.pow(n,p));
    }
    public static void main(String[] args) {
    	 MyCalculator my_calculator = new MyCalculator();
    	 Scanner in = new Scanner(System.in);
        
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            
        }
    
}
}

    
    
    