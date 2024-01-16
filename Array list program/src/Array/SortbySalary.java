package Array;

import java.util.Comparator;
public  class SortbySalary implements Comparator<Employee>
{
public int compare(Employee e1, Employee e2)
{
return (int)(e1.getsal()-e2.getsal());
}
}
