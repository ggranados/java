package edu.ggranados.java.exercises.strings;

import edu.ggranados.java.exercises.strings.StringBackwardsAndCleanProcessor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBackwardsAndCleanProcessorTest {

    private static StringBackwardsAndCleanProcessor processor;

    @BeforeAll
    public static void setUp(){
        processor = new StringBackwardsAndCleanProcessor();
    }

    @Test
    void shouldRevertAndCleanString(){
        String srt = "ABC#$%123";
        String result = processor.apply(srt);

        assertEquals("321CBA",result);
    }
}