class Constructors{

  int a,b,c;
  public Constructors() {
        System.out.println("Default constructor");
  }
  private Constructors(int a) {
    a=10;
    System.out.println("a value : "+a);
  }
  protected Constructors(int x,int y) {
    b = x;
    c = y;
    System.out.println("b and c value :"+b+","+c);
  }
  
}

public class Constructor3 extends Constructors{
    
	Constructor3(){
    super();
    }
	
	Constructor3(int x,int y){
        super(x,y);
    }
    
    public static void main(String[] args) {
      
    	Constructor3 ob1=new Constructor3();
    	Constructor3 ob3=new Constructor3(50,90);
    
  }
  
    
}