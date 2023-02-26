package factoryDesignPattern;

public class BaseSalariedCommission extends PayrollCalculate {
	protected String name, email;
	protected int phoneNumber;
	protected String employementType;
	
	@Override
	public void getbaseAmount() {
		baseAmount = 2500;
	}
	@Override
	public void processSalary(int duration) {
		System.out.println("Salary paid :\t"+(this.baseAmount+(12/100)*duration+(10/100)*this.baseAmount));
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
