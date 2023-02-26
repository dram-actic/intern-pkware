
class Employee{
	private String name;
	protected int id;
	protected int salary;
	public void setName(String name) {this.name = name;}
	public String getName() {return this.name;}
	public void setId(int id) {this.id = id;}
	public int getId() {return this.id;}
	public void setSalary(int salary) {this.salary = salary;}
	public int getSalary() {return this.salary;}
}

class Cellphone{
	public void callFriend(String friend) {
		System.out.println("Calling "+friend+"...");
	}
	public void ring() {
		System.out.println("Ringing....");
	}
}

public class OopsPractice {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Paul");
		e1.setId(23310044);
		e1.setSalary(15000);
		System.out.println(e1.getName()+" "+e1.getId()+" "+e1.getSalary());
	
		Cellphone asus = new Cellphone();
		asus.callFriend("Sneha");
	}

}
