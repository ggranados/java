package test.infogain.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private static Logger logger = LoggerFactory.getLogger(MyStackTest.class);
    private MyStack stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack();
        logger.info("Initialized stack");
    }

    @BeforeEach
    void beforeEach(){
        stack.clear();
    }

    @AfterEach
    void afterEach(){
        logger.info(stack.toString());
    }

    @Test
    @DisplayName("Pushing into stack should not throw exception for a instantiated stack")
    void pushThrowExceptionIfStackIsNull(){
        Integer a = Integer.valueOf(4);
        assertDoesNotThrow(()-> stack.push(a));
    }

    @Test
    @DisplayName("Top should be latest pushed element")
    void topShouldBeLatestPushedElement(){
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);
        Integer c = Integer.valueOf(3);
        Integer d = Integer.valueOf(4);

        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);

        Integer res = stack.top();

        assertEquals(d,res,()-> "Last value " + d + " was expected");

    }

    @Test
    @DisplayName("Top after pop should be previous pushed element")
    void topAfterPopShouldBePreviousPushedElement(){
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);
        Integer c = Integer.valueOf(3);
        Integer d = Integer.valueOf(4);

        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.push(d);
        Integer pop = stack.pop();

        Integer res = stack.top();

        assertEquals(d,pop,()-> "Last value " + c + " was expected");
        assertEquals(c,res,()-> "Previous value " + c + " was expected");
    }

    @Test
    @DisplayName("Test top immutability")
    void testImmutableTop(){
        Integer a = Integer.valueOf(1);

        stack.push(a);

        Integer res = stack.top();
        res = Integer.valueOf(10);

        assertNotEquals(a,res,()-> "Input value " + a + " should not be changed after top it");
    }
}