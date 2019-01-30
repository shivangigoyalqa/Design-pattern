public class Eager {

    private static Eager singletonInstance = new Eager();

 public int a;
   
    private Eager() {
       a=10; 

    }

  
    public static Eager getInstance() {
        return singletonInstance;
    }


}

class A{
    public static void main(String args[]){
        Eager obj1=Eager.getInstance();
        Eager obj2=Eager.getInstance();
        obj1.a+=10;
        System.out.println(obj1.a);
        System.out.println(obj2.a);

    }
}