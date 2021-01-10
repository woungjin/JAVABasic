package day10_public.encap.good;

public class Member {

	private String id; 
	private String pw;
	private String email;
	private String address;
	private int zipNum;
	private int phone;
	
	
	
	public Member(String id, String pw, String email, String address, int zipNum, int phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.zipNum = zipNum;
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipNum() {
		return zipNum;
	}
	public void setZipNum(int zipNum) {
		this.zipNum = zipNum;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	// alt + shift + s
	// 게터 , 세터 자동생성
	
	
}
