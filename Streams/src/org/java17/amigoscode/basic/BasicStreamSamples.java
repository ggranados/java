package org.java17.amigoscode.basic;

import org.java17.amigoscode.pojo.*;

import java.util.*;
import java.util.stream.Collectors;
import static org.java17.amigoscode.pojo.Person.*;

public class BasicStreamSamples {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach
        /*
        List<org.java17.streams.basic.pojo.Person> females = new ArrayList<>();

        for(org.java17.streams.basic.pojo.Person person: people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        females.forEach(System.out::println);
        */

        // Declarative approach

        // Filter
        List<Person> females = people.stream()
                .filter(p->p.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        //females.forEach(System.out::println);

        // Sort
        List<Person> sorted =  people.stream()
                    .sorted(Comparator.comparing(Person::getAge).reversed())
                            .collect(Collectors.toList());
        //sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(p->p.getAge() > 8);

        //System.out.println(allMatch);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(p->p.getAge() > 121);

        //System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(p -> p.getName().equals("Guillermo"));

        //System.out.println(noneMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
                //.ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
                //.ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupedByGender =  people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        /*groupedByGender.forEach((g, p) -> {
            System.out.println(g);
            p.forEach(System.out::println);
        });*/

        // Chained get the oldest female's name

        Optional<String> oldestFemale = people.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemale.ifPresent(System.out::println);
    }

}
