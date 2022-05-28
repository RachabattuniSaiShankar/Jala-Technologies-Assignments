interface Basicinterface {
	default public void disp(int number){

	}

}
interface secondaryinterface {
	default public void disp(int number){

	}

}

public class Interface5 implements Basicinterface,Secondinterface {
	public void disp()
	{
		int number=223;
	     System.out.println("Given Number is :" + number);

	}
	public void disp()
	{
		int number=202;
	     System.out.println("Given Number is :" + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface4 obj=new Interface4();
		obj.disp();
		

	}

}

// In java we cannot have Same Signature for multiple methods 
