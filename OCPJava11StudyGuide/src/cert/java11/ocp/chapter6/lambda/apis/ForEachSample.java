package cert.java11.ocp.chapter6.lambda.apis;

import java.util.*;

public class ForEachSample {

    public static void main(String[] args) {

        // For each
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        bunnies.forEach(b -> System.out.println(b));
        System.out.println(bunnies);

        Set<String> bunnies2 = Set.of("long ear", "floppy", "hoppy");
        bunnies2.forEach(b -> System.out.println(b));

        // For each on map
        Map<String, Integer> bunnies3 =  new HashMap<>();
        bunnies3.put("long ear", 3);
        bunnies3.put("floppy", 8);
        bunnies3.put("hoppy", 1);
        bunnies3.keySet().forEach(b -> System.out.println(b));
        bunnies3.values().forEach(b -> System.out.println(b));

        // Biconsumer
        Map<String, Integer> bunnies4 = new HashMap<>();
        bunnies4.put("long ear", 3);
        bunnies4.put("floppy", 8);
        bunnies4.put("hoppy", 1);
        bunnies4.forEach((k, v) -> System.out.println(k + " " + v));
    }

}
