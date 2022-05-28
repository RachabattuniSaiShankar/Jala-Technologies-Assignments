class A
{
   public int a=10;
}
public class B extends A{
	public int a=20;
	   public void test(){
		System.out.println("parent class variable :"+super.a);
		System.out.println("child class variable :"+this.a);
	   }
	   
	public static void main(String[] args) {
		B obj= new B();	
		obj.test();
	}

}
