import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferedOutput {

	public static void main(String[] args) throws Exception {
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(
		        "doc.txt"));
		    bufferedOutput.write("File is updated".getBytes());
		   
		    bufferedOutput.close();
	}

}
