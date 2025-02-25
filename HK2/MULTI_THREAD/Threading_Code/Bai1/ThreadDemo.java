package Bai1;


class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i < 15; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
