package collection;

import java.util.List;

public class Detailes{
    private int id;
	private String username;
	private String contactnumber;
	private char grade;
	public Detailes(int id, String username, String contactnumber, char grade) {
		super();
		this.id = id;
		this.username = username;
		this.contactnumber = contactnumber;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Detailes [id=" + id + ", username=" + username + ", contactnumber=" + contactnumber + ", grade=" + grade
				+ "]";
	}
	
	
}
