class Student {
private long  id,num;
private String name;

public void setA(long i)
{
id=i;
}
public void setB(long mn)
{
num=mn;
}
public void setC(String fname)
{
name=fname;
}
public long getA()
{
return id;
}
public long getB()
{
return num;
}
public String getC()
{
return name;
}
public String toString()
{
String str=String.format("id:%s num:%s name:%s",getA(),getB(),getC());
return str;
}
}