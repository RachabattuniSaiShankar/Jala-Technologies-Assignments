class P
{  
    P()
    {
        this(10);
        System.out.println("hello");
    }  
    P(int x){  
         
        System.out.println(x);  
    }  
}  
public class Fourth{  
    public static void main(String args[])
    {  
        P p=new P();  
    }
}