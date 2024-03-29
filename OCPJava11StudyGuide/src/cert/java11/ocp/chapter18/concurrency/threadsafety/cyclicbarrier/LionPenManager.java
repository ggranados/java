package cert.java11.ocp.chapter18.concurrency.threadsafety.cyclicbarrier;

import java.util.concurrent.*;
public class LionPenManager {
    private void removeLions() {System.out.println("Removing lions");}
    private void cleanPen() {System.out.println("Cleaning the pen");}
    private void addLions() {System.out.println("Adding lions");}
    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        removeLions();
        try {
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            var manager = new LionPenManager();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** Pen Cleaned!"));

            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1,c2));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}