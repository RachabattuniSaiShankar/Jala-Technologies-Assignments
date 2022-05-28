import java.util.Scanner;

public class TrimStrings {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		    
			System.out.print("Enter A String: ");
			String s1=s.nextLine();
			System.out.print("After Trimming :" + s1.trim());
	}

}
