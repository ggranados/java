package edu.ggranados.java.exercises.strings;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class StringBackwardsAndCleanProcessor implements Processor<String, String> {

    private final Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

    public String process(String str) {
        StringBuilder sb = new StringBuilder();
/*
        for(Character ch: str.toCharArray()){
            String strChar = ch.toString();
            if(!isSpecialChar(strChar))
                sb.append(strChar);
        }
*/
        Predicate<String> isSpecialPredicate =
                strChar -> special.matcher(strChar).find();

        String cleaned = str.chars()
               .mapToObj(c -> (char)c)
               .map(ch -> Character.toString(ch))
               .filter(isSpecialPredicate.negate())
               .collect(Collectors.joining());

        return sb.append(cleaned).reverse().toString();
    }

    /*
    private boolean isSpecialChar(String strChar) {
        return special.matcher(strChar).find();
    }
    */
}
