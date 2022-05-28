
public class PrivateField {

private int a=40,b=50;
    
    private void a1() {
       System.out.println("Private Method");
    }
    
    public static void main(String args[]) {
    	PrivateField ob=new PrivateField();
        System.out.println(ob.a+"  "+ob.b);
        ob.a1();
        SubField sb=new SubField();
      
    }
    
}
 
 class SubField extends PrivateField{
    public void temp(){
        System.out.println(a+"  "+b);
    }
}