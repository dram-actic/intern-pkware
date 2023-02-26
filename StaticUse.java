
public class StaticUse {
	
	int x;  //Instance variable	
	static int y;  //static member variable, it's takes only class specific information
	
	public void func1() { System.out.println("I'm a instance function"); }  //instance member function but we can't initialize
								//a static variable inside a function.
	public static void func2() { System.out.println("I'm a static function"); }  //static member function
	
	//we can have inner static class
	static class Example{}

	public static void main(String[] args) {
	/*	StaticUse st1 = new StaticUse();
		st1.x = 10;
		StaticUse.y = 15;
		System.out.println(st1.y);
		System.out.println(StaticUse.y);
		st1.func1();
		st1.func2();   */
		
		Bank bk = new Bank("HDFC Bank");
		bk.accountHolderName = "Shefali";
		bk.balance = 5000;
		bk.setAccountNumber(12100450002367l);
		bk.rateOfInterest = 5.45f; //wrong call
		System.out.println(bk.rateOfInterest);
		bk.getDetails();
		
		Bank.rateOfInterest = 5.45f;
		Bank.Loan.loanInterestRate = 10.78f;
	}

}

class Bank{
	static String bankName;
	public Bank(String name) {bankName = name;}
	//Instance variable associated with the object 
	protected String accountHolderName;
	private long accountNumber;
	protected long balance;
	protected int phoneNumber;
	
	//static member variable
	public static float rateOfInterest;
	//static member function
	public static void atm() { System.out.println("ATM available..."); }
	
	//instance member function
	public void setAccountNumber(long number) {this.accountNumber = number;}
	public long getAccountNumber() {return this.accountNumber;}
	public long getBalance() {return this.balance;}
	
	public void getDetails() {
		System.out.println("   "+bankName+"   ");
		System.out.println(this.accountHolderName+": "+this.accountNumber+" "+this.balance+" "+this.phoneNumber);
	}
	static class Loan{
		static long loanAmount;
		static float loanInterestRate;
	}
}
