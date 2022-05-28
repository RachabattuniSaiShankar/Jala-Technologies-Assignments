class Constructor{

  int a,b,c;
  public Constructor() {
        System.out.println("Default constructor");
  }
  public Constructor(int x) {
    a = x;
    System.out.println("a value : "+a);
  }
  public Constructor(int x,int y) {
    b = x;
    c = y;
    System.out.println("b and c value :"+b+","+c);
  }
  
}

public class Constructor2 extends Constructor{
    
	Constructor2(){
    super();
    }
	Constructor2(int x){
        super(x);
    }
	Constructor2(int x,int y){
        super(x,y);
    }
    
    public static void main(String[] args) {
      
    	Constructor2 ob1=new Constructor2();
    	Constructor2 ob2=new Constructor2(70);
    	Constructor2 ob3=new Constructor2(40,50);
    
  }
  
    
}