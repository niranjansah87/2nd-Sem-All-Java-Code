package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

class MyException extends Exception { //myException is user define Exception
    int age;
    MyException(int a)
    {
        age = a;
    }

    public String toString()
    {
        String str = String.format("Person not elegible for vote");
        return str;
    }



    public static void main(String[] args) {
        System.out.println("Enter the Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if (age<18)
            {
                throw new MyException(age);  //object creation
            }
            else
            {
                System.out.println("Eligible to vote");
            }
        }
        catch (MyException e) //raises exception passed here
        {
            System.out.println(e);
        }
    }
}
