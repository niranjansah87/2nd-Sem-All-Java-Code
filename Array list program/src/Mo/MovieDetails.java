package Mo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import Mo.Movie;

public class MovieDetails {
public static void main(String args[])
{
ArrayList<Movie> list=new ArrayList<Movie>();
int count=0;
Scanner s=new Scanner(System.in);
boolean repeat=true;
while(repeat)
{
System.out.println("1.new Details 2. Display details 3.sortbyyear 4.sortbyrating 5.Exit");
System.out.println("enter your choice");
int ch=s.nextInt();
if(ch==1)
{
System.out.println("enter movie name,yearofrelase and rating");
String name=s.next();
int year=s.nextInt();
int rating=s.nextInt();
list.add(new Movie(name,year,rating));
}
else if(ch==2)
{
System.out.println("details are");
for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}
}
else if(ch==3)
{
Collections.sort(list,newsortByYear());
System.out.println("details are");
for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}
}
else if(ch==4)
{
Collections.sort(list,newsortByYear());
System.out.println("details are");
for(int i=0;i<list.size();i++)
{
System.out.println(list.get(i));
}}
else if(ch==5)
{
repeat=false;
}
}
class newsortByYear implements Comparator<Movie>
{
public int compare(Movie a,Movie b)
{
return a.year-b.year;
}
}
class newsortByRating implements Comparator<Movie>
{
public int compare(Movie a,Movie b)
{
return a.rating-b.rating;
}
}

}


}


