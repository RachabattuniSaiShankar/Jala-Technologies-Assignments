public class Constructor1{

	  int a,b,c;
	  public Constructor1() {
	        System.out.println("Default constructor");
	  }
	  public Constructor1(int x) {
	    a = x;
	    System.out.println("a value : "+a);
	  }
	  public Constructor1(int x,int y) {
	    b = x;
	    c = y;
	    System.out.println("b and c value :"+b+","+c);
	  }
	  

	  public static void main(String[] args) {
	      
		  Constructor1 ob1 = new Constructor1();
		  Constructor1 ob2 = new Constructor1(10);
		  Constructor1 ob3 = new Constructor1(20,30);
	  }
	}