package cert.java11.ocp.chapter6.lambda.variables;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ParameterListSample {

    public static void main(String[] args) {
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
    }

    public void whatAmI() {
        consume((var x) -> System.out.print(x), 123);
    }
    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

}
