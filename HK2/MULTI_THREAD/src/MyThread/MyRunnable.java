package MyThread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.print("Thread đang chạy!");
	}

	 public static void main(String[] args) {
		 Thread t = new Thread(new MyRunnable());
		 t.start();
	}
	
	
}
