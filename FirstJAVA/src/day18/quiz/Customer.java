package day18.quiz;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 6918880572728797582L;

	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	 
	public Customer() {
		
	}
	
	public Customer(String name, String gender, String email, int birthYear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
	public String toCSV() {
		return String.format("%s,%c,%s,%d", name, gender, email, birthYear);
	}
	
		
	
		
	
}
