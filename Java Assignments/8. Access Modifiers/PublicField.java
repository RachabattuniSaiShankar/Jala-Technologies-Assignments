
public class PublicField {

public int a=30,b=20;
    
    public void a1() {
       System.out.println("Public Method");
    }
    
   
    public static void main(String args[]) {
    	PublicField ob=new PublicField();
        System.out.println(ob.a+"  "+ob.b);
        ob.a1();
        Subcla sb=new Subcla();
	}

}

class Subcla extends PublicField{
    public void temp(){
        System.out.println(a+"  "+b);
        a1();
    }
}