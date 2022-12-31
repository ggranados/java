package org.java17.streams.challenges;

import java.util.stream.IntStream;

public class PalindromeChecker {

    public static final String NOT_A_PALINDROME = "String %s is not a palindrome";
    public static final String A_PALINDROME = "String %s is a palindrome";

    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        var stringToCheck = "civIC";
        assert palindromeChecker.check(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);
        assert palindromeChecker.checkSequentially(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);
        assert palindromeChecker.checkDeclaratively(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);

        stringToCheck = "anitaLavaLaTina";
        assert palindromeChecker.check(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);
        assert palindromeChecker.checkSequentially(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);
        assert palindromeChecker.checkDeclaratively(stringToCheck) : String.format(NOT_A_PALINDROME, stringToCheck);

        stringToCheck = "ouiuthg";
        assert !palindromeChecker.check(stringToCheck) : String.format(A_PALINDROME, stringToCheck);
        assert !palindromeChecker.checkSequentially(stringToCheck) : String.format(A_PALINDROME, stringToCheck);
        assert !palindromeChecker.checkDeclaratively(stringToCheck) : String.format(A_PALINDROME, stringToCheck);

    }

    private Boolean check(String string) {

        String reversed = new StringBuilder(string.toLowerCase()).reverse().toString();

        return string.toLowerCase().equals(reversed);
    }

    private Boolean checkSequentially(String string){
        var reversed = new StringBuilder();
        var array = string.toLowerCase().toCharArray();

        for(int i=array.length-1; i>=0; i--){
            reversed.append(array[i]);
        }

        return string.toLowerCase().equals(reversed.toString());
    }

    private Boolean checkDeclaratively(String string){
        var normalized = string.toLowerCase();

        return IntStream.range(0, string.length()/2)
                .allMatch( i-> normalized.charAt(i) ==
                        normalized.charAt(
                                normalized.length()-1-i
                        )
                );

    }
}
