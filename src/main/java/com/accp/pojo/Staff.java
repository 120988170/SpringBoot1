package com.accp.pojo;

public class Staff {
	private Integer sid;
	
	private String sname;
	
	private String address;
	
	private String email;
	
	private Integer did;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + ", address=" + address + ", email=" + email + ", did=" + did
				+ "]";
	}

	public Staff(Integer sid, String sname, String address, String email, Integer did) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.email = email;
		this.did = did;
	}

	public Staff() {
		super();
	}
	
	
}
