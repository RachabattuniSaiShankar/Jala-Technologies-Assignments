import java.util.Scanner;

public class EqualOrNotEqual {

	public static void main(String[] args) {
				int x, y;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter any two numbers to check for equal and not Equal: ");
				System.out.print("Enter the value of x : ");
				x = sc.nextInt();
				System.out.print("Enter the value of y : ");
				y = sc.nextInt();
				if(x==y)
					System.out.println("Two numbers are Equal ");
				else
					System.out.println("Two numbers are Not Equal ");
		}

}
