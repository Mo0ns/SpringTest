package cn.edu.cxtc.po;

public class Tb_User {
	private Integer id;
	private String username;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Tb_User [id=" + id + ", username=" + username + ", address=" + address + "]";
	}

}
