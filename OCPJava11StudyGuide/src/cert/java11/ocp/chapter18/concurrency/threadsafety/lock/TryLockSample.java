package cert.java11.ocp.chapter18.concurrency.threadsafety.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockSample {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();

        if(lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printMessage(Lock lock) {
        try {
            lock.lock();
            System.out.println("This is the message");
        } finally {
            lock.unlock();
        }
    }
}
