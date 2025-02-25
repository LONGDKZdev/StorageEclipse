package Test;

//Java code for thread creation by extending
//the Thread class
class Multithread extends Thread {
	public void run()
	{
		try {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Thread ");
			stringBuilder.append(Thread.currentThread().getId());
			stringBuilder.append(" is running");
			// Displaying the thread that is running
			System.out.println(
				stringBuilder.toString());
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}


	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Multithread object
				= new Multithread();
			object.start();
		}
	}
}

