package cert.java11.ocp.chapter18.concurrency.api.callable;

import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyTask {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            Callable<String> task = () -> "result";

           String data = service.invokeAny(
                    List.of(task, task, task, task, task, task, task));

            System.out.println(data);
            System.out.println("end");

        } finally {
            if (service != null) service.shutdown();
        }
    }
}
