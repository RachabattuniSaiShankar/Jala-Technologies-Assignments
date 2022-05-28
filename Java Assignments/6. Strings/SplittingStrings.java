import java.util.Scanner;

public class SplittingStrings {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
	    
		System.out.print("Enter The String: ");
		String s1=s.nextLine();
		String[] split=s1.split("\\s");
for(String words:split){  
System.out.println(words);  
	}
	}
}
