import java.io.*;
public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("file2.txt"));
		while(reader.ready()){
		//while(true){
			String line = reader.readLine();
//			if(line == null)
//				break;
			System.out.println(line);
		}
		reader.close();
	}

}
