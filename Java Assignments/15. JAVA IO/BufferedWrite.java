import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class BufferedWrite {

	public static void main(String[] args) throws IOException {

        
        StringWriter stringWriter = new StringWriter();
        BufferedWriter buffWriter = new BufferedWriter(stringWriter);
        buffWriter.write(71);
        buffWriter.write(69);
        buffWriter.write(69);
        buffWriter.write(75);
        buffWriter.write(83);
        buffWriter.flush();
        System.out.println(stringWriter.getBuffer());
	}

}
