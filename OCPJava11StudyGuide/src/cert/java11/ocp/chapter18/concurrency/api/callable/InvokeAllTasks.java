package cert.java11.ocp.chapter18.concurrency.api.callable;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAllTasks {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            Callable<String> task = () -> "result";

            List<Future<String>> list = service.invokeAll(
                    List.of(task, task, task));

            for (Future<String> future : list) {
                System.out.println(future.get());
            }
            System.out.println("end");

        } finally {
            if (service != null) service.shutdown();
        }
    }
}
