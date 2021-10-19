package cert.java11.ocp.chapter18.concurrency.threadsafety.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnlockSample {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        if(lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        }

        new Thread(() -> System.out.print(lock.tryLock())).start();
    }
}
