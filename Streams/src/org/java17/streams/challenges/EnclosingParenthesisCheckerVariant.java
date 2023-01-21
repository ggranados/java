package org.java17.streams.challenges;

import java.util.LinkedList;
import java.util.Map;

import static java.util.Map.entry;

public class EnclosingParenthesisCheckerVariant {

    public static final String CHECK_FALSE = " was expected to check false";
    public static final String CHECK_TRUE = " was expected to check true";

    public Boolean check(String string){

        LinkedList<Character> stack = new LinkedList<>();
        Map<Character, Character> blockSymbols = Map.ofEntries(
                entry(')','('),
                entry(']','['),
                entry('}','{'),
                entry('>','<'));

        for(int i=0; i<string.length(); i++){
           Character current = string.charAt(i);

           if (blockSymbols.containsValue(current)){
               stack.push(current);
               continue;
           }

           if(blockSymbols.containsKey(current) &&
                   (stack.isEmpty() ||
                           !blockSymbols.get(current).equals(stack.pop()))){
               return false;
           }

        }

        return stack.isEmpty();
    }



    public static void main(String[] args) {

        EnclosingParenthesisCheckerVariant checker = new EnclosingParenthesisCheckerVariant();

        String stringToCheck = "yffgfh{[767(jhk)]}9877h";
        Boolean isEnclosed = checker.check(stringToCheck);
        assert isEnclosed : stringToCheck + CHECK_TRUE;

        stringToCheck = "([({<>})])";
        isEnclosed = checker.check(stringToCheck);
        assert isEnclosed : stringToCheck + CHECK_TRUE;

        stringToCheck = "()<>{}[]";
        isEnclosed = checker.check(stringToCheck);
        assert isEnclosed : stringToCheck + CHECK_TRUE;

        stringToCheck = "({)}";
        boolean isNotEnclosed = !checker.check(stringToCheck);
        assert isNotEnclosed : stringToCheck + CHECK_FALSE;

        stringToCheck = "())";
        isNotEnclosed = !checker.check(stringToCheck);
        assert isNotEnclosed : stringToCheck + CHECK_FALSE;

    }

}
