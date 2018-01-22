package Student;

public class Student {
	
	String name;
	int age;
	int grade;

	public Student(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void printStudent() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade + "\n");
		
	}
	
	
	
}
