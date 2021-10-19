package cert.java11.ocp.chapter18.concurrency.parallelstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AvoidStatefulSample {
    public static void main(String[] args) {
        var list = addValueStateful(IntStream.range(1, 11).parallel());
        System.out.println(list);

        var list2 = addValuesStateless(IntStream.range(1, 11).parallel());
        System.out.println(list2);
    }

    public static List<Integer> addValueStateful(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> { data.add(i); });  // STATEFUL: DON'T DO THIS!
        return data;
    }

    public static List<Integer> addValuesStateless(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
