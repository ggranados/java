package cert.java11.ocp.chapter6.lambda.simple;

import java.util.*;
import java.util.function.Predicate;

public class TraditionalSearch {
public static void main(String[] args) {

        // list of animals
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, a -> a.canHop());
        print(animals, a-> a.canSwim());
        print(animals, a-> !a.canSwim());

        }

        private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            // the general check
            if (checker.test(animal))
                System.out.print(animal + " ");
            }
        System.out.println();
        }

}