import java.util.HashSet;
import java.util.*;

public class Collections3
{
	public static void main(String[] args) {
    HashSet<String> colors = new HashSet<String>();
    colors.add("Yellow");
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");
    colors.add("Violet");
    colors.add("Black");
    colors.add("White");
    colors.add("Pink");
    colors.add("Brown");
System.out.println("Elements in the HashSet are : " +colors);
System.out.println("Is Color Yellow in the HashSet : " + colors.contains("Yellow"));
System.out.println("Is Color DarkGreen in the HashSet : " + colors.contains("DarkGreen"));
colors.add("Violet");
System.out.println("What happens if We add Duplicate Value in the HashSet : ");
System.out.println("Even if we add Duplicate values it will take single value: "+colors);
colors.remove("Orange");
System.out.println("After Removing Orange: " + colors);
System.out.println("Check If HashSet isEmpty or Not : " + colors.isEmpty());
HashSet<String> allcolors = new HashSet<String>();
allcolors.add("Saffron");
allcolors.add("Light Blue");
allcolors.add("Light Green");
allcolors.addAll(colors);
System.out.println("After coping ELements from HashSet1 to HashSet2 :" + allcolors);
System.out.println("Size of the Colors Hashset: " + colors.size());
System.out.println("Size of the allcolors Hashset: " + allcolors.size());
               System.out.print("ELements in allcolors : ");

Iterator<String> i=allcolors.iterator();  
           while(i.hasNext())  
           {  
           System.out.print(" "+i.next());  
           }  
           boolean Value =colors.equals(allcolors);
           System.out.println("\nIs Colors HashSet1 is equals to Allcolors HashSet2: " + Value);
           
            System.out.println("HashCode value is : " + colors.hashCode()); 
             System.out.println("HashCode value is : "+ allcolors.hashCode()); 
          colors.clear();
System.out.println("After Clearing the Colors Hashset : "+ colors);
allcolors.clear();
System.out.println("After Clearing the allcolorsColors Hashset : "+ allcolors);



    
	}
}
