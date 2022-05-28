
public class MethodOverloading4 {

	private static void sum(int a, int b){
        System.out.println("Sum is: " + ( a + b));
    }

    private static void sum(double a, double b){
        System.out.println("sum is :"+ (a + b));
    }

    public static void main(String[] args) {
        sum(1,3);
        sum(1,9);
    }
}