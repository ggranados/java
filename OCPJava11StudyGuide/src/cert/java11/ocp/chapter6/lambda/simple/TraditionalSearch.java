package cert.java11.ocp.chapter6.lambda.simple;

import java.util.*;
public class TraditionalSearch {
public static void main(String[] args) {

        // list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, new CheckIfHopper());
        }

        private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal))
                System.out.print(animal + " ");
            }
        System.out.println();
        }

}