package filedemo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader ipr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ipr);
		FileWriter fw = new FileWriter("result.txt");
		
		System.out.println("Enter contents to write (type exit) to stop");
		String line;
		
		while(!(line=br.readLine()).equalsIgnoreCase("exit")) {
			fw.write(line);
			fw.write(System.lineSeparator());
		}
		fw.close();
		br.close();
		ipr.close();
		System.out.println("Data written successfully...!");
		

	}

}
// System.out.print("Hello");
// System.in---> Keyboard