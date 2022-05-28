
public class ProtectedField {

protected int a=60,b=90;
    
    protected void a1() {
       System.out.println("Protected Method");
    }
    
    public static void main(String args[]) {
    		ProtectedField ob=new ProtectedField();
    	      
    	    }
    	    
    	}

    class SubProt extends ProtectedField {
        public void temp(){
            System.out.println(a+"  "+b);
            a1();
        }
    }