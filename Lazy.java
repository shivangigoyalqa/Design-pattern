public class Lazy{

    private static Lazy singleInstance = null;

 public int a;
   
    private Lazy() {
       a=10; 

    }
    public static Lazy getInstance() 
    { 
        
        if (singleInstance == null) 
        { 
            singleInstance = new Lazy(); 
        } 
        return singleInstance; 
    } 
} 

class A{
    public static void main(String args[]){
        Lazy obj1=Lazy.getInstance();
        Lazy obj2=Lazy.getInstance();
        obj1.a+=10;
        System.out.println(obj1.a);
        System.out.println(obj2.a);

    }
}