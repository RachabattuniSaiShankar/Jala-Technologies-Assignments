
public class Static7 {
	static void details()
	{
			String name="Sammy";
			int id=123;
			int phonenumber=888669;
			System.out.println("Name is : "+ name);
			System.out.println("Id is : "+ id);
			System.out.println("Phone number is : "+ phonenumber);


	}
	void companydetails() {
		String companyname="Google";
		int phno=99852566;
		System.out.println("Companyname is : "+ companyname);
		System.out.println("Company Phone number is : "+ phno);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static7 st=new Static7();
		st.details();
		st.companydetails();

	}

}
