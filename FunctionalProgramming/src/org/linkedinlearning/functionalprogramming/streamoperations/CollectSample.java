package org.linkedinlearning.functionalprogramming.streamoperations;

import org.linkedinlearning.functionalprogramming.pojo.Book;
import org.linkedinlearning.functionalprogramming.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectSample {
    public static void main(String[] args) {

        var result = Arrays.stream(Employee.getData())
                .unordered()
                .parallel()
                .flatMap(e-> Stream.of(e.getName()))
                .collect(
                    Collectors.joining(",")
                );

        System.out.println(result);


        var collection = Arrays.stream(Employee.getData())
                .unordered()
                .parallel()
                .collect(
                        () -> new ArrayList< Book >(),
                        (ArrayList< Book > l, Employee e) -> l.add(Book.newBook(
                                "Book of:"+e.getName(), List.of(result.split(",")))),
                        (ArrayList< Book > l1, ArrayList< Book > l2) -> l1.addAll(l2)
                );

        System.out.println(collection);

        var tree = Arrays.stream(Employee.getData())
                .collect(
                        Collectors.toCollection(
                                () -> new TreeSet<Employee>(
                                        Comparator.comparing(Employee::getSalary)
                                )
                        )
                );
        System.out.println(tree);


        var map = Arrays.stream(Employee.getData())
                .collect(
                        Collectors.toMap(
                                Employee::getName,
                                Employee::getSalary,
                                (n1, n2) -> n1+n2
                        )
                );

        System.out.println(map);

        var grouped = Arrays.stream(Employee.getData())
                .collect(
                        Collectors.groupingBy(
                                e -> e.getSalary()/1500
                        )
                );

        System.out.println(grouped);


        var partitioned = Arrays.stream(Employee.getData())
                .collect(
                        Collectors.partitioningBy(
                                e -> "ABC".contains(String.valueOf(e.getName().charAt(0)))
                        )
                );

        System.out.println(partitioned);
    }


}
