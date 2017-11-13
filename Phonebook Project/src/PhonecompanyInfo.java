
public class PhonecompanyInfo extends PhoneInfo{

	String name;
	String phonenumber;
	String company;

	public PhonecompanyInfo(String name, String phonenumber, String company) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showphonecompanyInfo() {
		System.out.println("입력된 정보 출력중...");
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhonenumber());
		System.out.println("회사: " + getCompany());
	}
}