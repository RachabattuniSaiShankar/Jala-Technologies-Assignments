import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
		try{
	           FileWriter fw=new FileWriter("File.txt");
	           fw.write("File is updated");
	           fw.close();
	          }catch(Exception e){System.out.println(e);}
	          System.out.println("Success...");
	}

}
