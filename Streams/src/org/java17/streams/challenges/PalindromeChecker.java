package org.java17.streams.challenges;

import java.util.Locale;
import java.util.stream.IntStream;

public class PalindromeChecker {

    public static void main(String[] args) {
        var palindrome = "civIC";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        var result = palindromeChecker.checkDeclaratively(palindrome);
        assert result;

        var noPalindrome = "sdfhgfg";
        result = palindromeChecker.checkDeclaratively(noPalindrome);
        assert !result;

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
                .allMatch((i)-> normalized.charAt(i) == normalized.charAt(normalized.length()-1-i));

    }
}
