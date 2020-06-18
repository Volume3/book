package books;

public class User {

	private String username;
	private String password;
	private String name;
	private int travelertype;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}


	public void setTravelertype(int travelertype) {
		this.travelertype = travelertype;
	}

	public int getTravelertype() {
		return this.travelertype;
	}

//	// ÷ÿ–¥toString ∑Ω∑®
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", password=" + password
//				+ ", email=" + email + ", phone=" + phone + "]";
//	}
}
