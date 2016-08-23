import java.io.*;
public class ConsoleTestAppl {
	public static void main(String[] args) throws IOException {
		BufferedReader console = 
				new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("please write two numbers separated by the space or exit");
			String line = console.readLine();
			if(line == null || line.equals("exit"))
				break;
			String[] strNumbers = line.split(" ");
			if(strNumbers.length != 2){
				System.out.println("wrong input format");
				continue;
			}
			try {
				int n1 = Integer.parseInt(strNumbers[0]);
				int n2 = Integer.parseInt(strNumbers[1]);
				System.out.println("result = " + (n1 + n2));
			} catch (NumberFormatException e) {
				System.out.println("no integer number");
				//continue;
			}
		}
		System.out.println("good bye");
	}
}
