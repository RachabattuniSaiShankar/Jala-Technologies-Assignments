public class LocalGlobal {
   public void Rank() {
      int rank = 0;
      rank = rank + 7;
      System.out.println("Rank = " + rank);
   }
   public static void main(String args[]) {
	   LocalGlobal lg = new LocalGlobal();
      lg.Rank();
   }
}