import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;



public class Collections2
{
	public static void main(String[] args) {
	     HashMap<Integer, String> Student  = new HashMap<>(); 
	     HashMap<Integer, String> Studentclone  = new HashMap<>(); 
	     HashMap<Integer, String> StudentDup  = new HashMap<>(); 

        Student.put(1,"Kiran");
        Student.put(2,"Ram");
        Student.put(3,"Vijay");
        Student.put(4,"Charan");
        Student.put(5,"Raju");
        Student.put(6,"Siddharth");
        Student.put(7,"Roshan");
        Student.put(8,"Aman");
        Student.put(9,"Harshi");
        Student.put(10,"Kumar");

        System.out.println("Total No.of Elements In HashMap are : " +Student);
        String Value=Student.get(4); //fetching of key value
        System.out.println("String Value of a 4 Key In HashMap is : " + Value);

         Studentclone = (HashMap)Student.clone();
         System.out.println("Before Cloning Of HashMap: " + Student); 


System.out.println("After Cloning Of HashMap: " + Studentclone); 
System.out.println("Is the key '20' present? : " + Student.containsKey(20)); 
System.out.println("Is the key '10' present? : " + Student.containsKey(10)); 
System.out.println("Is the Value 'Charan' present? : " + Student.containsValue("Charan")); 
System.out.println("Is the Value 'Kiran' present? : " + Student.containsValue("Kiran")); 
System.out.println("Is the Value 'raj' present? : " + Student.containsValue("raj")); 
System.out.println("Is HashMap Is Empty? : " + Student.isEmpty()); 
System.out.println("The size of the map is " + Student.size()); 
    System.out.println("All The Key Values of The HashMap are : ");

for (Integer keys : Student.keySet())
{
   System.out.print(keys);
}

StudentDup.put(12,"Varun");
StudentDup.put(13,"Abhi");
StudentDup.putAll(Student);
System.out.print("\n" + StudentDup);

	}
}
