import java.util.Scanner;
public class Static6 {
	static int age=20;
    static String name="Sammy";
   
    
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
				
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter  PhoneNumber: ");

	    int phonenumber =sc.nextInt();
	    System.out.println("Enter Company Name: ");
	    String companyname =sc.next();

	    System.out.println("PhoneNumber is: " + phonenumber);  // Output user input
	    System.out.println("Company Name is: " + companyname);  // Output user input

	    System.out.println("Age is: "+age);
	      System.out.println("Name is: "+name);
	  

	}

}
