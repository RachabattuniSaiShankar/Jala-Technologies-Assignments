interface InterfaceDemo{
    
	default public void displayNameDefault(String name){
	       System.out.println("Your name is : " + name);
	   }
	    public void displayName(String name);
	    public void displayNameAndDesignation(String name, String designation);
	}

public class CallInterfaceMethod {
	 public static void main(String args[]){
         InterfaceDemo demo = new InterfaceDemo1();
         demo.displayName("Shankar");
         demo.displayNameAndDesignation("Shankar", "Java Developer");
         demo.displayNameDefault("Shankar");
      }
}

// This program is having interfacedemo1.java