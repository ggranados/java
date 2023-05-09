package org.java17.streams.challenges;

import java.util.stream.IntStream;

public class FactorialCalculator {

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
        if(n<0) throw new IllegalArgumentException("Invalid value for n");

        return IntStream.iterate(n, i-> i>0, i-> i-1)
                .reduce(1, (a,b)-> a*b);
    }


}
