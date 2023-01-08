package org.udemy.functionalprogramming.concepts.composition;

import java.util.function.Function;

public class Composition {

    public static void main(String[] args) {

        MyFunction<Square, Integer> f1 = s-> s.getArea();
        MyFunction<Integer, Double> f2 = area -> Math.sqrt(area);

        MyFunction<Square, Double> getSide = f2.compose(f1);
        Square square = new Square(10);

        System.out.println(getSide.apply(square));

        //Java Function Composition implementation

        Function<String,Integer> count = String::length;
        Function<Integer, Double> half = integer -> integer / 2.0;

        Function<String,Double> halfcount = half.compose(count);

        System.out.println(halfcount.apply("symphony"));
        System.out.println(halfcount.apply("symphonic"));


    }

}
