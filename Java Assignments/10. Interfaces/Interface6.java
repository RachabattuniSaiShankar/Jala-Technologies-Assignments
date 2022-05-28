
//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1
{
	// default method
	default void show()
	{
		System.out.println("Default TestInterface1");
	}
}



//Implementation class code
class Interface6 implements TestInterface1
{
	// Overriding default show method
	public void show()
	{
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
	}

	public static void main(String args[])
	{
		Interface6 d = new Interface6();
		d.show();
	}
}
