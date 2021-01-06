package net.javaguides.usermanagement.model;

public class User {
	private int id;
	private int zipcode;
	private String name;
	private String email;
	private String country;
	private String state;
	
	
	public User(int id, int zipcode, String name, String email, String country, String state) {
		super();
		this.id = id;
		this.zipcode = zipcode;
		this.name = name;
		this.email = email;
		this.country = country;
		this.state = state;
	}
	
	public User(int zipcode, String name, String email, String country, String state) {
		super();
		this.zipcode = zipcode;
		this.name = name;
		this.email = email;
		this.country = country;
		this.state = state;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
