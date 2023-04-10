package edu.ggranados.java.algorithms.sort.insert;

import edu.ggranados.java.algorithms.sort.Sorter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("insertSorterRecursive")
public class InsertSorterRecursive implements Sorter<Integer> {
    public static final int ZERO = 0;
    public static final int FIRST_CURRENT_INDEX = 1;

    @Override
    public List<Integer> sort(List<Integer> elements){
        return sort(elements, FIRST_CURRENT_INDEX);
    }

    private List<Integer> sort(List<Integer> elements, int currentIndex){

        if (sizeHasBeenExceeded(elements.size(), currentIndex)) {
            return elements;
        }

        int currentElement = elements.get(currentIndex);
        int fromIndex = currentIndex - 1;
        replaceBackwards(currentElement, elements, fromIndex);

        return sort(elements, ++currentIndex);
    }

    private boolean sizeHasBeenExceeded(int size, int currentIndex) {
        return !isLowerThan(currentIndex, size);
    }

    private boolean isLowerThan( int a, int b) {
        return a < b;
    }

    private void replaceBackwards(int currentElement, List<Integer> elements, int fromIndex){

        if(isGreaterOrEqualsThan(fromIndex, ZERO)) {
            Integer elementBackwards = elements.get(fromIndex);
            if (isLowerThan(currentElement, elementBackwards)) {
                elements.set(oneIndexAhead(fromIndex), elementBackwards);
                elements.set(fromIndex, currentElement);
                replaceBackwards(currentElement, elements, --fromIndex);
            }
        }

    }

    private int oneIndexAhead(int fromIndex) {
        return fromIndex + 1;
    }

    private boolean isGreaterOrEqualsThan(int a, int b) {
        return a >= b;
    }

}
