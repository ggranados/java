package cert.java11.ocp.chapter18.concurrency.api.scheduled;

import java.util.concurrent.*;

public class ScheduledAtFixed {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        try {

            Runnable task1 = () -> System.out.println("Hello Zoo");
            Runnable task2 = () -> System.out.println("Monkey");
            ScheduledFuture<?> r1 = service.scheduleAtFixedRate(task1, 5,1, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.scheduleAtFixedRate(task2, 10,5,  TimeUnit.SECONDS);

        } finally {
            if (service != null) service.awaitTermination(20, TimeUnit.SECONDS);
            service.shutdown();
        }
    }
}
