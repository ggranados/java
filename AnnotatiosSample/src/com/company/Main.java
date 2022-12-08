package com.company;

@FilledAnnotation(value = 13, args = {"java","17","annotations"})
public class Main {

    @EmptyAnnotation
    private static final int THING = 3;

    @EmptyAnnotation
    public static void main(String[] args) {
	// write your code here
    }

    public static void readValue(@EmptyAnnotation String value){

    }

    public static void doSomething(){
        System.out.println("Something");
    }
}
