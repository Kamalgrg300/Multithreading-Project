
package multithreading;

import java.util.ArrayList;
import static multithreading.Main.time;


public class Manager {
    public static ArrayList<Thread> students = new  ArrayList<Thread>();
    public static ArrayList<Thread> houses = new  ArrayList<Thread>();
    public static  Thread groups = new  Thread(new Teacher(time));;
    public static int no_of_groups=4;
    public static ArrayList<groupAttribute> grouped = new  ArrayList<groupAttribute>();
     public static int size=students.size();
    
    public static void settingPriority(){
        for(int i=0;i<students.size();i++)
        {
            students.get(i).setPriority(Thread.MAX_PRIORITY);
        }
    }
     public static void resetPriority(){
        for(int i=0;i<students.size();i++)
        {
            students.get(i).setPriority(Thread.NORM_PRIORITY);
        }
    }

    public static void settingMinPriority() throws InterruptedException {
        for(int i=0;i<students.size();i++)
        {
            students.get(i).join();
        }
       }

    static void display() {
        for(int i=0;i<grouped.size();i++)
        {
            System.out.println(grouped.get(i).name+" "+grouped.get(i).getTotalCandies()/grouped.get(i).getNumberofStudents());
        }
     }
}
