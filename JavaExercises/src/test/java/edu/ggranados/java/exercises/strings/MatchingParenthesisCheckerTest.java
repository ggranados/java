package edu.ggranados.java.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingParenthesisCheckerTest {

    @Test
    void test(){
        MatchingParenthesisChecker checker = new MatchingParenthesisChecker();

        assertTrue(checker.test("()"));
        assertTrue(checker.test("(2242sdc)<d{}>"));
        assertTrue(checker.test("({[<>]})"));
        assertFalse(checker.test(")("));
        assertFalse(checker.test("{)<]}"));

    }

}