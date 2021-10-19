package cert.java11.ocp.chapter18.concurrency.api.scheduled;

import java.util.concurrent.*;

public class ScheduledWithFixedDelay {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        try {

            Runnable task1 = () -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello Zoo");
            };
            ScheduledFuture<?> r1 = service.scheduleWithFixedDelay(task1, 5,1, TimeUnit.SECONDS);

        } finally {
            if (service != null) service.awaitTermination(20, TimeUnit.SECONDS);
            service.shutdown();
        }
    }
}
