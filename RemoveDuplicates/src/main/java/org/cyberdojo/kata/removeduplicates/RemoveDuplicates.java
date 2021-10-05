package org.cyberdojo.kata.removeduplicates;

public class RemoveDuplicates {

    public static String[] removeDuplicates(String args[]) {

        String[] clean = new String[0];

        // Empty & Null case
        if(args == null)
            return new String[0];

        // Minimal case
        if(args.length == 1 || args.length == 0)
            return args;

        // Other cases
        clean = extendArray(clean);
        clean[0]=args[0];

        for(String s :args){
            boolean copied = false;
            for(int r = 0; r < clean.length; r++){
                if(s.equals(clean[r])) {
                    copied = true;
                    break;
                }
            }

            if(!copied){
                clean = extendArray(clean);
                clean[clean.length-1]=s;
            }
        }

        return clean;
    }

    private static String[] extendArray(String[] clean) {
        String[] copy = new String[clean.length + 1];
        System.arraycopy(clean, 0, copy, 0, clean.length);
        return copy;
    }
}
