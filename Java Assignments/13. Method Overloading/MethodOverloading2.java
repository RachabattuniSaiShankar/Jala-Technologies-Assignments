
public class MethodOverloading2 {
	public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int x)
    {
       System.out.println(x);
    }
	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();
        obj.disp('a');
        obj.disp(5);
	}

}
