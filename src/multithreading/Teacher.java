
package multithreading;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teacher implements Runnable  
{    
    
 ///////////////////////////////////////////////////////////
          public static int count=0;
         public static long time;
        
        public Teacher(long timer) 
        {
           time=timer;
        } 
        public void msg(String m) 
        {
          System.out.println("["+(System.currentTimeMillis()-time)+"] "+Thread.currentThread().getName()+": "+m);
        }
        public void run()  
        {    
                   try {
                        while(Count.getCount()<Manager.size){}
                        msg("All Students Reached in classroom");
                        Count.resetCount();
                        msg("Students hesitating for a bit");
                        while(Count.getCount()<Manager.size){}
                        msg("Lecture Started");
                        sleep(100);
                        Count.resetCount();
                        Manager.settingPriority(); 
                        Count.setCompleted();
                        Count.givecandies();
                        while(Count.getCount()< Manager.size){}
                        sleep(1000);
                        msg("Teacher Thread Finished");
                    } catch (InterruptedException ex) {
                 
              }
              
//            }
        } 
       
}
