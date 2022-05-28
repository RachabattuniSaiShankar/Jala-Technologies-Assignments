class S
{  
    S()
    {
        System.out.println("hello");
    }  
    S(int x){  
        this();  
        System.out.println(x);  
    }  
}  
public class Third {

	public static void main(String[] args) {
		 S s=new S(10);  
	}

}
