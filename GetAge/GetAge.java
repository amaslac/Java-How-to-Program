package GetAge;

public class GetAge {

	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	
	public GetAge(String firstName, String lastName, int month, int day, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
		
	    public String getFirstName() {
		    return firstName;
	    }
	
	    public String getLastName() {
		    return lastName;
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
		
}
	
	
