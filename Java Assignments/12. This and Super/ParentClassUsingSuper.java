
class parent
{
   
   parent(){
	System.out.println("constructor of parent class");
   }
}
public class ParentClassUsingSuper extends parent
{
   ParentClassUsingSuper(){
	super();
	System.out.println("Constructor of child class");
   }
   public static void main(String args[]){		
	   ParentClassUsingSuper pcus= new ParentClassUsingSuper();	 
   }
}
