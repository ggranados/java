package org.youtube.functionalprogramming.patterns.named_methods;

public class Main {

    public static void main(String[] args) {
        UserFacade facade = new UserFacade();
        facade.getAllUser().stream().forEach(System.out::println);
    }
}
