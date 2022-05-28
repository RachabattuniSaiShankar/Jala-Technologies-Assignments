public class Inheritance4 {
    public static void main(String args[]) {
    	
    	class A{
    	    public void a1() {
    	      
    	      System.out.println("Method-1 of Class A");
    	    }
    	    public void a2() {
    	        System.out.println("Method-2 of Class A");
    	      
    	    }
    	    public void test() {
    	        
    	        System.out.println("Common method - A");
    	      
    	    }
    	    
    	}

    	class B extends A{
    	    public void b1() {
    	      
    	      System.out.println("Method-1 of Class B");
    	    }
    	    public  void b2() {
    	        System.out.println("Method-2 of Class B");
    	      
    	    }
    	    @Override
    	    public void test() {
    	        System.out.println("Common method - B");
    	      
    	    }
    	}


    	class C extends A{
    	    public void c1() {
    	        System.out.println("Method-1 of Class C");
    	      
    	    }
    	    public  void c2() {
    	        System.out.println("Method-2 of Class C");
    	      
    	    }
    	    @Override
    	    public void test() {
    	        System.out.println("common Method - C");
    	      
    	    }
    	}

        A ob1=new A();
        B ob2=new B();
        C ob3=new C();
        ob1.a1();
        ob1.a2();
        ob1.test();
        ob2.b1();
        ob2.b2();
        ob2.test();
        ob3.c1();
        ob3.c2();
        ob3.test();
        
        ob2.test(); 
        ob3.test();
      
    }
}