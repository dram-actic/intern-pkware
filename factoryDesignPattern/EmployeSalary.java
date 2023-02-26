package factoryDesignPattern;

import java.util.Scanner;
import factoryDesignPattern.*;

public class EmployeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employement Type");
		String flag;
		do {
			String type = sc.nextLine();
			SelectEmployementFactory obj = new SelectEmployementFactory();
			PayrollCalculate payment = obj.getEmployementType(type);
			
			System.out.println("Enter your details:");
			System.out.println("E-mail");
			String mail = sc.nextLine();
			System.out.println("Phone Number");
			int number = sc.nextInt();
			System.out.println("User-Name :\t");
			String user = sc.next();
			System.out.println();
			payment.setName(user);
			System.out.println("Duration/Sales-Value :\t");
			int time = sc.nextInt();
			payment.processSalary(time);
			payment.setDetails(mail, number, type);
			payment.getDetails();
			System.out.println("want to calculate again?\nType yes/no");
			flag = sc.next();
		}while(flag.equalsIgnoreCase("yes"));
		

	}
}
