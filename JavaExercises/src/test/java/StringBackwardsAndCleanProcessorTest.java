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
    public void shouldRevertAndCleanString(){
        String srt = "ABC#$%123";
        String result = processor.process(srt);

        assertEquals("321CBA",result);
    }
}