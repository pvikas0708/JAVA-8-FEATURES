package in.vikas;

public class ThreadDemo1 implements Runnable {

	// Approach-1 => to print numbers from 1 to 10
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();
		Thread t = new Thread(td);
		t.start();
	}

}
