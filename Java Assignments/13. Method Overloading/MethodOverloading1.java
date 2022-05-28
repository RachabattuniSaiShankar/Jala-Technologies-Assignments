
public class MethodOverloading1 {
	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
	public static void main(String[] args) {
		MethodOverloading1 obj = new MethodOverloading1();
	       obj.disp('a');
	       obj.disp('a',10);
	}

}
