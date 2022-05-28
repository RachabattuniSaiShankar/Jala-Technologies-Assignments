
public class MatchingStrings {

	public static void main(String[] args) {
		String regex = "^[0-9]+$";

	    System.out.println("123a".matches(regex)); 
	    System.out.println("98416".matches(regex));
	    System.out.println("98 41".matches(regex));
	}

}
