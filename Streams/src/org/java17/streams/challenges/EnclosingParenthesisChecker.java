package org.java17.streams.challenges;

import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.IntStream;

public class EnclosingParenthesisChecker {

    private static final int OPEN_PAR = 40;
    private static final int CLOSE_PAR = 41;
    private static final int OPEN_SQR_BR = 91;
    private static final int CLOSE_SQR_BR = 93;
    private static final int OPEN_BRK = 123;
    private static final int CLOSE_BRK = 125;
    private LinkedList <Integer> openingChars = new LinkedList <>();
    private LinkedList <Integer> closingChars = new LinkedList <>();

    public static void main(String[] args) {


        EnclosingParenthesisChecker checker = new EnclosingParenthesisChecker();

        String stringToCheck = "yffgfh{[767(jhk)]}9877h";
        Boolean isEnclosed = checker.check(stringToCheck);
        assert isEnclosed : stringToCheck + " was expected to check true";

        stringToCheck = "([({})])";
        isEnclosed = checker.check(stringToCheck);
        assert isEnclosed : stringToCheck + " was expected to check true";

        stringToCheck = "({)}";
        boolean isNotEnclosed = !checker.check(stringToCheck);
        assert isNotEnclosed : stringToCheck + " was expected to check false";

        stringToCheck = "())";
        isNotEnclosed = !checker.check(stringToCheck);
        assert isNotEnclosed : stringToCheck + " was expected to check false";
    }

    private  Boolean check(String stringToCheck) {

        cleanQueues();

        classifyIntoQueues(stringToCheck);

        if(openingChars.size() != closingChars.size())
            return Boolean.FALSE;

        return areAllMatching();
    }

    private void classifyIntoQueues(String stringToCheck) {
        stringToCheck.chars()
                .filter(this::isValidChar)
                .forEach(this::classify);
    }

    private void cleanQueues() {
        openingChars.clear();
        closingChars.clear();
    }

    private Boolean areAllMatching() {

        return IntStream.range(0,openingChars.size())
                .allMatch(i -> isAMatchedPair(openingChars.pollLast(),
                        Objects.requireNonNull(closingChars.pollFirst())));

    }

    private boolean isAMatchedPair(Integer opening, Integer closing) {
       return switch(opening){
            case OPEN_PAR -> closing.equals(CLOSE_PAR);
            case OPEN_BRK -> closing.equals(CLOSE_BRK);
            case OPEN_SQR_BR -> closing.equals(CLOSE_SQR_BR);
            default -> throw new IllegalStateException("Invalid opening character" + Character.toString(opening));
        };
    }

    private void classify(int i) {
        if(isOpeningChar(i))
            openingChars.add(i);
        else
            closingChars.add(i);
    }

    private boolean isOpeningChar(int i) {
        return i == OPEN_PAR ||
                i == OPEN_BRK ||
                i == OPEN_SQR_BR;
    }

    private boolean isClosingChar(int i) {
        return i == CLOSE_PAR ||
                i == CLOSE_BRK ||
                i == CLOSE_SQR_BR;
    }

    private boolean isValidChar(int i) {
        return isOpeningChar(i) || isClosingChar(i);
    }


}
