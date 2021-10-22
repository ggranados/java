package org.linkedinlearning.functionalprogramming.fis;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Objects;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println(composeHashCodes3("Hello","world"));
        System.out.println(composeHashCodes3("Hello",null));
    }

    private static int composeHashCodes(Object a, Object b) {
        return a.hashCode() ^ b.hashCode();
    }

    // executes getApplicationStatus each time a var is evaluated, even if not null
    private static int composeHashCodes2(Object a, Object b) {
        Objects.requireNonNull(a, "a may be not null!" + getApplicationStatus());
        Objects.requireNonNull(b, "b may be not null!" + getApplicationStatus());

        return a.hashCode() ^ b.hashCode();
    }

    private static int composeHashCodes3(Object a, Object b) {
        Objects.requireNonNull(a, () -> "a may be not null!" + getApplicationStatus());
        Objects.requireNonNull(b, () -> "b may be not null!" + getApplicationStatus());

        return a.hashCode() ^ b.hashCode();
    }


    private static String getApplicationStatus() {
        System.out.println("getApplicationStatus");
        return "It's " + LocalTime.now();
    }

}
