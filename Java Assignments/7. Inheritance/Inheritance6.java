class P
{
    int x = 10;
}
  
// class B
class Q extends P
{
    int x = 20;
}
  
// Driver class
public class Inheritance6
{
    public static void main(String args[])
    {
        P p = new Q(); 
  
        // Data member of class A will be accessed
        System.out.println(p.x);
    }
}