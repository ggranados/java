package org.java17.streams.challenges;

import java.util.stream.IntStream;

public class FactorialCalculatorRecursive {

    public static void main(String[] args) {

        var calculator = new FactorialCalculatorRecursive();

        int n = 5;
        long result = calculator.apply(n);
        System.out.println(result);
        assert result == 120 : "incorrect factorial calculation for n= " + n;

        n = 0;
        result = calculator.apply(n);
        System.out.println(result);
        assert result == 1 : "incorrect factorial calculation for n= " + n;

        n = -1;
        try {
            calculator.apply(n);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            assert true : "Exception expected";
        }

    }

    public long apply(int n) {
        if(n < 0 ) throw new IllegalArgumentException("Invalid value for n=" + n);

        if(n <= 1 ) return 1;

        return n * apply(n-1);
    }


}
