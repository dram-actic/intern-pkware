
public class ThreadConstructors {

	public static void main(String[] args) {
		ThrdConst object1 = new ThrdConst("Thread1");
		object1.start();
		System.out.println(object1.getName() + " "+ object1.getId());
		ThrdConst object2 = new ThrdConst("Thread1");
		System.out.println(object2.getName() + " "+ object2.getId());
	}

}

class ThrdConst extends Thread{
	ThrdConst (String name){super(name);}
	public void run() {
		int i = 0;
		while(i<50) {
			System.out.println("I'm a Thread constructor having string name");
			i++;
		}
	}
}
