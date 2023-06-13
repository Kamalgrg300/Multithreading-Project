
package multithreading;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student implements Runnable  
{    
 //////////////////////////////////////////////////////
        int int_random;  
        public static int count=0;
        public static long time;
        Count counter=new Count();
 ///////////////////////////////////////////////////////////
       
        
        public Student(long timer) 
        {
           time=timer;
        } 
      
        public void msg(String m) 
        {
          System.out.println("["+(System.currentTimeMillis()-time)+"] "+Thread.currentThread().getName()+" :  "+m);
        }
       public void run()  
        {    
           
            try {
                 sleep(100);
                 Count.setCount();
                 msg("");
                 sleep(100);
                 yield();
                 yield(); 
                 Count.setCount();
                 while(!Count.getCompleted()){
                   sleep(100);
                 }
             
                while(!(Thread.currentThread().getName().equals(Count.getCurrent()))){}
                if(Thread.currentThread().getName().equals(Count.getCurrent()))
                {
                        msg("Candies= "+Count.candies.get(Count.getcurrent()-1));
                        Count.setcurrent();
                        Count.setCount();
                }
                sleep(1000);
             
                while(Manager.groups.isAlive()){}
                if(!Manager.groups.isAlive()){
                      int group= (int)(Math.random()*(Manager.no_of_groups-1+1)+1);  
                      msg("Belongs to group "+group);
                      Manager.grouped.get(group-1).setNumberofStudents();
                  
//                   while(Manager.grouped.get(group-1).getIterator()>=0)
//                   {
                      while(!Manager.grouped.get(group-1).getInvite()){}
                      int candy= (int)(Math.random()*(10-1+1)+1);
                      Manager.grouped.get(group-1).setTotalCandies(candy);
                      Count.setCount();
                  // }
                      
                }
              
            } catch (InterruptedException ex) {
                  System.out.println("Interrupted.... ");
            }
        } 
       
        
}
