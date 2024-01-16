import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        int i,n;
        Scanner s= new Scanner (System.in);
        n=s.nextInt();
        int a[]=new int[1000];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            int l=0,h=n;
            int mid=l+n/2;
            System.out.println(a[mid]);
        }
    }
}