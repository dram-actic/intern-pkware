
public class ThreadPriorities {

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample("T1");
		ThreadExample t2 = new ThreadExample("T2");
		ThreadExample t3 = new ThreadExample("T3");
		ThreadExample t4 = new ThreadExample("T4 (most Important)");
		ThreadExample t5 = new ThreadExample("T5");
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}

class ThreadExample extends Thread{
	ThreadExample (String name){super(name);}
	public void run() {
			System.out.println("I'm a Thread constructor "+ this.getName() +" "+ this.getId());
	}
}
