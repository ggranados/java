package edu.ggranados.java.algorithms.sort.insert;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static edu.ggranados.java.algorithms.utils.IntegerUtils.getIntegerList;
import static edu.ggranados.java.algorithms.utils.IntegerUtils.isEqualOrGreaterThan;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertSorterIterativeTest {

    private final Logger logger = LoggerFactory.getLogger(InsertSorterIterativeTest.class);
    private final InsertSorterIterative sorter = new InsertSorterIterative();

    @Test
    void testSortWithFixedElement() {
        //Given
        final List<Integer> elements = Arrays.asList(8, 3, 7, 2, 5, 6, 4, 1, 0, 9);
        logger.info("Before: {}", elements);

        //When
        var sortedElements = sorter.sort(new ArrayList<>(elements));
        logger.info("After: {}", sortedElements);


        //Then
        var lastElement = sortedElements.stream()
                .reduce((a, b) -> {
                    assertTrue(isEqualOrGreaterThan(b, a),
                            b + " element is not equal or greater than previous " + a);
                    return b;
                });

        OptionalInt max = elements.stream()
                .mapToInt(v -> v).max();

        assertTrue(lastElement.isPresent(), "last element must be present");
        assertTrue(max.isPresent(), "max element must be present");

        assertEquals(max.getAsInt(),
                lastElement.get(),
                "Last element should be the max value");

        assertTrue(new HashSet<>(sortedElements).containsAll(elements)
                , "Should contain initial elements");
    }

    @Test
    void testSortWithRandomElement() {
        //Given
        final List<Integer> elements = getIntegerList(5);
        logger.info("Before: {}", elements);

        //When
        var sortedElements = sorter.sort(new ArrayList<>(elements));
        logger.info("After: {}", sortedElements);


        //Then
        var lastElement = sortedElements.stream()
                .reduce((a, b) -> {
                    assertTrue(isEqualOrGreaterThan(b, a),
                            b + " element is not equal or greater than previous " + a);
                    return b;
                });

        OptionalInt max = elements.stream()
                .mapToInt(v -> v).max();

        assertTrue(lastElement.isPresent(), "last element must be present");
        assertTrue(max.isPresent(), "max element must be present");

        assertEquals(max.getAsInt(),
                lastElement.get(),
                "Last element should be the max value");

        assertTrue(new HashSet<>(sortedElements).containsAll(elements)
                , "Should contain initial elements");
    }


}