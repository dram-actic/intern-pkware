package factoryDesignPattern;

public class SalariedEmployee extends PayrollCalculate {
	protected String name, email;
	protected int phoneNumber;
	protected String employementType;
	
	@Override
	public void getbaseAmount() {
		baseAmount = 5000;
	}
	@Override
	public void processSalary(int duration){
		System.out.println("Salary paid :\t"+duration*this.baseAmount);
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

