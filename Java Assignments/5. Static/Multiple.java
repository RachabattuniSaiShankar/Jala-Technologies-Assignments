
public class Multiple
{      static int age;
    static String name;
    int phonenumber=866005558;
    String company="Nexus";
    
    public void instacemethod1()
    {
        
         System.out.println("Company Number is: "+phonenumber);
      
        
    }
    public void instacemethod2()

{
 
      System.out.println("Company Name is: "+company);
}    
       static void student1(){
     
      System.out.println("Age is: "+age);
      System.out.println("Name is: "+name);
}

      
 static void student2(){
     
      System.out.println("Age is: "+age);
      System.out.println("Name is: "+name);
}

	public static void main(String[] args) {
	    
	    age=20;
	    name="Kiran";
	    student1();
	     age=23;
	     name="Vikram Aditya";
	    student2();
	    Multiple call=new Multiple();
	    
	  call.instacemethod1();
	  call.instacemethod2();
	  
	    
	}



}






