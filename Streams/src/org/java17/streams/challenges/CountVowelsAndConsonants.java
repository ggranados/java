package org.java17.streams.challenges;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        String string = "abcde";

        CountVowelsAndConsonants counter = new CountVowelsAndConsonants();

        long vowelsCount = counter.countVowels(string);
        assert vowelsCount == 2 : "Vowels count doesn't match";

        long consonantCount = counter.countConsonants(string);
        assert consonantCount == 3 : "Consonants count doesn't match";


        string = "abcde234#$%";
        vowelsCount = counter.countVowels(string);
        assert vowelsCount == 2 : "Vowels count doesn't match";

        consonantCount = counter.countConsonants(string);
        assert consonantCount == 3 : "Consonants count doesn't match";

    }

    private Long countConsonants(String string) {
        return string.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(Character::toString)
                .filter(character -> !"aeiouy".contains(character))
                .count();
    }

    private Long countVowels(String string) {
        return string.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(Character::toString)
                .filter("aeiouy"::contains)
                .count();
    }
}
