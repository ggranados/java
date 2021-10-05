package cert.java11.ocp.chapter18.concurrency.api.scheduled;

import java.util.List;
import java.util.concurrent.*;

public class ScheduledExecutorSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service
                = Executors.newSingleThreadScheduledExecutor();
        try {

            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> "Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2, 8,  TimeUnit.MINUTES);

        } finally {
            if (service != null) service.shutdown();
        }
    }
}