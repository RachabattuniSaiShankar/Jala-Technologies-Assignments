// Example to illustrate accessing the instance method .
import java.io.*;

class Animal {

	static String name = "";

	// Instance method to be called within the
	// same class or from a another class defined
	// in the same package or in different package.
	public void nameof(String name) 
	{
		this.name = name; 
	}
}

class Staticininstance {
	public static void main(String[] args)
	{

		// create an instance of the class.
		Animal Al = new Animal();

		// calling an instance method in the class 'Foo'.
		Al.nameof("Lion");
		System.out.println(Al.name);
	}
}
