package edu.ggranados.java.exercises.strings;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class StringBackwardsAndCleanProcessor implements UnaryOperator<String> {

    private final Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

    public String apply(String str) {
        StringBuilder sb = new StringBuilder();

        Predicate<String> isSpecialPredicate =
                strChar -> special.matcher(strChar).find();

        String cleaned = str.chars()
               .mapToObj(c -> (char)c)
               .map(String::valueOf)
               .filter(isSpecialPredicate.negate())
               .collect(Collectors.joining());

        return sb.append(cleaned).reverse().toString();
    }

}
