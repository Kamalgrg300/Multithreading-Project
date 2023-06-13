
package multithreading;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Count {

     public static AtomicBoolean atomicBoolean = new AtomicBoolean(false);
     public static AtomicInteger ai = new AtomicInteger(0);
     public static ArrayList<Integer> candies=new ArrayList<Integer>();
     public static AtomicInteger current = new AtomicInteger(1);
     public static void setCompleted() {
        atomicBoolean.set(true);
    }
      public static boolean getCompleted() {
           return atomicBoolean.get();
    }
      
    public static void setCount() {
         ai.getAndIncrement();   
    }
    public static String getCurrent() {
         return "Student-"+getcurrent();
    }
    public static void resetCount() {
         ai.set(0);
    }
    public static int getCount() {
        return ai.get();
    }
    
    
    public static void setcurrent() {
         current.getAndIncrement();
    }
    public static void resetcurrent() {
         current.set(1);
    }
    public static int getcurrent() {
        return current.get();
    }

    public static void givecandies() {
        Random random = new Random();  
        for(int i=0;i<Manager.students.size();i++)
        {
            int x = random.nextInt(50); 
            candies.add(x);
        }
        
       }
}