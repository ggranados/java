import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative approach
        /*
        List<Person> females = new ArrayList<>();

        for(Person person: people){
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

        groupedByGender.forEach((g, p) -> {
            System.out.println(g);
            p.forEach(System.out::println);
        });
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
