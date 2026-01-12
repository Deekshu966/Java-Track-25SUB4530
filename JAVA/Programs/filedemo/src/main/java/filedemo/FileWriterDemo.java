package filedemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("sample.txt",true);
		fw.write("This is a updated data ");
		fw.write("This will append to the previous data ");
		fw.close();
		System.out.println("Data Written Successfully..!");

	}

}
