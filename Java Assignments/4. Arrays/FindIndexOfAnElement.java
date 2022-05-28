
public class FindIndexOfAnElement {
	
	public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
	}
	public static void main(String[] args) {
		int[] my_array = {30, 25, 18, 20, 24, 58, 95, 45, 76, 15};
	      System.out.println("Index position of 25 is: " + findIndex(my_array, 95));
	      System.out.println("Index position of 77 is: " + findIndex(my_array, 15));
	}

}
