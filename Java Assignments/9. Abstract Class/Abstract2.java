abstract class Bike {
    abstract void fun();
}
 
// Class 2
class Company extends Bike {
    void fun()
    {
        System.out.println("Name of the Bike Company is BMW");
    }
}
 
// Class 3
// Main class
class Abstract2 {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Uncommenting the following line will cause
        // compiler error as the line tries to create an
        // instance of abstract class. Base b = new Base();
 
        // We can have references of Base type.
    	Bike b = new Company();
        b.fun();
    }
}