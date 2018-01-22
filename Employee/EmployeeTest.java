package Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Jane", "Doe", 1284.50);
		
		System.out.printf("Monthly salary of employee %s %s is €%.2f\n\n", employee1.getFirstName(), 
				employee1.getLastName(), employee1.getSalary());
		

		Employee employee2 = new Employee("John", "Doe", 3588.90);
		
		System.out.printf("Monthly salary of employee %s %s is €%.2f\n\n", employee2.getFirstName(),
				employee2.getLastName(), employee2.getSalary());
		
		
		System.out.printf("Monthly salary of employee %s %s after 10%% raise is €%.2f\n\n", 
				employee1.getFirstName(), employee1.getLastName(), employee1.getNewSalary());
		
		
		System.out.printf("Monthly salary of employee %s %s after 10%% raise is €%.2f\n\n", 
				employee2.getFirstName(), employee2.getLastName(), employee2.getNewSalary());
		
	}

}
