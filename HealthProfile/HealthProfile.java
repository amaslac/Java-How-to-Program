package HealthProfile;

public class HealthProfile {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int month;
	private int day;
	private int year;
	private double weight;
	private double height;
	
	public HealthProfile(String firstName, String lastName, String gender, int month,
			int day, int year, double weight, double height) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.weight = weight;
		this.height = height;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	

}
