package factoryDesignPattern;

public class SelectEmployementFactory {
	
	public PayrollCalculate getEmployementType(String employementType) {
		if(employementType==null) {return null;}
		if(employementType.equalsIgnoreCase("Salaried")) {
			return new SalariedEmployee();
		}
		else if(employementType.equalsIgnoreCase("Hourly")) {
			return new HourlyEmployee();
		}
		else if(employementType.equalsIgnoreCase("Commission")) {
			return new CommissionEmployee();
		}
		else if(employementType.equalsIgnoreCase("Base-Salaried")) {
			return new BaseSalariedCommission();
		}
		return null;
	}

}
