package cert.java11.ocp.chapter6.lambda.functionals;

import java.util.function.Supplier;

public class SupplierSample {

    public static void main(String[] args) {
        Supplier<Integer> number = () ->  42;
        System.out.println(returnNumber(number));
    }

    private static int returnNumber(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
