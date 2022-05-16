package edu.ggranados.java.algorithms.sort;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    InsertSort insertSort = new InsertSort();
    ArrayList<Integer> elements = new ArrayList<>();

    @Test
    void testSort(){
        //Given
        elements.addAll(Arrays.asList(33,2,5,4,67,4,2,1,46,7,34));
        System.out.println(elements);

        //When
        var sortedElements = insertSort.sort(elements);
        System.out.println(sortedElements);


        //Then
        var lastElement = sortedElements.stream()
                .reduce((a,b) -> {
                    assertTrue(isEqualOrGreaterThan(b, a),
                            b + " element is not equal or greater than previous " + a);
                    return b;
                });
        assertEquals(elements.stream().mapToInt(v -> v).max().getAsInt(),
                lastElement.get(),
                "Last element should be the max value");
    }

    @Test
    void testSortRecursive(){
        //Given
        elements.addAll(Arrays.asList(33,2,5,4,67,4,2,1,46,7,34));
        System.out.println(elements);

        //When
        var sortedElements = insertSort.sortRecursive(elements,1);
        System.out.println(sortedElements);


        //Then
        var lastElement = sortedElements.stream()
                .reduce((a,b) -> {
                    assertTrue(isEqualOrGreaterThan(b, a),
                            b + " element is not equal or greater than previous " + a);
                    return b;
                });
        assertEquals(elements.stream().mapToInt(v -> v).max().getAsInt(),
                lastElement.get(),
                "Last element should be the max value");
    }


    private boolean isEqualOrGreaterThan(Integer next, Integer prev) {
        return (next >= prev);
    }


}