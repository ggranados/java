package edu.ggranados.java.exercises.strings;

import java.util.*;
import java.util.function.Function;

public class MostRepeatedWordFinder implements Function<String, String> {
    private String regex;
    private List<String> ignoredWords;

    public MostRepeatedWordFinder(){
        setRegex("[^\\p{L}\\p{Digit}]+");
        setIgnoredWords(List.of("the","a","or","an","it","and","but","is","are","of",
                "on","to","was","were","in","that","i","your","his","their","her","you","me","they","at","be"));
    }

    @Override
    public String apply(String s) {

        return processInternal(s);

    }

    private String processInternal(String s) {
        return getFirstMaxCountedWord(
                countWords(
                        splitWords(s)));
    }

    private String getFirstMaxCountedWord(Map<String, Integer> mapped) {

        String key = "";
        Integer max = 0;

        for (Map.Entry<String,Integer> e: mapped.entrySet()) {
            if(e.getValue() > max){
                key = e.getKey();
                max = e.getValue();
            }

            if(max.equals(mapped.values().stream().max(Comparator.naturalOrder()).orElse(0)))
                break;

        }

        return key;
    }

    private Map<String, Integer> countWords(String[] split) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s: split) {
            if(!getIgnoredWords().contains(s))
                map.put(s, map.get(s) == null? 1 : map.get(s)+1);
        }

        return map;
    }

    private String[] splitWords(String s) {
        return s.toLowerCase().split(getRegex());
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public List<String> getIgnoredWords() {
        return ignoredWords;
    }

    public void setIgnoredWords(List<String> ignoredWords) {
        this.ignoredWords = ignoredWords;
    }
}
