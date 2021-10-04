package org.cyberdojo.kata.removeduplicates;

public class RemoveDuplicates {

    public static String[] removeDuplicates(String args[]) {

        String[] clean = new String[0];

        // Empty & Null case
        if(args == null || args.length == 0)
            return new String[0];

        // Minimal case
        if(args.length == 1)
            return args;

        // Other cases
        for(String s :args){

            if(clean.length == 0){
                String[] copy = new String[clean.length + 1];
                System.arraycopy(clean, 0, copy, 0, clean.length);
                clean = copy;
                clean[0]=s;
                continue;
            }

            boolean copied = false;
            for(int r = 0; r < clean.length; r++){
                if(s.equals(clean[r])) {
                    copied = true;
                    break;
                }
            }

            if(!copied){
                String[] copy = new String[clean.length + 1];
                System.arraycopy(clean, 0, copy, 0, clean.length);
                clean = copy;
                clean[clean.length-1]=s;
            }

        }

        return clean;
    }
}
