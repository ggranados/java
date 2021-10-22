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
    }


}
