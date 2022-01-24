package com.company;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @ interface FilledAnnotation {

    String name() default "Bob";
    int value() default 12;
    String[] args();
}
