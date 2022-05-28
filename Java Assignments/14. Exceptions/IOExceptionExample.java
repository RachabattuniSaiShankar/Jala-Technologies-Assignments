
import java.util.*;

public class IOExceptionExample {
    public static void main(String[] argv)
        throws Exception
    {
  
        String s = "This is IO Exception Example";
  
        
        Scanner scanner = new Scanner(s);
  
        System.out.println("" + scanner.nextLine());
  
        System.out.println("" + scanner.ioException());
  
        scanner.close();
    }
}