package cert.java11.ocp.chapter18.concurrency.api.callable;

import java.util.concurrent.*;

public class AddData {
    public static void main(String[] args) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());   // 41
        } finally {
            if(service != null) service.shutdown();
        }
    }
}