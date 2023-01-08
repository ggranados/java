package org.udemy.functionalprogramming.concepts.composition;

@FunctionalInterface
public interface MyFunction<T,R> {

    R apply(T t);

    default <V> MyFunction<V,R> compose(MyFunction<V, T> before){
        return (V v) -> apply(before.apply(v));
    }

}
