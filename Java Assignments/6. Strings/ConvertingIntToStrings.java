import java.util.Scanner;

public class ConvertingIntToStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Number: " );
	    int num=sc.nextInt();
	    String str = String.valueOf(num); 
			System.out.println("Convertion of Int to String : " + str);
	}

}
