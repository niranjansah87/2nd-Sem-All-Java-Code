package labin;




import java.util.LinkedList;
import java.util.Scanner;
public class Student {
    public static Scanner s=new Scanner(System.in);
 
  
    private String gender;
    private String name;
    private String branch;
    private int id;
   
    
   
    public Student(int id,  String name, String branch ){
       
        
        this.id = id;
        this.name = name;
        
        this.branch = branch;
    }
   
  
    public String getGender() {
        return gender;
    }
 
    
 
    public String getName() {
        return name;
    }
   
    
   
    public String getBranch() {
        return branch;
    }
   
    
   
    public int getId() {
        return id;
    }
   
    public void setIds(int id) {
        this.id = id;
    }
   public String toString()
   {
       return id+" "+name+" "+branch;
   }
  
   


public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<Student>();
        int n=s.nextInt();
        while(n-->0)
        {
            list.add(new Student(s.nextInt(),s.next(),s.next()));
            
        }
        
       
       
    int rec=s.nextInt();
        for(Student data:list){
                  if(data.getId()==rec){
                      System.out.println(data);
                      return;
                  } 
        }
        System.out.println("Not Found"); 
    
       
    }
       
    }