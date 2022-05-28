class A1
{
	
	int i,j;
	public void show()
	{
	System.out.println("A1");
	}
}
class B1 extends A1
{
	int i;
	
	public void show()
	{
		super.i=8;
		super.show();
		System.out.println("B1");
	}
}
class C1 extends A1
{
	int j;
	
	public void show()
	{
		super.j=10;
		super.show();
		
		System.out.println("C1");
	}
}
 public class Inheritance5 {
  public static void main(String[] args) {
	  B1 obj1 = new B1();
		obj1.show();
		
	  C1 obj2 = new C1();
		obj2.show();
 }
}
