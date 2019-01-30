public class ThreadSafe{

    private static ThreadSafe singleInstance = null;

 public int a=10;
   
    private ThreadSafe() {
      

    }
    
public synchronized static ThreadSafe getInstance() 
    { 
        
        if (singleInstance == null) 
        { 
            singleInstance = new ThreadSafe(); 
        } 
        return singleInstance; 
    } 
} 

class B{
    public static void main(String args[]){
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafe instance1 = ThreadSafe.getInstance();
                System.out.println("Instance 1 hash:" + instance1.hashCode());
            }
        });

      
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafe instance2 = ThreadSafe.getInstance();
                System.out.println("Instance 2 hash:" + instance2.hashCode());
            }
        });

        
        t1.start();
        t2.start();

    }
}