
public class Static5 {
	static int add()
{
		int x=10,y=20;
		int z=x+y;
	return z;
	
}
	void display()
	{
		int a = add();
		System.out.println("Addition of Two numbers is : "+ a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static5 obj =new Static5();
		obj.display();
	}

}
