import java.lang.*;

public class AbstractClass {

	public static void main(String[] args) {
		Square sq = new Square(16);
		System.out.println(sq.area());
		System.out.println(sq.volume());
	}

}

abstract class Shape{
	abstract double area();
	abstract double perimeter();
	abstract double volume();
}

class Square extends Shape{
	double side;
	Square(double length){this.side = length;}
	
	@Override
	double area() {
		return this.side*this.side;
	}

	@Override
	double perimeter() {
		return 4*this.side;
	}

	@Override
	double volume() {
		String str = "Error!!!  Volume can't be generated of 2-D object.";
		double db = Double.parseDouble(str);
		return db;
	}
	
}
