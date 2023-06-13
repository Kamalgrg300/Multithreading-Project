
package multithreading;

import java.util.ArrayList;
import static multithreading.Manager.grouped;
import static multithreading.Manager.no_of_groups;


public class Main 
{ 
   
    public static long time = System.currentTimeMillis();
    public static void main(String args[])  
    {   
        
        Student student=new Student(time);
        House house=new House(time);
        int students=20;
        Manager.no_of_groups=4;
        for(int i=0;i<no_of_groups;i++)
        {
            grouped.add(new groupAttribute("Group-"+(i+1)));
        }
        for(int i=0;i<students;i++)
        {
            Manager.students.add(new Thread(student));
            Manager.students.get(i).setName("Student-"+(i+1));
     
        }
     
            Manager.groups.setName("Teacher-"+1);
        
        for(int i=0;i<3;i++)
        {
            Manager.houses.add(new Thread(house));
            Manager.houses.get(i).setName("House-"+(i+1));
        }
        System.out.println("Main Thread ");
        
        for(int i=0;i<students;i++)
        {
            Manager.students.get(i).start();
        }
        
            Manager.groups.start();
         for(int i=0;i<Manager.houses.size();i++)
            {
                Manager.houses.get(i).start();
            }
    }    
} 
