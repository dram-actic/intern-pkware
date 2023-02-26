
public class ThreadByInheritance {

	public static void main(String[] args) {
		MyThreadDemo t1 = new MyThreadDemo();
		Thread object1 = new Thread(t1);
		object1.start();
		Thread object2 = new Thread(new MyThreadDemo2());
		object2.start();
	}

}


class MyThreadDemo implements Runnable{
	@Override
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Implementning runnable thread 1 using inheritance "+ i);
			i++;
		}
	}
	
}

class MyThreadDemo2 implements Runnable{

	@Override
	public void run() {
	int i = 200;
	while(i>100) {
		System.out.println("Implementning runnable thread 2 using inheritance "+ i);
		i--;
	}
	}
}