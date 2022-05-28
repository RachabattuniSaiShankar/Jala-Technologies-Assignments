
public class ArraySpecificValue {
	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	
	public static void main(String[] args) {
		int[] my_array1 = {
	            232, 264, 199, 652, 304, 
	            213, 525, 325, 202, 450, 
	            456, 236, 256, 124};
	      System.out.println(contains(my_array1, 264));
	      System.out.println(contains(my_array1, 124));
	}

}
