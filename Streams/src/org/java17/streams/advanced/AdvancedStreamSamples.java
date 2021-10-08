package org.java17.streams.advanced;

import org.java17.streams.pojo.Gender;
import org.java17.streams.pojo.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        var groupedBy = getPeople()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(groupedBy);
    }


    private static List<Person> getPeople() {
        return List.of(
                new Person("Guillermo", 38, Gender.MALE),
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
