import java.util.Scanner;

public class PrintMaleOrFemaleUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter m or f"); 
		char c=sc.next().charAt(0); 
	 
		 
		switch(c){ 
		case 'm': 
			System.out.println("Gender is male"); 
			break; 
		case 'f': 
			System.out.println("Gender is female"); 
			break; 
		} 
		sc.close(); 
	}

}
