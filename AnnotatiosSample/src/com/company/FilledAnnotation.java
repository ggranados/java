package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @ interface FilledAnnotation {

    String name() default "Bob";
    int value() default 12;
    String[] args();
}
