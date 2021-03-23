import HW2.task1.Tread_task;
import HW2.task2.Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
static Lock lock = new ReentrantLock();

static class CounterTread extends Thread {
    private Counter counter;
    public CounterTread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                lock.lock();
                counter.increaseSum();
            } finally {
                lock.unlock();
            }
        }
    }
}

public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            CounterTread counterTread = new CounterTread(counter);
            counterTread.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter:" + counter.getSum());
    }
}
