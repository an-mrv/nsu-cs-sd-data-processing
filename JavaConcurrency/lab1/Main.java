package lab1;
public class Main {
    public static void main (String[] args) {
        Thread newThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child " + (i + 1));
            }
        });
        newThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Parent " + (i + 1));
        }
    }
}
