package org.java17.streams.challenges;

public class FactorialCalculatorTailRecursive {

    public static void main(String[] args) {

        var calculator = new FactorialCalculatorTailRecursive();

        int n = 5;
        long result = calculator.apply(n,1);
        System.out.println(result);
        assert result == 120 : "incorrect factorial calculation for n= " + n;

        n = 0;
        result = calculator.apply(n, 1);
        System.out.println(result);
        assert result == 1 : "incorrect factorial calculation for n= " + n;

        n = -1;
        try {
            calculator.apply(n, 1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            assert true : "Exception expected";
        }

    }

    public long apply(int n, long accumulator) {
        if(n < 0 ) throw new IllegalArgumentException("Invalid value for n=" + n);

        if(n == 0 ) return accumulator;

        return apply(n-1, accumulator * n);
    }


}
