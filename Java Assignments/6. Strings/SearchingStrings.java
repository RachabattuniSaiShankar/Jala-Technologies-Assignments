import java.util.Scanner;

public class SearchingStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str =s.nextLine();

		System.out.print("Index Of String :  " + str.indexOf("a"));
	}

}
