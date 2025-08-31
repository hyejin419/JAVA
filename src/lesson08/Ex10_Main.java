package lesson08;

import java.io.IOException;

class Ex10_Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Ex10_Main {
    public static void main(String[] args) throws InterruptedException {
        Ex10_Counter counter = new Ex10_Counter();
        Runnable task = () -> {
            for (int i = 0; i< 10000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("최종 카운트: " + counter.getCount());
    }
}
