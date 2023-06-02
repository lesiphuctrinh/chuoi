package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai2 {
	public static void main(String[] args) throws IOException {
		DocFile();
	}
	//đọc file
	public static void DocFile() throws IOException {
		FileReader fr= new FileReader("sensorData.txt");
		BufferedReader br= new BufferedReader(fr);
		String line="";
		while(true) {
			line=br.readLine();
			if(line==null)
				break;
			System.out.println(line);
		}
		fr.close();
		br.close();
	}
	//ghi file
	
}
