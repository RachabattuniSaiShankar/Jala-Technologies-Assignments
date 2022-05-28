import java.util.*;

public class ExtractSubString {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);
		        String inputString;

		        int startIndex;
		        int endIndex;

		        System.out.println("Enter a string : ");
		        inputString = scanner.nextLine();
		        
		        System.out.println("Enter the first index of the substring : ");
		        startIndex = scanner.nextInt();
		        
		        System.out.println("Enter the second index of the substring : ");
		        endIndex = scanner.nextInt();
		        
		        char[] ch = new char[endIndex - startIndex + 1];
		        inputString.getChars(startIndex, endIndex + 1, ch, 0);

		        System.out.println("Output : " + String.valueOf(ch));

		    }

		
	}


