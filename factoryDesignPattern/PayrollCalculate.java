package factoryDesignPattern;

interface UserDetails{
	void setDetails(String mail, int number, String type);
	void setName(String user);
	void getDetails();
}

abstract class PayrollCalculate implements UserDetails{
	protected double baseAmount;
	abstract void getbaseAmount();
	abstract void processSalary(int duration);
}
