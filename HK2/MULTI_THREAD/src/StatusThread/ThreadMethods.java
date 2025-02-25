package StatusThread;

class ThreadMethods extends Thread {
    public void run() {
        try {
        	System.out.println("Thread tiếp tục chạy sau 3 giây!");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
        System.out.println("Dừng Thread");
        t1.start();
        t1.join();
        System.out.println("Main01 thread kết thúc!");
    }
}

