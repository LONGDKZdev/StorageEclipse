package Wait_Notify;

class Shared {
    synchronized void waitMethod() {
        try {
            System.out.println("Chờ tín hiệu...");
            wait();
            System.out.println("Đã nhận tín hiệu!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void notifyMethod() {
        notify();
        System.out.println("Gửi tín hiệu!");
    }
}

public class Main {
    public static void main(String[] args) {
        Shared resource = new Shared();
        Thread t1 = new Thread(() -> resource.waitMethod());
        Thread t2 = new Thread(() -> {
            try { 
            	Thread.sleep(1000); 
            } catch (InterruptedException e) {}
            resource.notifyMethod();
        });

        t1.start();
        t2.start();
    }
}

