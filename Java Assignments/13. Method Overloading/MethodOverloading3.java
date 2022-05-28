
public class MethodOverloading3 {
	public void show(String s , int i)
	 {
	   System.out.println(s + " " + i);
	 }
	  public void show(int i , String s)
	 {
	   System.out.println(i + " " + s);
	 }
	public static void main(String[] args) {
		MethodOverloading3 ol = new MethodOverloading3();
		   ol.show("Be in Present" ,10);
		   ol.show(15 , "Alive is Awesome");
	}

}
