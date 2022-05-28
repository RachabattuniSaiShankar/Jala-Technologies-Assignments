interface Student {
   public void Name();
   public void Id();
}
public class Interface2 implements Student {

   public void Name() {
      System.out.println("Name of The Student is Shankar ");
   }

   public void Id() {
      System.out.println("Student Regd. Id is 313");
   } 



   public static void main(String args[]) {
	   Interface2 s = new Interface2();
      s.Name();
      s.Id();
   }
} 