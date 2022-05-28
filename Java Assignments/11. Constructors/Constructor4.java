import java.util.*;
public class Constructor4{
   String name;
   int age;
   
   Constructor4(String name, int age){
      this.name = name;
      this.age = age;
      System.out.println("This is the constructor of the demo class");
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of name: ");
      
      String name = sc.nextLine();
      System.out.println("Enter the value of age: ");
      
      int age = sc.nextInt();
      Constructor4 obj = new Constructor4(name, age);
      
      System.out.println("Value of the instance variable name: "+name);
      System.out.println("Value of the instance variable age: "+age);
   }
}