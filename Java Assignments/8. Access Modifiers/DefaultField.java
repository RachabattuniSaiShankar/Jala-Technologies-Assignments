
public class DefaultField {
	 int a=10,b=20;
	    
	    void a1() {
	       System.out.println("default Method");
	    }
	public static void main(String[] args) {
		
		DefaultField ob=new DefaultField();
	        System.out.println(ob.a+"  "+ob.b);
	        ob.a1();
	        Subclass sb=new Subclass();
	}

}

class Subclass extends DefaultField{
    public void temp(){
        System.out.println(a+"  "+b);
        a1();
    }
}