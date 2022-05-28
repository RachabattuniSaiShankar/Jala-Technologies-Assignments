class X{
    public void x1() {
      
      System.out.println("Method-1 of Class X");
    }
    public void x2() {
        System.out.println("Method-2 of Class X");
      
    }
    public void test() {
        
        System.out.println("Common method - X");
      
    }
    
}


class Y extends X {
    public void y1() {
      
      System.out.println("Method-1 of Class Y");
    }
    public  void y2() {
        System.out.println("Method-2 of Class Y");
      
    }
    @Override
    public void test() {
        System.out.println("Common method - Y");
      
    }
}


class Z extends X{
    public void z1() {
        System.out.println("Method-1 of Class Z");
      
    }
    public  void z2() {
        System.out.println("Method-2 of Class Z");
      
    }
    @Override
    public void test() {
        System.out.println("common Method - Z");
      
    }
}


public class Inheritance3 {
    public static void main(String args[]) {
        X ob1=new X();
        Y ob2=new Y();
        Z ob3=new Z();
        ob1.x1();
        ob1.x2();
        ob1.test();
        ob2.y1();
        ob2.y2();
        ob2.test();
        ob3.z1();
        ob3.z2();
        ob3.test();
        
        ob2.test(); 
        ob3.test();
      
    }
}