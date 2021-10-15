package cert.java11.ocp.chapter18.concurrency.parallelstream;

import java.util.List;

public class ReductionsSample {
    public static void main(String[] args) {

        // serial stream
        System.out.println(List.of(1,2,3,4,5,6)
                .stream()
                .findAny().get());

        // parallel stream
        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .findAny().get());

        //reduce parallel stream
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1,c) -> s1 + c,
                        (s2,s3) -> s2 + s3));  // wolf

        
    }
}
