package filedemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fd = new FileReader("sample.txt");
		int ch;
		while((ch= fd.read())!=-1)
			System.out.print((char)ch);
		
		fd.close();
		

	}

}
