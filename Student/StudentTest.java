package Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Jane");
		Student student2 = new Student("Tom");
		Student student3 = new Student("Jerry");
		
		student1.setAge(21);
		student1.setGrade(3);
		student1.printStudent();
		
		student2.setAge(23);
		student2.setGrade(4);
		student2.printStudent();
		
		student3.setAge(19);
		student3.setGrade(2);
		student3.printStudent();

	}

}
