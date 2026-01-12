package filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderArrayDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fd = new FileReader("sample.txt");
		char[] data = new char[200];
		
		fd.read(data);
		System.out.print(data);
		
		

	}

}
