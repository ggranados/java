package cert.java11.ocp.chapter18.concurrency.threadsafety.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
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
