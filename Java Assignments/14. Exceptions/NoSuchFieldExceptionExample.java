
import java.util.*;

class NoSuchFieldExceptionExample {

	private Object obj;

	NoSuchFieldExceptionExample()
	{

		class Arr {
		};

		obj = new Arr();
	}

	public static void main(String[] args)
		throws ClassNotFoundException, NoSuchFieldException
	{
		NoSuchFieldExceptionExample t = new NoSuchFieldExceptionExample();

		Class myClass = t.obj.getClass();

		String fieldName = "obj";

		try {
			
			System.out.println(
				fieldName + " Field of myClass: "
				+ myClass.getField(fieldName));
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

