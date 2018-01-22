package Employee;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (salary > 0) 
			this.salary = salary;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public double getNewSalary() {
		return salary + salary * 0.10;
	}
	

}
