package org.udemy.functionalprogramming.concepts;

import java.util.Objects;

@FunctionalInterface
public interface MyConsumer<T>{
    void accept(T t);

    default MyConsumer<T> andThen(MyConsumer<T> next){

        Objects.requireNonNull(next);

        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}