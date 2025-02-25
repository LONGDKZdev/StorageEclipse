package Bai1;

public class Main1 {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo();
        Thread thread2 = new Thread(new RunnableDemo());       
        thread1.start();
        thread2.start();
    }
}