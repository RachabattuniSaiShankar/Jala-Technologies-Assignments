import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
public class BufferedInput {

	public static void main(String[] args) throws Exception {
		InputStream inStream = null;
	      BufferedInputStream bis = null;

	      try {

	         inStream = new FileInputStream("doc.txt");

	         bis = new BufferedInputStream(inStream);

	         while(bis.available()>0) {

	            char c = (char)bis.read();

	            System.out.print(c);
	         }
	      } catch(Exception e) {

	         e.printStackTrace();
	      } finally {
	         if(inStream!=null)
	            inStream.close();
	         if(bis!=null)
	            bis.close();
	      }
	}

}
