package org.cyberdojo.kata.removeduplicates;

import java.util.*;

public class RemoveDuplicatesCollections {

    public static String[] removeDuplicates(String args[]) {

        // Empty & Null case
        if(args == null)
            return new String[0];

        // Minimal case
        if(args.length == 1 || args.length == 0)
            return args;

        // Other cases

        SortedSet set = new TreeSet(Comparator.naturalOrder());
        Collections.addAll(set, args);

        return (String[]) set.toArray(new String[0]);
    }
}
