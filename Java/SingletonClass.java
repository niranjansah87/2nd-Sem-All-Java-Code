public class Singleton{
    private static Singleton instance=new Singleton();
    private Singleton()
    {

    }

   public static Singleton getInstance()
   {
    return instance;
   }
   public void Name()
   {
    System.out.println("I am Niranjan sah");
   }
   public static void main(String[] args) {
    Singleton object=Singleton.getInstance();
    object.Name();

   }
}