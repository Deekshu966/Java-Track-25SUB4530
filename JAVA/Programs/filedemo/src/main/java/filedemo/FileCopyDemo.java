package filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("sample.txt");
		FileWriter fw = new FileWriter("output.txt");
		char[] data = new char[1000];
		int ch;
		while((ch=fr.read())!=-1)
			fw.write(ch);
		System.out.println("Data Copied to output.txt ");
		
		fw.close();
		fr.close();

	}

}
