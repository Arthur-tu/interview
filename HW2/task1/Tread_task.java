package HW2.task1;

public class Tread_task {
    private final Object mon = new Object();
    private volatile String val = "Ping";

    public static void main(String[] args) {
        Tread_task tt = new Tread_task();
        Thread t1 = new Thread(tt::printPing);
        Thread t2 = new Thread(tt::printPong);
        t1.start();
        t2.start();
    }

    private void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 100; i++) {
                    while (!val.equals("Ping")) {
                        mon.wait();
                    }
                    System.out.println("Ping");
                    val = "Pong";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 100; i++) {
                    while(!val.equals("Pong")) {
                        mon.wait();
                    }
                    System.out.println("Pong");
                    val = "Ping";
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
