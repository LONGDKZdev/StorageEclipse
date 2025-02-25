package Dongbotuyen;

//Sử dụng từ khóa **synchronized** để khóa tài nguyên
//Đảm bảo chỉ một thread có thể truy cập tài nguyên tại một thời điểm
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;
    MyThread(SharedResource resource) {
        this.resource = resource;
    }
    public void run() {
        resource.printNumbers();
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread t1 = new MyThread(resource);
        MyThread t2 = new MyThread(resource);
        t1.start();
        t2.start();
    }
}
