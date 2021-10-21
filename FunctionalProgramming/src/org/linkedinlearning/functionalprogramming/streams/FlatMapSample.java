package org.linkedinlearning.functionalprogramming.streams;

import org.linkedinlearning.functionalprogramming.pojo.Book;

public class FlatMapSample {

    public static void main(String[] args) {

        var books = Book.getData();

        books.stream()
                .flatMap(b->b.getWords().stream())
                .distinct()
                .forEach(System.out::println);

    }
}
