package factoryDesignPattern;

public class HourlyEmployee extends PayrollCalculate {
	protected String name, email;
	protected int phoneNumber;
	protected String employementType;
	
	@Override
	public void getbaseAmount() {
		baseAmount = 300;
	}
	@Override
	public void processSalary(int duration) {
		double salary = 40*baseAmount;
		if(duration>40) {
			System.out.println("Salary paid :\t"+salary+(duration-40)*(this.baseAmount+(1/2)*this.baseAmount));
		}
		else {
			System.out.println("Salary paid :\t"+salary);
		}
	}
	
	public void setDetails(String mail, int number, String type) {
		this.email = mail;
		this.phoneNumber = number;
		this.employementType = type;
	}
	public void setName(String user) {
		this.name = user;
		}
	public void getDetails() {
		System.out.println(this.name+" :\t"+this.email+"\t"+this.phoneNumber);
	}
}
