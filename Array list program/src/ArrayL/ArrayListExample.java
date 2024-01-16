package ArrayL;

import java.util.*;
public class ArrayListExample
{
public static void main(String args[])
{

List<Float> list = new ArrayList<Float>();

list.add(12.4f);
list.add(34.6f);
list.add(56.8f);
list.add(78.9f);

for(Float f:list)
{
System.out.println(f);
}
}
}

