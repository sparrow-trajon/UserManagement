package models;

/**
 * 
 * @author Manish
 *
 */
public class User {

	private int id; //*
	private String name; //*
	private String address;
	private String emailId;
	private int phoneNo;
	
	
	public User(int id, String name) {
		this.id=id;
		 this.name=name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", emailId=" + emailId + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
	
}
