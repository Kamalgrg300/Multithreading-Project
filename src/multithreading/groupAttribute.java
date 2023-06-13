
package multithreading;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class groupAttribute {
     public static AtomicBoolean invite = new AtomicBoolean(false);
     public  AtomicInteger numberofStudents = new AtomicInteger(0);
     public  AtomicInteger totalCandies = new AtomicInteger(0);
       public  AtomicInteger iterator = new AtomicInteger(Manager.no_of_groups);
      public String name;
    public  void setInvite() {
          invite.set(true);
    }
 public  void resetInvite() {
          invite.set(false);
    }
    public  void setNumberofStudents() {
        numberofStudents.getAndIncrement(); 
    }

    public groupAttribute(String name) {
        this.name=name;
    }

    public void setIterator() {
        numberofStudents.getAndDecrement(); 
    }

    public int getIterator() {
        return iterator.get();
    }
    
    public  void setTotalCandies(int val) {
        totalCandies.addAndGet(val);
    }

    public Boolean getInvite() {
        return invite.get();
    }

    public  int getNumberofStudents() {
        return numberofStudents.get();
    }

    public  int getTotalCandies() {
        return totalCandies.get();
    }
}
