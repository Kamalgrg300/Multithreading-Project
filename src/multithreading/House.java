
package multithreading;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class House implements Runnable  
{    
        
 ///////////////////////////////////////////////////////////
       public static long time;
       public static int count=0;
 ///////////////////////////////////////////////////////////
        
        public House(long timer) 
        {
           time=timer;
        } 
      
        public void msg(String m) 
        {
           System.out.println("["+(System.currentTimeMillis()-time)+"] "+Thread.currentThread().getName()+": "+m);
        }
        public void run()  
        {    
              int prev=0;
              while(Manager.groups.isAlive()){}
              msg(""); 
              int index= (int)((Math.random()*(Manager.no_of_groups-1+1)+1))-1;
              try 
              {         
//              while(Manager.grouped.get(index).getIterator()>=0)
//                   {
                    while(index==prev){ index= (int)((Math.random()*(Manager.no_of_groups-1+1)+1))-1;  }
                    prev=index;
                    Manager.grouped.get(index).setInvite();
                    Count.resetCount();
                    sleep(1000);
                    while(Count.getCount()<Manager.grouped.get(index).getNumberofStudents()){}
                    Manager.grouped.get(index).setIterator();
                    Manager.grouped.get(index).resetInvite();
                 //   index= (int)((Math.random()*(Manager.no_of_groups-1+1)+1))-1;
//                   }
              Manager.display();
              }
              catch (InterruptedException ex) {
                     
                  }
        } 
     
    
}
