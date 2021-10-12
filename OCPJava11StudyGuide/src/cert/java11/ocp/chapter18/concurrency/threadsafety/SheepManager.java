package cert.java11.ocp.chapter18.concurrency.threadsafety;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private final Object herd = new Object();
    private int sheepCount = 0;
    private void incrementAndReport() {
        synchronized(herd) {
            System.out.print((++sheepCount)+" ");
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            var manager = new SheepManager();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}