package org.java17.streams.challenges;

import java.util.regex.Pattern;

public class InvertStringWIthStream {

    public static void main(String[] args) {
        String string = "Abc#$#%123";
        String inverted = new InvertStringWIthStream().invert(string);

        assert "321cbA".equals(inverted);
        System.out.println(String.format("inverted: %s",inverted));
    }

    Pattern pattern = Pattern.compile("[a-zA-Z0-9_]");

    private  String invert(String string) {

        StringBuilder sb = new StringBuilder();

        string.chars()
                .mapToObj(c->Character.toString(c))
                .filter(s-> pattern.matcher(s).matches())
                .forEach(s-> sb.append(s));

        return sb.reverse().toString();
    }


}
