
public class Static4 {
	 static void staticMethod() {
	        Text txt = new Text();
	        txt.instanceMethod();
	    }

	    void instanceMethod() {
	    	String txt = "Java Programming";
		    System.out.println(txt.length());

	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static4 st=new Static4();
		st.instanceMethod();
		
		
	}

}

//THis Program consites of Text.java too