package org.java17.streams.advanced;

import org.java17.streams.pojo.Person;
import org.java17.streams.pojo.User;
import java.util.Collections;
import java.util.Locale;
import java.util.TreeMap;
import java.util.stream.Collectors;
import static org.java17.streams.pojo.Person.getPeople;

public class AdvancedStreamSamples {

    public static void main(String[] args) {


        // Group by
        var groupedBy = getPeople()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender));

        //groupedBy.entrySet().stream().forEach(System.out::println);


        // Map
        var mapped = getPeople()
                .stream()
                .map(
                        p -> {
                            return new User(
                                    p.getName().toLowerCase(Locale.ROOT).replace(' ','.'),
                                    p.getName().substring(0,3)+p.getGender()+p.getAge());
                        }
                )
                .collect(Collectors.toList());

        //mapped.stream().forEach(System.out::println);

        // Map to unmodifiable after group by
        var groupedByThenMap = getPeople()
                .stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(Person::getGender),
                                c -> Collections.unmodifiableMap(c)
                        )
                );

        //System.out.println(groupedByThenMap);

        //group by then tree map of sets
        var groupedByThenTreeMap = getPeople()
                .stream()
                .collect(
                        Collectors.groupingBy(Person::getGender, TreeMap::new, Collectors.toSet())
                );
        System.out.println(groupedByThenTreeMap);
    }


}
