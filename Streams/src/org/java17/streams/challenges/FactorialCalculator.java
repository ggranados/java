package org.java17.streams.challenges;

import java.util.stream.IntStream;

public class FactorialCalculator {

    public static void main(String[] args) {

        int n = 5;
        var calculator = new FactorialCalculator();

        long result = calculator.apply(n);
        System.out.println(result);
        assert result == 120 : "incorrect factorial calculation";

        n = 0;
        try {
            calculator.apply(n);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            assert true : "Exception expected";
        }



    }

    private long apply(int n) {
        if(n<=0) throw new IllegalArgumentException("Invalid value for n");

        return IntStream.iterate(n, i-> i>0, i-> i-1)
                .reduce(1, (a,b)-> a*b);
    }


}
