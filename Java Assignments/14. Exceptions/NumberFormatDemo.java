
public class NumberFormatDemo {

	public static void main(String[] args) {
		try {
			// "hai" is not a number
			int num = Integer.parseInt("hai");

			System.out.println(num);
		}
		catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}

}
