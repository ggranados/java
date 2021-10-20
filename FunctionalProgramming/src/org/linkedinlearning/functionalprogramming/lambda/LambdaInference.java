package org.linkedinlearning.functionalprogramming.lambda;

import java.util.function.Consumer;

public class LambdaInference {

    public static void main(String[] args) {

        // Standard syntax
        Consumer<String> c1 = msg -> System.out.println(msg.length());

    }
}
