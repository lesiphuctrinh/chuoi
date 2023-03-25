package Chuoi;

import java.io.*;
import java.util.*;

public class baitap2 {
	String msv, hoten, ngaysinh, noisinh;
	int gioitinh;
	String quequan;
	public baitap2(String msv, String hoten, String ngaysinh, String noisinh, int gioitinh, String quequan) {
		super();
		this.msv = msv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.noisinh = noisinh;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
	}
	public static baitap2 parse(String input, String charToSplit) {
		try {
			String[] rs=input.split(charToSplit);
			int gt= Integer.parseInt(rs[4]);
			baitap2 p=new baitap2(rs[0], rs[1], rs[2], rs[3], gt, rs[5]);
			return p;
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Baitap[%s, %s, %s, %s, %s, %s]", msv, hoten, ngaysinh, noisinh, gioitinh, quequan);
	}
	//doc file
	public static ArrayList<baitap2> parseFromFile(String filePath) throws FileNotFoundException{
		File file=new File(filePath);
		Scanner x=new Scanner(file);
		ArrayList<baitap2> l=new ArrayList<>();
		while(x.hasNext()) {
			String line=x.nextLine();
			baitap2 p=baitap2.parse(line, "@");
			l.add(p);
		}
		x.close();
		return l;
	}
	
}
