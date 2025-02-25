package Vongdoicuartuyen;

class LifecycleThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread đang chạy...");
            Thread.sleep(5000);
            System.out.println("Thread hoàn thành công việc!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        LifecycleThread t1 = new LifecycleThread();
        System.out.println("Thread ở trạng thái NEW");
        t1.start();
        System.out.println("Thread ở trạng thái RUNNABLE");
    }
}
