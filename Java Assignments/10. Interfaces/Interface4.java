interface firstinterface {
	default public void disp(){

	}

}
interface Secondinterface {
	default public void dispdetails(){

	}

}

public class Interface4 implements firstinterface,Secondinterface {
	public void disp()
	{
		int number=223;
	     System.out.println("Given Number is :" + number);

	}
	public void dispdetails()
	{
		String name="Shankar";
	     System.out.println("Name is :" + name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface4 obj=new Interface4();
		obj.disp();
		obj.dispdetails();
		

	}

}

