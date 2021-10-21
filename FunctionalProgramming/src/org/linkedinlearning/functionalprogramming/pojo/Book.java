package org.linkedinlearning.functionalprogramming.pojo;

import java.util.List;

public class Book {

    private final String title;
    private final List<String> words;

    private Book(String title, List<String> words) {
        this.title = title;
        this.words = words;
    }

    static Book newBook(String title, List<String> words){
        return new Book(title,words);
    }


}
