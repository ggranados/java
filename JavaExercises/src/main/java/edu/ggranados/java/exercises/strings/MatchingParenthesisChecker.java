package edu.ggranados.java.exercises.strings;

import java.util.Map;
import java.util.Stack;
import java.util.function.Predicate;

public class MatchingParenthesisChecker implements Predicate<String>{

    @Override
    public boolean test(String s) {
        return isParenthesisMatched(s);
    }

    private boolean isParenthesisMatched(String s) {

        final Map<Character, Character> symbols = Map.of('}', '{'
                ,')','('
                ,'>', '<'
                ,']', '[');
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(symbols.containsValue(c))
                stack.push(c);

            if(symbols.containsKey(c)
                    && (stack.empty() || symbols.get(c) != stack.pop()))
                return false;

        }

        return stack.empty();
    }
}
