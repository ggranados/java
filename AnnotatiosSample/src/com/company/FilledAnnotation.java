package com.company;

public @ interface FilledAnnotation {

    String name() default "Bob";
    int value() default 12;
    String[] args();
}
