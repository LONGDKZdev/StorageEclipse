package MyThread;
class MyThread_Extends_Thread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Số: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread_Extends_Thread t1 = new MyThread_Extends_Thread();
        MyThread_Extends_Thread t2 = new MyThread_Extends_Thread();
        
        t1.start(); 
        t2.start(); 
    }
}
