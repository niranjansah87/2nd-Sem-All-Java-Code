package Mo;


import java.util.Comparator;
class Movie
{
String name;
int year,rating;
Movie(String name,int year,int rating)
{
this.name=name;
this.year=year;
this.rating=rating;
}
public String toString()
{
String msg;
msg=String.format("name=%s yearOfRelease=%d Rating=%d",name,year,rating);
return msg;
}
}
