package edu.ggranados.java.exercises.strings;

@FunctionalInterface
public interface Processor<T,R> {

    R process(T str);

}
