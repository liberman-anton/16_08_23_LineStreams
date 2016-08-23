import java.io.*;
public class PrintWriterStreamTestAppl {

	private static final int N_LINES = 100000;

	public static void main(String[] args) throws FileNotFoundException {
		
		//PrintStream printStream = new PrintStream("file2.txt");
		
//		try(PrintStream printStream = new PrintStream(new FileOutputStream("file2.txt,true"));
//				PrintWriter printWriter = new PrintWriter("file3.txt")){
//		
//		printStream.println("Hello world");//сразу помещает в файл
//		printWriter.println("Hello world");//помещает в буфер
//		}
		//
		//printWriter.flush();
		//printWriter.close();
		
		try(PrintStream stream = new PrintStream("largeFileStream");
				PrintWriter writer = new PrintWriter("largeFileWriter")){
			performanceTest(writer);
			performanceTest(stream);
		}
		
	}

	private static void performanceTest(PrintWriter writer) {
		long timeStart = System.currentTimeMillis();
		for(int i = 0; i < N_LINES; i++){
			writer.println("Hello");
			//writer.flush();//будет долго
		}
		System.out.println("running time for print writer " + (System.currentTimeMillis() - timeStart));
	}

	private static void performanceTest(PrintStream stream) {
		long timeStart = System.currentTimeMillis();
		for(int i = 0; i < N_LINES; i++){
			stream.println("Hello");
		}
		System.out.println("running time for print stream " + (System.currentTimeMillis() - timeStart));
	}

}
