import java.io.FileOutputStream;

public class Output {

	public static void main(String[] args) {
		try{
            FileOutputStream fout=new FileOutputStream("doc.txt");
            String s="File is updated";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
           }
		catch(Exception e)
		{
			System.out.println(e);
           
		}
	}

}
