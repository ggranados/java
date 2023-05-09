package edu.ggranados.java.algorithms.sort;

import edu.ggranados.java.algorithms.sort.insert.InsertSorterIterative;
import edu.ggranados.java.algorithms.sort.insert.InsertSorterRecursive;
import edu.ggranados.java.algorithms.sort.merge.MergeSorter;
import edu.ggranados.java.algorithms.utils.IntegerUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class SortPerformanceTest{

    private final Logger logger = LoggerFactory.getLogger(SortPerformanceTest.class);

    private final Sorter insertSorterIterative = new InsertSorterIterative();
    private final Sorter insertSorterRecursive = new InsertSorterRecursive();
    private final Sorter mergeSorter = new MergeSorter();

    @Test
    public void testSortImplementations(){
        SortedMap<String, Double> comparingMap = new TreeMap<>();
        comparingMap.put(insertSorterIterative.getClass().getSimpleName(), evaluateImplementation(insertSorterIterative));
        //comparingMap.put(insertSorterRecursive.getClass().getSimpleName(), evaluateImplementation(insertSorterRecursive));
        comparingMap.put(mergeSorter.getClass().getSimpleName(), evaluateImplementation(mergeSorter));
        logger.info(comparingMap.toString());
    }


    private double evaluateImplementation(Sorter sorter) {
        logger.info("{} Sorting...", sorter.getClass().getSimpleName());
        int elementCount = 100_000; // Number of elements to sort
        int maxElementValue = 1_000_000; // Maximum value of an element
        List<Integer> elements = IntegerUtils.getIntegerList(elementCount, maxElementValue);

        long startTime = System.nanoTime();
        List<Integer> sortedElements = sorter.sort(elements);
        long endTime = System.nanoTime();
        double total = (endTime - startTime) / 1000000;
        logger.info("{} Sorted {} elements in {} milliseconds\n", sorter.getClass().getSimpleName(), elementCount, total);
        return total;
    }
}
