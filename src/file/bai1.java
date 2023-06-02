package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bai1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ghi file bằng mảng
//		String a[]= {"Nguyen Van B", "Nguyen Van C","Le Thi D"};
//		try {
//			FileWriter fw=new FileWriter("data.txt");
//			BufferedWriter bw=new BufferedWriter(fw);
//			for(String s:a) {
//				bw.write(s);
//				bw.newLine();
//			}
//			bw.close();
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		// ghi file bằng project
//		ghiProject s= new ghiProject("Lê Sĩ Phúc Trình", 20, 9.5);
//		try {
//			FileWriter fw = new FileWriter("data.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write(s.toString());
//			bw.close();
//			fw.close();
//		}catch(Exception e) {
//			
//		}
//		
//		// ghi file bằng List
		ghiProject s1 = new ghiProject("Lê Sĩ Phúc Trình 1", 20, 10);
		ghiProject s2 = new ghiProject("Lê Sĩ Phúc Trình 2", 22, 9);
		ghiProject s3 = new ghiProject("Lê Sĩ Phúc Trình 3", 25, 6.5);
		ghiProject s4 = new ghiProject("Lê Sĩ Phúc Trình 4", 29, 8.9);
		List<ghiProject> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
//		ghiFile(list);
		
		// đọc file
		try {
			FileReader fr= new FileReader("data.txt");
			BufferedReader br= new BufferedReader(fr);
			String line="";
			while(true) {
				line=br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	// ghi file
	public static void ghiFile(List<ghiProject>list) {
		try {
			FileWriter fw= new FileWriter("data.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(ghiProject a : list) {
				bw.write(a.toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

