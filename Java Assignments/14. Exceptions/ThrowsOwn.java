import java.io.*;

public class ThrowsOwn {
	void myMethod(int num)throws IOException, ClassNotFoundException{
		 if(num==1)
		 throw new IOException("IOException Occurred");
		 else
		 throw new ClassNotFoundException("ClassNotFoundException");
		}
		
		public static void main(String args[]){
		 try{
			 ThrowsOwn obj=new ThrowsOwn();
		 obj.myMethod(1);
		 }catch(Exception ex){
		 System.out.println(ex);
		 }
		}
}
