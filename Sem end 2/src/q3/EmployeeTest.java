package q3;
import java.util.*;
class EmployeeTest
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s1= sc.next();
PAN(s1);
}
public static void PAN(String s1)
{
try
{
if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
{
System.out.println("Valid");
}
else
throw  new Exception("Invalid");
}
catch(Exception e)
{
	System.out.println(e);
}
}

}
