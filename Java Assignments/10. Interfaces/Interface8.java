interface MyInterface{
   public static int num = 100;
   public void display();
}
public class Interface8 implements MyInterface{
   public static int num = 10000;
   public void display() {
      System.out.println("This is the implementation of the display method");
   }
   public void show() {
      System.out.println("This is the implementation of the show method");
   }
   public static void main(String args[]) {
	   Interface8 obj = new Interface8();
      System.out.println("Value of num of the interface "+MyInterface.num);
      System.out.println("Value of num of the class "+obj.num);
   }
}