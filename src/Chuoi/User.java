package Chuoi;

public class User {
	private String userName;
	private String passWord;
	
	public User(String userName, String passWord) {
		this.userName=userName;
		this.passWord=passWord;
	}
	public static User login(String uname, String pw) {
		if(uname.equalsIgnoreCase("nguyendung") && pw.equals("123456"))
			return new User(uname,pw);
		return null;
	}
}
