package cert.java11.ocp.chapter18.concurrency.api.callable;

import java.util.concurrent.*;

public class AddData {
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            service.submit(()-> {
                try {
                    Thread.sleep(11);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            System.out.println(result.get());   // 41

        } finally {
            service.awaitTermination(10, TimeUnit.MILLISECONDS);

            // Check whether all tasks are finished
            if(service.isTerminated()) System.out.println("Finished!");
            else System.out.println("At least one task is still running");
            service.shutdown();
        }
    }
}