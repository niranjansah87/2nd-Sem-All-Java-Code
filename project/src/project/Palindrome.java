package project;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome {

    public static void main(String[] args) {
  //local variables and objects
        String str;
        boolean check;
        Scanner keyboard = new Scanner(System.in);
        //gets input from user and saves it to str
        System.out.println("Enter a string: ");
        str = keyboard.nextLine();
        //checks if the string is a palindrome
        check = Palindrome.detect(str);
        //displays message based on resutls

        if(check) {
            System.out.println("Is a palindrome");
        }
        else

            System.out.println("Not a palindrome");

    }
    //static method using recursion to detect a palindrome
    public static boolean detect(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ,.!?-'");
        String temp = "";
        boolean isPalindrome = false;
        int length;
        while(tokenizer.hasMoreTokens()) {
            temp += tokenizer.nextToken();
        }
        //base case

        if(temp.length() == 1) {

            isPalindrome = true;

            return isPalindrome;

        }

        //recursion case

        else if(temp.charAt(0) == temp.charAt(temp.length()-1)){

            length = temp.length()-1;

            temp = temp.substring(1, length);

            System.out.println(temp);
            return detect(temp);

        }
        else {

            return isPalindrome;

        }
    }
}
