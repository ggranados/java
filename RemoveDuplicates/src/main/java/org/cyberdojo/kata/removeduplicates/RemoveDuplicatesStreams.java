package org.cyberdojo.kata.removeduplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesStreams {
    public static String[] removeDuplicates(String args[]) {

        // Empty & Null case
        if(args == null)
            return new String[0];

        // Minimal case
        if(args.length == 1 || args.length == 0)
            return args;

        return Arrays.stream(args)
                .collect(Collectors
                        .toCollection(TreeSet::new))
                .toArray(new String[0]);
    }

}
