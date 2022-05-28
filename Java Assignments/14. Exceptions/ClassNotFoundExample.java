public class ClassNotFoundExample {
 
    public static void main(String args[])
    {
 
        try {
 
            Class.forName("Exceptions");
        }
 
        catch (ClassNotFoundException ex) {
 
           
            ex.printStackTrace();
        }
    }
}