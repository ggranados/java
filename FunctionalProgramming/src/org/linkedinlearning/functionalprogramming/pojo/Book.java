package org.linkedinlearning.functionalprogramming.pojo;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Book {

    private final String title;
    private final List<String> words;

    private Book(String title, List<String> words) {
        this.title = title;
        this.words = words;
    }

    public List<String> getWords() {
        return Collections.unmodifiableList(words);
    }

    public static Book newBook(String title, List<String> words){
        return new Book(title,words);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", words=" + words +
                '}';
    }

    public static Set<Book> getData(){
        var books =
                Stream.iterate(0, i-> i+1)
                        .limit(5)
                        .map( i -> new Book("Book No."+i,List.of("uno","dos","tres")))
                        .peek(System.out::println)
                        .collect(Collectors.toSet());

        return books;
    }

    public static void main(String[] args) {
        Book.getData();
    }

}
