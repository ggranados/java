package org.linkedinlearning.functionalprogramming.fis;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Objects;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println(composeHashCodes("Hello","world"));
        System.out.println(composeHashCodes("Hello",null));
    }

    private static int composeHashCodes(Object a, Object b) {
        return a.hashCode() ^ b.hashCode();
    }

  
}
