package lab2;

public class Main {
    public static void print(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str + " " + (i + 1));
        }
    }
    public static void main (String[] args) {
        Thread newThread = new Thread(() -> {
            print("Child");
        });
        newThread.start();
        try {
            newThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        print("Parent");
    }
}
