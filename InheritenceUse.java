

class Vehicle{
	private String BrandName;
	Vehicle(String name){this.BrandName = name;}
	String color;
	String type;
	int modelYear;
	public String getName() {return this.BrandName;}
	
}

class Car extends Vehicle{
	public Car(String name) {super(name);}
	public void blowHonk() {
		System.out.println("phonk...phonk...");
	}
	private int price;
	public void setPrice(int value) {this.price = value;}
	public int getPrice() {return this.price;}
	public void getDetails() {
		System.out.print(getName()+": ");
		System.out.println(this.color+" "+this.type+" "+this.modelYear+" "+this.getPrice());
	}
}


public class InheritenceUse {

	public static void main(String[] args) {
		Car c1 = new Car("Volvo");
		c1.type = "Coupe S-class";
		c1.color = "Black";
		c1.modelYear = 2018;
		c1.setPrice(4200000);
		c1.getDetails();
	}

}
