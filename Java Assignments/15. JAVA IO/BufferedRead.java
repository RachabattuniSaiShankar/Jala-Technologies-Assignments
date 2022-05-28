import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("File.txt");
		BufferedReader buffReader = new BufferedReader(
            fileReader);

    while (buffReader.ready()) {
         System.out.println("Char :" + (char)buffReader.read());
    }
	}

}
