package model;

public class Person {

	private String name;
	private String gender;
	private String school;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", school=" + school + "]";
	}
	
	
	
}
