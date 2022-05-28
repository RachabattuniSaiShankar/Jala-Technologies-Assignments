import java.util.ArrayList;

public class AddIntegersToAnArray {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6}; 
	    ArrayList<Integer> al = new ArrayList<Integer>(); 
	    for(int x: arr) {
	        al.add(x); 
	    }
	    al.add(10); 
	    al.add(18);
	    System.out.print(al);
	}
}
