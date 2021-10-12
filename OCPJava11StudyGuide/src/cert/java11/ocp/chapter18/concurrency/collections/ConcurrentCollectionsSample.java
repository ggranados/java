package cert.java11.ocp.chapter18.concurrency.collections;

import java.util.HashMap;

public class ConcurrentCollectionsSample {
    public static void main(String[] args) {
        var foodData = new HashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet())
            foodData.remove(key);
    }
}
