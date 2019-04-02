package Model;

public class User {
	private String F_name;
	private String L_name;
	private String Gender;
	private String E_Mail;
	private long Contact_num;
	private int Age;
	public String getF_name() {
		return F_name;
	}

	public void setF_name(String f_name) {
		F_name = f_name;
	}

	public User(String f_name, String l_name, String gender, String e_Mail, long contact_num, int age,
			String password) {
		super();
		F_name = f_name;
		L_name = l_name;
		Gender = gender;
		E_Mail = e_Mail;
		Contact_num = contact_num;
		Age = age;
		Password = password;
	}

	public String getL_name() {
		return L_name;
	}

	public void setL_name(String l_name) {
		L_name = l_name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) { 
		Gender = gender;
	}

	public String getE_Mail() {
		return E_Mail;
	}

	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}

	public long getContact_num() {
		return Contact_num;
	}

	public void setContact_num(long contact_num) {
		Contact_num = contact_num;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String Password;
	
	public User() {}
}

