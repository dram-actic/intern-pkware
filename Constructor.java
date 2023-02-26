
class Student{
	private String name;
	protected String department;
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() { return this.name;}
}

public class Constructor {

	public static void main(String[] args) {
		Student s1 = new Student("sahil", "B Tech");
		System.out.println(s1.getName()+" - "+ s1.department);

	}

}
