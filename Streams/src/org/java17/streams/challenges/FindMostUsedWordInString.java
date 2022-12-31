package org.java17.streams.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostUsedWordInString {

    public static void main(String[] args) {
        String string = "car house scar house house tree dog car cat dog car dog";

        String found = new FindMostUsedWordInString().find(string);

        assert "car".equals(found);
    }

    private String find(String string) {

        var group = Arrays.stream(string.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(group);

        var max = group.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));


        System.out.println(max);

        if(max.isEmpty()) return "";

        return max.get().getKey();
    }

}
