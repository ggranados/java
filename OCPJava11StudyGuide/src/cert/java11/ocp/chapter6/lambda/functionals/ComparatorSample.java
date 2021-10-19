package cert.java11.ocp.chapter6.lambda.functionals;

import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorSample {
    public static void main(String[] args) {

        Comparator<Integer> ints = (i1, i2) -> i1 - i2;
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1);
        Comparator<String> moreStrings = (s1, s2) -> - s1.compareTo(s2);

        Stream nums = Stream.of(7,3,2,5,4,1,6,9,0,8);
        Stream strs = Stream.of("a","b","r","x","p","c");
        Stream moreStrs = Stream.of("a","b","r","x","p","c");

        nums.sorted(ints).forEach(System.out::println);
        strs.sorted(strings).forEach(System.out::println);
        moreStrs.sorted(moreStrings).forEach(System.out::println);
    }
}
