package org.java17.streams.challenges;

import java.util.stream.IntStream;

public class IntegerToBinaryConverter {

    public static void main(String[] args) {

        int n = 6;
        String binary = new IntegerToBinaryConverter().convert(n);

        assert binary.equals("110") : String.format("Binary string %s is not correct",binary);

        n = 8;
        binary = new IntegerToBinaryConverter().convert(n);

        assert binary.equals("1000") : String.format("Binary string %s is not correct",binary);


    }

    private String convert(int n) {

        StringBuilder binary = new StringBuilder();

        IntStream.iterate(n,i-> i>0,i-> i/=2)
                .forEach( i-> binary.append( i%2 ));

        return binary.reverse().toString();
    }
}
