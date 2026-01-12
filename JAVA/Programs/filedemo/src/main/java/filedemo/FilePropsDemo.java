package filedemo;

import java.io.File;
import java.io.IOException;

public class FilePropsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("sample.txt");
		if(file.createNewFile()) {
			System.out.println("File is created sucessfull..!");
		}
		System.out.println("Name of the file : "+file.getName());
		System.out.println("Path of the file :"+file.getPath());
		System.out.println("Absolute Path of file: "+file.getAbsolutePath());
		System.out.println("Is file Writable: "+file.canWrite());
		System.out.println("Size of the file: "+file.length());
		

	}

}
