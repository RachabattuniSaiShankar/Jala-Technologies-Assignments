class X
{  
    X()
    {
        this(10);
        System.out.println("hello");
    }  
    X(int x){  
         
        System.out.println(x);  
    }  
}  
public class Fourth {

	public static void main(String[] args) {
		X x=new X();  
	}

}
