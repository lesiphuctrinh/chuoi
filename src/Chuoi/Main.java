package Chuoi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		String userName="nguyendung";
//		String passWord="123456";
//		if(passWord.length() >= 6) {
//			User user = User.login(userName, passWord);
//			if(user != null) {
//				System.out.println("Dang nhap thanh cong!");
//			}
//			else
//			{
//				System.out.println("Dang nhap that bai!");
//			}
//		}
//		else {
//			System.out.println("Mat khau qua ngan.");
//		}
//	}
//bai 2
	String chuoi="21T1020777|LeSiPhucTrinh|16/02/2003|TTHue|1|Hue";
	baitap2 p=baitap2.parse(chuoi, "\\|");
	if(p!=null) {
		System.out.println(p.toString());
	}
	else {
		System.out.println("Khong the chuyen doi");
	}
	try {
		String filePath="D:\\sinhvien.txt";
		ArrayList<baitap2> l=baitap2.parseFromFile(filePath);
		for(baitap2 b: l) {
			System.out.println(b.toString());
		}
		
	}catch(Exception ex) {
		System.out.println("loi roi");
	}
	
	}
}
