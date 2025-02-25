package Bai2;
import java.util.Scanner;
class EvenNumbersThread extends Thread {
    private int N;
    public EvenNumbersThread(int N) {
        this.N = N;
    }
    public void run() {
        for (int i = 0; i < N; i += 2) {
            System.out.print("Even : "+ i + "\n");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class OddNumbersThread extends Thread {
    private int N;

    public OddNumbersThread(int N) {
        this.N = N;
    }
    public void run() {
        for (int i = 1; i < N; i += 2) {-
            System.out.print("odd : "+i + "\n");
            
            
            
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N (nhập N lớn hơn 0 ): ");
        int N = scanner.nextInt();
        if(N <= 0) {
        	System.out.println("ERROR!");
        	scanner.close();
        }
        else {
        	scanner.close();
            EvenNumbersThread evenThread = new EvenNumbersThread(N);
            OddNumbersThread oddThread = new OddNumbersThread(N);
            evenThread.start();
            oddThread.start();
        }
        
    }
}