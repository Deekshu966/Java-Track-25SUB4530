package filedemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyWithBuffers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	FileReader fr = new FileReader("sample.txt");
	//	FileWriter fw = new FileWriter("data.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
		String line;
		
		while((line= br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	//	fr.close();
	//	fw.close();
		System.out.println("file data copied using buffers");

	}

}
