package org.udemy.functionalprogramming.concepts.tailrecursion;

public class TailRecursion {

    public static void main(String[] args) {

        int factorial = nFact(4);
        assert factorial == 24 : String.format("Factorial %d is not correct",factorial);

        factorial = nTailFact(4,1);
        assert factorial == 24 : String.format("Factorial %d is not correct",factorial);

    }

    //Classic recursive approach relies on pending stacked evaluation of nFact
    public static int nFact(int n) {
        if(n <= 0)
            return 1;

        return n * nFact(n-1);

    }

    //Tail call optimization uses an accumulator to no rely on pending stacked evaluation
    public static int nTailFact(int n, int a){
        if(n <= 0)
            return a;

        return nTailFact( n-1, n * a);
    }
}
