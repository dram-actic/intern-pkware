
public class ThreadExtendingClass {

	public static void main(String[] args) {
	Program1 pg1  = new Program1();
	pg1.start();
	
	Program2 pg2  = new Program2();
	pg2.start();
	}

}

/* Threads helps in order to achieve concurrency
 Threads can be created by using two methods : 

Extending the Thread class 
Implementing the Runnable Interface  */

class Program1 extends Thread{
	@Override
	public void run(){
		int i = 0;
		while(i<200){
			System.out.println("Running program 1...");
			i++;
		}
	}
}

class Program2 extends Thread{
	@Override
	public void run(){
		int i = 0;
		while(i<200){
			System.out.println("Running program 2...");
			i++;
		}
	}
}
